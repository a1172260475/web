/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-01-25 02:54:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class lxwm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<HEAD>\r\n");
      out.write("    <title>好好吃饭</title>\r\n");
      out.write("    <meta name=\"Keywords\" content=\"好好吃饭\" >\r\n");
      out.write("    <meta name=\"Description\" content=\"好好吃饭\" >\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge;chrome=1\">\r\n");
      out.write("    <META http-equiv=Content-Type content=\"text/html; charset=utf-8\">\r\n");
      out.write("    <META content=\"MSHTML 6.00.3790.4807\" name=GENERATOR>\r\n");
      out.write("    <LINK href=\"/favicon.ico\" rel=\"shortcut icon\">\r\n");
      out.write("    <link  type=\"text/css\" rel=\"stylesheet\" href=\"../css/style.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/common.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"../css/subpage.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"https://cdn.staticfile.org/ionicons/2.0.1/css/ionicons.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("    <script type=\"text/javascript\" src=\"../js/jquery1.11.1.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"../js/jquery.SuperSlide.2.1.1.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"../js/form.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"../js/common.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body >\r\n");
      out.write("<!-- 头部 -->\r\n");
      out.write("<div class=\"header\" style=\"height: 160px;\">\r\n");
      out.write("    <div class=\"main\">\r\n");
      out.write("        <div class=\"logo\"><title=\"好好吃饭\"><img src=\"../img/title.png\" alt=\"好好吃饭\" /></a></div>\r\n");
      out.write("        <div class=\"tel\"><div class=\"title\">好好吃饭</div><div class=\"num\">110119120</div></div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!--header end-->\r\n");
      out.write("<div class=\"clear\"></div>\r\n");
      out.write("<!--g_nav-->\r\n");
      out.write("<div class=\"g_nav\">\r\n");
      out.write("    <div class=\"g_nav01\">\r\n");
      out.write("        <table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("            <tr>\r\n");
      out.write("\r\n");
      out.write("                <td class=\"\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/jsp/index.jsp\" title=\"首页\">网站首页<div></div></a></td>\r\n");
      out.write("\r\n");
      out.write("                <td ><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/jsp/gywm.jsp\" title=\"关于我们\">关于我们<div></div></a>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"nav_tan\">\r\n");
      out.write("\r\n");
      out.write("                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/jsp/gywm.jsp\">企业文化 <br /></a>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </td>\r\n");
      out.write("\r\n");
      out.write("                <td ><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/jsp/cgal.jsp\" title=\"成功案例\">成功案例<div></div></a>\r\n");
      out.write("\r\n");
      out.write("                </td>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <td ><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/jsp/zxly.jsp\" title=\"在线留言\">在线留言<div></div></a>\r\n");
      out.write("\r\n");
      out.write("                </td>\r\n");
      out.write("\r\n");
      out.write("                <td ><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/jsp/lxwm.jsp\" title=\"联系我们\">联系我们<div></div></a>\r\n");
      out.write("\r\n");
      out.write("                </td>\r\n");
      out.write("\r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!--g_nav end-->\r\n");
      out.write("<div class=\"clear\"></div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"clear\" id=\"something\"></div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"product sub_pro\">\r\n");
      out.write("    <!--left-->\r\n");
      out.write("    <div class=\"product01\">\r\n");
      out.write("        <div class=\"product07\">联系我们</div>\r\n");
      out.write("        <!--left nav-->\r\n");
      out.write("        <div class=\"sidenav\">\r\n");
      out.write("            <ul>\r\n");
      out.write("\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"l_contact\">\r\n");
      out.write("            <p class=\"product07 lcon_t\">联系我们</p>\r\n");
      out.write("            <div class=\"sidenav\">\r\n");
      out.write("                <div class=\"lcon_tel\">了解更多详细信息，请致电<i>13063467188</i></div>\r\n");
      out.write("                <p class=\"lcon_msg\">或给我们留言<a href=\"zaixianliuyan.html\">给我留言</a></p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--left end-->\r\n");
      out.write("    <div class=\"product02\">\r\n");
      out.write("        <div class=\"content_com_title\">\r\n");
      out.write("            <h2>联系我们</h2>\r\n");
      out.write("            <div class=\"bread\">当前位置：<a href=\"/\">首页</a> > <a href=\"zaixianliuyan.html\">联系我们</a></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"content\">\r\n");
      out.write("            <div class=\"view\">\r\n");
      out.write("                <p><p style=\"text-align: center;\"><img src=\"../img/cc.jpg\" style=\"float:none;\"></p><p style=\"text-align: center;\"><iframe class=\"ueditor_baidumap\" src=\"http://hnnrtjd.com/adminbo/ueditor/dialogs/map/show.html#center=116.86605,32.601054&zoom=18&width=530&height=340&markers=116.866373,32.601442&markerStyles=l,A\" frameborder=\"0\" width=\"534\" height=\"344\"></iframe></p><p><br/></p></p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"clear\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"clear\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- footer -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"/inc/AspCms_Statistics.asp\"></script><!--footer-->\r\n");
      out.write("\r\n");
      out.write("<div class=\"footer\">\r\n");
      out.write("    <div class=\"main\">\r\n");
      out.write("        <div class=\"foottel\">基地招生培训热线：110119120</div>\r\n");
      out.write("        <div class=\"footr\"> <span class=\"footsite\"><a href=\"\" title=\"网站地图\">网站地图</a></span>\r\n");
      out.write("            <a class=\"footqq\" title=\"点击这里给我发消息\" href=\"http://wpa.qq.com/msgrd?v=3&uin=88888888&site=www.cactussoft.cn&menu=yes\" target=\"_blank\">在线咨询</a>\r\n");
      out.write("            <div class=\"footshare\">\r\n");
      out.write("\r\n");
      out.write("                <script>window._bd_share_config={\"common\":{\"bdSnsKey\":{},\"bdText\":\"\",\"bdMini\":\"2\",\"bdMiniList\":false,\"bdPic\":\"\",\"bdStyle\":\"0\",\"bdSize\":\"16\"},\"share\":{}};with(document)0[(getElementsByTagName('head')[0]||body).appendChild(createElement('script')).src='http://bdimg.share.baidu.com/static/api/js/share.js?v=89860593.js?cdnversion='+~(-new Date()/36e5)];</script>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"clear\"></div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"manager_info\">\r\n");
      out.write("    <div class=\"main\">\r\n");
      out.write("        <div class=\"fl\"><span>版权所有&#169;2018-2019 好好吃饭</span><span>技术支持：<a title=\"呵\" target=\"_blank\" >呵</a></span></div>\r\n");
      out.write("        <span class=\"fr\">ICP备案编号：<title=\"备案信息\">0000000</a></span></div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"side_nav\">\r\n");
      out.write("    <ul>\r\n");
      out.write("\r\n");
      out.write("        <li class=\"back_top\"><a href=\"#\" style=\"width: 60px; left: 0px;\" title=\"返回顶部\"> <span>返回顶部</span> </a> </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <div class=\"c\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
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