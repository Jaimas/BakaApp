/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.28
 * Generated at: 2015-11-11 13:58:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/Users/Paulius/Documents/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/BakApp/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153374282000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1447228670014L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
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
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<link href=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Navigation -->\r\n");
      out.write("\t\t<nav class=\"navbar navbar-default navbar-static-top\" role=\"navigation\"\r\n");
      out.write("\t\t\tstyle=\"margin-bottom: 0\">\r\n");
      out.write("\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\r\n");
      out.write("\t\t\t\t\tdata-target=\".navbar-collapse\">\r\n");
      out.write("\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span> <span\r\n");
      out.write("\t\t\t\t\t\tclass=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span\r\n");
      out.write("\t\t\t\t\t\tclass=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t<a class=\"navbar-brand\" href=\"index.html\">SB Admin v2.0</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- /.navbar-header -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<ul class=\"nav navbar-top-links navbar-right\">\r\n");
      out.write("\t\t\t\t<li class=\"dropdown\"><a class=\"dropdown-toggle\"\r\n");
      out.write("\t\t\t\t\tdata-toggle=\"dropdown\" href=\"#\"> <i\r\n");
      out.write("\t\t\t\t\t\tclass=\"fa fa-envelope fa-fw\"></i> <i class=\"fa fa-caret-down\"></i>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu dropdown-messages\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<strong>John Smith</strong> <span class=\"pull-right text-muted\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<em>Yesterday</em>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div>Lorem ipsum dolor sit amet, consectetur adipiscing\r\n");
      out.write("\t\t\t\t\t\t\t\t\telit. Pellentesque eleifend...</div>\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"divider\"></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<strong>John Smith</strong> <span class=\"pull-right text-muted\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<em>Yesterday</em>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div>Lorem ipsum dolor sit amet, consectetur adipiscing\r\n");
      out.write("\t\t\t\t\t\t\t\t\telit. Pellentesque eleifend...</div>\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"divider\"></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<strong>John Smith</strong> <span class=\"pull-right text-muted\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<em>Yesterday</em>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div>Lorem ipsum dolor sit amet, consectetur adipiscing\r\n");
      out.write("\t\t\t\t\t\t\t\t\telit. Pellentesque eleifend...</div>\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"divider\"></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"text-center\" href=\"#\"> <strong>Read\r\n");
      out.write("\t\t\t\t\t\t\t\t\tAll Messages</strong> <i class=\"fa fa-angle-right\"></i>\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t</ul> <!-- /.dropdown-messages --></li>\r\n");
      out.write("\t\t\t\t<!-- /.dropdown -->\r\n");
      out.write("\t\t\t\t<li class=\"dropdown\"><a class=\"dropdown-toggle\"\r\n");
      out.write("\t\t\t\t\tdata-toggle=\"dropdown\" href=\"#\"> <i class=\"fa fa-tasks fa-fw\"></i>\r\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-caret-down\"></i>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu dropdown-tasks\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<strong>Task 1</strong> <span class=\"pull-right text-muted\">40%\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tComplete</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"progress progress-striped active\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"progress-bar progress-bar-success\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\trole=\"progressbar\" aria-valuenow=\"40\" aria-valuemin=\"0\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\taria-valuemax=\"100\" style=\"width: 40%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"sr-only\">40% Complete (success)</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"divider\"></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<strong>Task 2</strong> <span class=\"pull-right text-muted\">20%\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tComplete</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"progress progress-striped active\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"progress-bar progress-bar-info\" role=\"progressbar\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\taria-valuenow=\"20\" aria-valuemin=\"0\" aria-valuemax=\"100\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tstyle=\"width: 20%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"sr-only\">20% Complete</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"divider\"></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<strong>Task 3</strong> <span class=\"pull-right text-muted\">60%\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tComplete</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"progress progress-striped active\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"progress-bar progress-bar-warning\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\trole=\"progressbar\" aria-valuenow=\"60\" aria-valuemin=\"0\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\taria-valuemax=\"100\" style=\"width: 60%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"sr-only\">60% Complete (warning)</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"divider\"></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<strong>Task 4</strong> <span class=\"pull-right text-muted\">80%\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tComplete</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"progress progress-striped active\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"progress-bar progress-bar-danger\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\trole=\"progressbar\" aria-valuenow=\"80\" aria-valuemin=\"0\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\taria-valuemax=\"100\" style=\"width: 80%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"sr-only\">80% Complete (danger)</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"divider\"></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"text-center\" href=\"#\"> <strong>See\r\n");
      out.write("\t\t\t\t\t\t\t\t\tAll Tasks</strong> <i class=\"fa fa-angle-right\"></i>\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t</ul> <!-- /.dropdown-tasks --></li>\r\n");
      out.write("\t\t\t\t<!-- /.dropdown -->\r\n");
      out.write("\t\t\t\t<li class=\"dropdown\"><a class=\"dropdown-toggle\"\r\n");
      out.write("\t\t\t\t\tdata-toggle=\"dropdown\" href=\"#\"> <i class=\"fa fa-bell fa-fw\"></i>\r\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-caret-down\"></i>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu dropdown-alerts\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fa fa-comment fa-fw\"></i> New Comment <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"pull-right text-muted small\">4 minutes ago</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"divider\"></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fa fa-twitter fa-fw\"></i> 3 New Followers <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"pull-right text-muted small\">12 minutes ago</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"divider\"></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fa fa-envelope fa-fw\"></i> Message Sent <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"pull-right text-muted small\">4 minutes ago</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"divider\"></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fa fa-tasks fa-fw\"></i> New Task <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"pull-right text-muted small\">4 minutes ago</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"divider\"></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"fa fa-upload fa-fw\"></i> Server Rebooted <span\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"pull-right text-muted small\">4 minutes ago</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"divider\"></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"text-center\" href=\"#\"> <strong>See\r\n");
      out.write("\t\t\t\t\t\t\t\t\tAll Alerts</strong> <i class=\"fa fa-angle-right\"></i>\r\n");
      out.write("\t\t\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t\t\t</ul> <!-- /.dropdown-alerts --></li>\r\n");
      out.write("\t\t\t\t<!-- /.dropdown -->\r\n");
      out.write("\t\t\t\t<li class=\"dropdown\"><a class=\"dropdown-toggle\"\r\n");
      out.write("\t\t\t\t\tdata-toggle=\"dropdown\" href=\"#\"> <i class=\"fa fa-user fa-fw\"></i>\r\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-caret-down\"></i>\r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu dropdown-user\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-user fa-fw\"></i> User\r\n");
      out.write("\t\t\t\t\t\t\t\tProfile</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-gear fa-fw\"></i> Settings</a>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"divider\"></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"login.html\"><i class=\"fa fa-sign-out fa-fw\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\tLogout</a></li>\r\n");
      out.write("\t\t\t\t\t</ul> <!-- /.dropdown-user --></li>\r\n");
      out.write("\t\t\t\t<!-- /.dropdown -->\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<!-- /.navbar-top-links -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"navbar-default sidebar\" role=\"navigation\">\r\n");
      out.write("\t\t\t\t<div class=\"sidebar-nav navbar-collapse\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav\" id=\"side-menu\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"index.html\"><i class=\"fa fa-dashboard fa-fw\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\tDashboard</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-bar-chart-o fa-fw\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\tCharts<span class=\"fa arrow\"></span></a>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav nav-second-level\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"flot.html\">Flot Charts</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"morris.html\">Morris.js Charts</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul> <!-- /.nav-second-level --></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"tables.html\"><i class=\"fa fa-table fa-fw\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\tTables</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"forms.html\"><i class=\"fa fa-edit fa-fw\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\tForms</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-wrench fa-fw\"></i> UI\r\n");
      out.write("\t\t\t\t\t\t\t\tElements<span class=\"fa arrow\"></span></a>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav nav-second-level\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"panels-wells.html\">Panels and Wells</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"buttons.html\">Buttons</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"notifications.html\">Notifications</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"typography.html\">Typography</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"icons.html\"> Icons</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"grid.html\">Grid</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul> <!-- /.nav-second-level --></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-sitemap fa-fw\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\tMulti-Level Dropdown<span class=\"fa arrow\"></span></a>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav nav-second-level\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Second Level Item</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Second Level Item</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Third Level <span class=\"fa arrow\"></span></a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"nav nav-third-level\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Third Level Item</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Third Level Item</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Third Level Item</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Third Level Item</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul> <!-- /.nav-third-level --></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul> <!-- /.nav-second-level --></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"fa fa-files-o fa-fw\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\tSample Pages<span class=\"fa arrow\"></span></a>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"nav nav-second-level\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"blank.html\">Blank Page</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"login.html\">Login Page</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul> <!-- /.nav-second-level --></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- /.sidebar-collapse -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- /.navbar-static-side -->\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"page-wrapper\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col-lg-12\">\r\n");
      out.write("\t\t\t\t\t<h1 class=\"page-header\">Dashboard</h1>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-lg-8\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"panel panel-default\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"panel-heading\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"fa fa-bar-chart-o fa-fw\"></i> Content Container\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\"></div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-lg-4\">\r\n");
      out.write("\t\t\t\t<div class=\"panel panel-default\">\r\n");
      out.write("\t\t\t\t\t<div class=\"panel-heading\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-bell fa-fw\"></i> Notifications Panel\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"list-group\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"list-group-item\"> <i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"fa fa-comment fa-fw\"></i> New Comment <span\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"pull-right text-muted small\"><em>4 minutes\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tago</em> </span>\r\n");
      out.write("\t\t\t\t\t\t\t</a> <a href=\"#\" class=\"list-group-item\"> <i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"fa fa-twitter fa-fw\"></i> 3 New Followers <span\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"pull-right text-muted small\"><em>12 minutes\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tago</em> </span>\r\n");
      out.write("\t\t\t\t\t\t\t</a> <a href=\"#\" class=\"list-group-item\"> <i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"fa fa-envelope fa-fw\"></i> Message Sent <span\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"pull-right text-muted small\"><em>27 minutes\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tago</em> </span>\r\n");
      out.write("\t\t\t\t\t\t\t</a> <a href=\"#\" class=\"list-group-item\"> <i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"fa fa-tasks fa-fw\"></i> New Task <span\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"pull-right text-muted small\"><em>43 minutes\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tago</em> </span>\r\n");
      out.write("\t\t\t\t\t\t\t</a> <a href=\"#\" class=\"list-group-item\"> <i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"fa fa-upload fa-fw\"></i> Server Rebooted <span\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"pull-right text-muted small\"><em>11:32 AM</em> </span>\r\n");
      out.write("\t\t\t\t\t\t\t</a> <a href=\"#\" class=\"list-group-item\"> <i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"fa fa-bolt fa-fw\"></i> Server Crashed! <span\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"pull-right text-muted small\"><em>11:13 AM</em> </span>\r\n");
      out.write("\t\t\t\t\t\t\t</a> <a href=\"#\" class=\"list-group-item\"> <i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"fa fa-warning fa-fw\"></i> Server Not Responding <span\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"pull-right text-muted small\"><em>10:57 AM</em> </span>\r\n");
      out.write("\t\t\t\t\t\t\t</a> <a href=\"#\" class=\"list-group-item\"> <i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"fa fa-shopping-cart fa-fw\"></i> New Order Placed <span\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"pull-right text-muted small\"><em>9:49 AM</em> </span>\r\n");
      out.write("\t\t\t\t\t\t\t</a> <a href=\"#\" class=\"list-group-item\"> <i\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"fa fa-money fa-fw\"></i> Payment Received <span\r\n");
      out.write("\t\t\t\t\t\t\t\tclass=\"pull-right text-muted small\"><em>Yesterday</em> </span>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-default btn-block\">View All Alerts</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("\t<script src=\"");
      if (_jspx_meth_c_005furl_005f2(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("\t<script src=\"");
      if (_jspx_meth_c_005furl_005f3(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("\t<script src=\"");
      if (_jspx_meth_c_005furl_005f4(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("\t<script src=\"");
      if (_jspx_meth_c_005furl_005f5(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("\t<script src=\"");
      if (_jspx_meth_c_005furl_005f6(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /WEB-INF/view/main.jsp(5,13) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/resources/css/main.css");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f1.setParent(null);
    // /WEB-INF/view/main.jsp(317,14) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f1.setValue("/resources/js/theme/jquery.min.js");
    int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
    if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f2.setParent(null);
    // /WEB-INF/view/main.jsp(318,14) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f2.setValue("/resources/js/theme/bootstrap.min.js");
    int _jspx_eval_c_005furl_005f2 = _jspx_th_c_005furl_005f2.doStartTag();
    if (_jspx_th_c_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f3.setParent(null);
    // /WEB-INF/view/main.jsp(319,14) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f3.setValue("/resources/js/theme/metisMenu.min.js");
    int _jspx_eval_c_005furl_005f3 = _jspx_th_c_005furl_005f3.doStartTag();
    if (_jspx_th_c_005furl_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f4(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f4 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f4.setParent(null);
    // /WEB-INF/view/main.jsp(320,14) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f4.setValue("/resources/js/theme/raphael-min.js");
    int _jspx_eval_c_005furl_005f4 = _jspx_th_c_005furl_005f4.doStartTag();
    if (_jspx_th_c_005furl_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f4);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f5(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f5 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f5.setParent(null);
    // /WEB-INF/view/main.jsp(321,14) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f5.setValue("/resources/js/theme/morris.min.js");
    int _jspx_eval_c_005furl_005f5 = _jspx_th_c_005furl_005f5.doStartTag();
    if (_jspx_th_c_005furl_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f5);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f6(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f6 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f6.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f6.setParent(null);
    // /WEB-INF/view/main.jsp(322,14) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f6.setValue("/resources/js/theme/sb-admin-2.js");
    int _jspx_eval_c_005furl_005f6 = _jspx_th_c_005furl_005f6.doStartTag();
    if (_jspx_th_c_005furl_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f6);
    return false;
  }
}
