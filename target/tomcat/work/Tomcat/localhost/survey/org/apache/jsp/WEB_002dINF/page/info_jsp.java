/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2021-01-06 08:07:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.page;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class info_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Title</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        .layui-card-body ul {\r\n");
      out.write("            list-style: none;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .layui-card-body ul li {\r\n");
      out.write("            float: left;\r\n");
      out.write("            padding: 5px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .layui-card-body ul li:hover {\r\n");
      out.write("            background-color: #f0f0f0;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .layui-card-body ul li table {\r\n");
      out.write("            width: 150px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .layui-card-body ul li table i {\r\n");
      out.write("            font-size: 36px;\r\n");
      out.write("            color: #1aa094\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .layui-card-body ul li table .number {\r\n");
      out.write("            font-size: 24px;\r\n");
      out.write("            color: red\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .layui-card-body ul li table .txt {\r\n");
      out.write("            color: #888888;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("    <link rel=\"icon\" href=\"images/favicon.ico\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"static/lib/layui-src/css/layui.css\" media=\"all\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"static/css/layuimini.css?v=2.0.4.2\" media=\"all\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"static/css/themes/default.css\" media=\"all\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"static/lib/font-awesome-4.7.0/css/font-awesome.min.css\" media=\"all\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"layui-fluid\">\r\n");
      out.write("\r\n");
      out.write("    <div class=\"layui-row layui-col-space15\" style=\"margin-top: 10px;\">\r\n");
      out.write("        <div class=\"layui-col-md12\">\r\n");
      out.write("            <div class=\"layui-card\">\r\n");
      out.write("                <div class=\"layui-card-header\">个人资料</div>\r\n");
      out.write("                <div class=\"layui-card-body\">\r\n");
      out.write("                    <div style=\"height: 520px\">\r\n");
      out.write("                        <form class=\"layui-form\">\r\n");
      out.write("                                <div class=\"layui-form-item\">\r\n");
      out.write("                                    <label class=\"layui-form-label\">ID</label>\r\n");
      out.write("                                    <div class=\"layui-input-block\">\r\n");
      out.write("                                        <input class=\"layui-input\" readonly value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${admin.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"layui-form-item\">\r\n");
      out.write("                                    <label class=\"layui-form-label\">账号</label>\r\n");
      out.write("                                    <div class=\"layui-input-block\">\r\n");
      out.write("                                        <input class=\"layui-input\" readonly value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${admin.account}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"layui-form-item\">\r\n");
      out.write("                                    <label class=\"layui-form-label\">姓名</label>\r\n");
      out.write("                                    <div class=\"layui-input-block\">\r\n");
      out.write("                                        <input class=\"layui-input\" readonly value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${admin.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"layui-form-item\">\r\n");
      out.write("                                    <label class=\"layui-form-label\">手机</label>\r\n");
      out.write("                                    <div class=\"layui-input-block\">\r\n");
      out.write("                                        <input class=\"layui-input\" readonly value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${admin.phone}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"layui-form-item\">\r\n");
      out.write("                                    <label class=\"layui-form-label\">备注</label>\r\n");
      out.write("                                    <div class=\"layui-input-block\">\r\n");
      out.write("                                        <input class=\"layui-input\" readonly value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${admin.remark}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<script>\r\n");
      out.write("    layui.use(['form'], function () {\r\n");
      out.write("\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
