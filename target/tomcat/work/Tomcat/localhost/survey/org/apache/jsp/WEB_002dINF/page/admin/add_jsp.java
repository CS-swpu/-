/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-03-17 03:38:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.page.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title>layui</title>\r\n");
      out.write("    <meta name=\"renderer\" content=\"webkit\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../static/lib/layui-src/css/layui.css\" media=\"all\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../static/css/public.css\" media=\"all\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"layuimini-container\">\r\n");
      out.write("    <div class=\"layuimini-main\">\r\n");
      out.write("        <form class=\"layui-form\" action=\"\">\r\n");
      out.write("            <div class=\"layui-form-item\">\r\n");
      out.write("                <label class=\"layui-form-label\">账号</label>\r\n");
      out.write("                <div class=\"layui-input-block\">\r\n");
      out.write("                    <input type=\"text\" name=\"account\" lay-verify=\"required\" autocomplete=\"off\" placeholder=\"请输入账号\" class=\"layui-input\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"layui-form-item\">\r\n");
      out.write("                <label class=\"layui-form-label\">密码</label>\r\n");
      out.write("                <div class=\"layui-input-block\">\r\n");
      out.write("                    <input type=\"text\" name=\"password\" lay-verify=\"required\" autocomplete=\"off\" placeholder=\"请输入密码\" value=\"123456\" class=\"layui-input\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"layui-form-item\">\r\n");
      out.write("                <label class=\"layui-form-label\">姓名</label>\r\n");
      out.write("                <div class=\"layui-input-block\">\r\n");
      out.write("                    <input type=\"text\" name=\"name\" lay-verify=\"required\" autocomplete=\"off\" placeholder=\"请输入姓名\" class=\"layui-input\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"layui-form-item\">\r\n");
      out.write("                <label class=\"layui-form-label\">手机</label>\r\n");
      out.write("                <div class=\"layui-input-block\">\r\n");
      out.write("                    <input type=\"text\" name=\"phone\" lay-verify=\"phone\" value=\"18533333333\" autocomplete=\"off\" placeholder=\"请输入手机\" class=\"layui-input\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"layui-form-item layui-form-text\">\r\n");
      out.write("                <label class=\"layui-form-label\">备注</label>\r\n");
      out.write("                <div class=\"layui-input-block\">\r\n");
      out.write("                    <textarea placeholder=\"请输入备注\" name=\"remark\" class=\"layui-textarea\"></textarea>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"layui-form-item\">\r\n");
      out.write("                <div class=\"layui-input-block\">\r\n");
      out.write("                    <button type=\"reset\" class=\"layui-btn layui-btn-primary\">重置</button>\r\n");
      out.write("                    <button class=\"layui-btn\" lay-submit=\"\" lay-filter=\"demo1\">立即提交</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script src=\"../static/lib/layui-src/layui.js\" charset=\"utf-8\"></script>\r\n");
      out.write("<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->\r\n");
      out.write("<script>\r\n");
      out.write("    layui.use(['form','jquery','layer'], function () {\r\n");
      out.write("        var form = layui.form,$=layui.jquery,layer=layui.layer,layer = layui.layer;\r\n");
      out.write("        //监听提交\r\n");
      out.write("        var index = parent.layer.getFrameIndex(window.name); //获取窗口索引\r\n");
      out.write("        form.on('submit(demo1)', function (data) {\r\n");
      out.write("            $.ajax({\r\n");
      out.write("               url:\"create\",\r\n");
      out.write("               type:\"POST\",\r\n");
      out.write("               contentType:'application/json',\r\n");
      out.write("               dataType:'json',\r\n");
      out.write("               data:JSON.stringify(data.field),\r\n");
      out.write("               success:function(data){\r\n");
      out.write("                   layer.msg(data.msg,{time:500},\r\n");
      out.write("                   function(){\r\n");
      out.write("                       parent.layer.close(index);\r\n");
      out.write("                   });\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("            return false;\r\n");
      out.write("        });\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
