<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/24 0024
  Time: 19:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<<html>
<HEAD>
    <title>好好吃饭</title>
    <meta name="Keywords" content="好好吃饭" >
    <meta name="Description" content="好好吃饭" >
    <meta http-equiv="X-UA-Compatible" content="IE=edge;chrome=1">
    <META http-equiv=Content-Type content="text/html; charset=utf-8">
    <META content="MSHTML 6.00.3790.4807" name=GENERATOR>
    <LINK href="/favicon.ico" rel="shortcut icon">
    <link  type="text/css" rel="stylesheet" href="../css/style.css" />
    <link rel="stylesheet" type="text/css" href="../css/common.css" />
    <link rel="stylesheet" type="text/css" href="../css/subpage.css" />
    <link rel="stylesheet" type="text/css" media="screen" href="https://cdn.staticfile.org/ionicons/2.0.1/css/ionicons.min.css">
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
    <script type="text/javascript" src="../js/jquery1.11.1.min.js"></script>
    <script type="text/javascript" src="../js/jquery.SuperSlide.2.1.1.js"></script>
    <script type="text/javascript" src="../js/form.js"></script>
    <script type="text/javascript" src="../js/common.js"></script>
    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>

<body >
<!-- 头部 -->
<div class="header" style="height: 160px;">
    <div class="main">
        <div class="logo"><a href="" title="好好吃饭"><img src="../img/title.png" alt="好好吃饭" /></a></div>
        <div class="tel"><div class="title">好好吃饭</div><div class="num">15146202050</div></div>

    </div>
</div>
</div>
<!--header end-->
<div class="clear"></div>
<!--g_nav-->
<div class="g_nav">
    <div class="g_nav01">
        <table border="0" cellspacing="0" cellpadding="0">
            <tr>

                <td class=""><a href="${path}/jsp/index.jsp" title="首页">网站首页<div></div></a></td>

                <td ><a href="${path}/jsp/gywm.jsp" title="关于我们">关于我们<div></div></a>

                    <div class="nav_tan">

                        <a href="${path}/jsp/gywm.jsp">企业文化 <br /></a>

                    </div>

                </td>

                <td ><a href="${path}/jsp/cgal.jsp" title="成功案例">成功案例<div></div></a>

                </td>



                <td ><a href="${path}/jsp/zxly.jsp" title="在线留言">在线留言<div></div></a>

                </td>

                <td ><a href="${path}/jsp/lxwm.jsp" title="联系我们">联系我们<div></div></a>

                </td>

            </tr>
        </table>
    </div>
</div>
<!--g_nav end-->
<div class="clear"></div>

<div class="clear" id="something"></div>

<div class="product sub_pro">
    <!--left-->
    <div class="product01">
        <div class="product07">在线留言</div>
        <!--left nav-->
        <div class="sidenav">
            <ul>

            </ul>
        </div>

        <div class="l_contact">
            <p class="product07 lcon_t">联系我们</p>
            <div class="sidenav">
                <div class="lcon_tel">了解更多详细信息，请致电<i>lihanwsad@163.com</i></div>
                <p class="lcon_msg">或给我们留言<a href="zaixianliuyan.html">给我留言</a></p>
            </div>
        </div>
    </div>
    <!--left end-->
    <div class="product02">
        <div class="content_com_title">
            <h2>在线留言</h2>
            <div class="bread">当前位置：<a href="/">首页</a> > <a href="zaixianliuyan.html">在线留言</a></div>
        </div>
        <div class="content">
            <div class="view">
                <p>
                    <style type="text/css">
                        <!--
                        #gbooklist {
                            width: 98%;
                            text-align:center;
                        }
                        #gbooklist .faq  ,
                        #gbooklist .reply
                        {
                            text-align:left;
                            width: 98%;
                            word-wrap: break-word;
                            word-break: break-all;
                        }
                        #gbooklist .faq{
                            margin-bottom:15px;
                        }
                        #gbooklist .faqtit,
                        #gbooklist .faqcon
                        {
                            padding-left:5px;
                        }

                        #gbooklist .faqtit{
                            background:#A8DFFA;
                            color:#0B3779;
                            font-size:14px;
                        }

                        #gbooklist .reply{
                            border: 1px dashed #FF0000;
                            width:95%;
                            margin-bottom:10px;
                            margin-left:5px;
                            padding:3px;
                        }
                        .pageNavi{border:none;}

                    </style>

                <div id="faqbox">
                    <form action="save.asp?action=add" method="post">
                        <div class="faqline">
                            <span class="faqtit">留言主题：</span>
                            <input name="FaqTitle" type="text" /><font color="#FF0000">*</font>
                        </div>
                        <div class="faqline">
                            <span class="faqtit">联 系 人：</span>
                            <input name="Contact" type="text" /><font color="#FF0000">*</font>
                        </div>
                        <div class="faqline">
                            <span class="faqtit">联系手机：</span>
                            <input name="ContactWay" type="text" /> <font color="#FF0000">*</font>
                        </div>
                        <div class="Content">
                            <span class="faqtit">留言内容：</span>
                            <textarea name="Content" cols="60" rows="5"></textarea><font color="#FF0000">*</font>
                        </div>

                        <div class="faqline">
                            <span class="faqtit">&nbsp;</span>

                            <input type="submit" value=" 提交 " href="#"/>
                        </div>
                    </form>
                </div>

                </p>
            </div>
        </div>
    </div>
    <<div class="clear"></div>
</div>

<<!-- footer -->
<script type="text/javascript" src="/inc/AspCms_Statistics.asp"></script><!--footer-->

<div class="footer">
    <div class="main">
        <div class="foottel">基地招生培训热线：15146202050</div>
        <div class="footr"> <span class="footsite"><a href="" title="网站地图">网站地图</a></span>
            <a class="footqq" title="点击这里给我发消息" href="http://wpa.qq.com/msgrd?v=3&uin=88888888&site=www.cactussoft.cn&menu=yes" target="_blank">在线咨询</a>
            <div class="footshare">

                <script>window._bd_share_config={"common":{"bdSnsKey":{},"bdText":"","bdMini":"2","bdMiniList":false,"bdPic":"","bdStyle":"0","bdSize":"16"},"share":{}};with(document)0[(getElementsByTagName('head')[0]||body).appendChild(createElement('script')).src='http://bdimg.share.baidu.com/static/api/js/share.js?v=89860593.js?cdnversion='+~(-new Date()/36e5)];</script>
            </div>
        </div>
        <div class="clear"></div>

    </div>
</div>
<div class="manager_info">
    <div class="main">
        <div class="fl"><span>版权所有 好好吃饭</span><span>技术支持：<a title="呵" target="_blank" >呵</a></span></div>
        <span class="fr">ICP备案编号：<title="备案信息">0000000</a></span></div>
</div>
<div class="side_nav">
    <ul>

        <li class="back_top"><a href="#" style="width: 60px; left: 0px;" title="返回顶部"> <span>返回顶部</span> </a> </li>
    </ul>
    <div class="c"></div>
</div>


</body>
</html>