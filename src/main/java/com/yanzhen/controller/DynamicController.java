package com.yanzhen.controller;

import com.yanzhen.entity.Question;
import com.yanzhen.entity.Survey;
import com.yanzhen.service.QuestionService;
import com.yanzhen.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

@Controller
public class DynamicController {

    @Autowired
    private SurveyService surveyService;

    @Autowired
    private QuestionService questionService;

    @GetMapping("/new")
    public String getNew(String title,Integer type,HttpServletRequest httpServletRequest){
        List<Survey> list = surveyService.queryNew(title);
        httpServletRequest.setAttribute("list",list);
        httpServletRequest.setAttribute("type",type);
        return  "new";
    }

    @GetMapping("/hot")
    public String getHot(String title,Integer type,HttpServletRequest httpServletRequest){
        List<Survey> list = surveyService.queryHot(title);
        httpServletRequest.setAttribute("list",list);
        httpServletRequest.setAttribute("type",type);
        return  "hot";
    }

    @GetMapping("/dy/{uuid}")
    public String preview(@PathVariable("uuid") String uuid, ModelMap modelMap,HttpServletRequest request) {
        Survey param = new Survey();
        param.setState(Survey.state_exec);
        List<Survey> list = surveyService.queryAll(param);
        Survey entity = null;
        for (Survey survey : list) {
            if (survey.getUrl() != null && survey.getUrl().contains(uuid)) {
                entity = survey;
            }
        }
        if (entity == null) {
            modelMap.addAttribute("msg", "你要访问的问卷已过期或不存在");
            return "error";
        } else {

            //密码访问
            if(entity.getRules()==1){
                modelMap.put("required","1");//必须使用密码
                modelMap.put("password",entity.getPassword());
            }else{
                modelMap.put("required","0");//不需要密码
            }

            //限制ip验证
            String ips = entity.getIps();
            boolean flag = false;
            if(ips != null){
                String[] split = ips.split("/");
                String currIp = getIpAddr(request);
                for (String s : split) {
                    if (s.equals(currIp)) {
                        flag = true;
                    }
                }
            }
            if (flag) {
                modelMap.addAttribute("msg", "IP限制了，不可访问");
                return "error";
            } else {
                Question question = new Question();
                question.setSurveyId(entity.getId());
                //查询一个问卷中的所有问题及选项
                List<Question> questions = questionService.query(question);
                //将问题设置为survey的属性
                entity.setQuestions(questions);
                modelMap.addAttribute("survey", entity);
                return "survey/exec";
            }

        }
    }

    @GetMapping("/dy/success")
    public String success(){
        return "survey/success";
    }


    /**
     * 获取当前网络ip
     * @param request
     * @return
     */
    public String getIpAddr(HttpServletRequest request){
        String ipAddress = request.getHeader("x-forwarded-for");
        if(ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
            ipAddress = request.getHeader("Proxy-Client-IP");
        }
        if(ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
            ipAddress = request.getHeader("WL-Proxy-Client-IP");
        }
        if(ipAddress == null || ipAddress.length() == 0 || "unknown".equalsIgnoreCase(ipAddress)) {
            ipAddress = request.getRemoteAddr();
            if(ipAddress.equals("127.0.0.1") || ipAddress.equals("0:0:0:0:0:0:0:1")){
                //根据网卡取本机配置的IP
                InetAddress inet=null;
                try {
                    inet = InetAddress.getLocalHost();
                } catch (UnknownHostException e) {
                    e.printStackTrace();
                }
                ipAddress= inet.getHostAddress();
            }
        }
        //对于通过多个代理的情况，第一个IP为客户端真实IP,多个IP按照','分割
        if(ipAddress!=null && ipAddress.length()>15){ //"***.***.***.***".length() = 15
            if(ipAddress.indexOf(",")>0){
                ipAddress = ipAddress.substring(0,ipAddress.indexOf(","));
            }
        }
        return ipAddress;
    }

}
