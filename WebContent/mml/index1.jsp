<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>米米乐</title>
    <link type="text/css" rel="stylesheet" href="css/bootstrap.min.css">
    <link type="text/css" href="css/index.css" rel="stylesheet">
    <script src="js/jquery-3.0.0.min.js"></script>
</head>
<body>
<div id="mallPage" class="mimi-global">
    <div id="site-nav">
        <div id="sn-bd">
            <div class="sn-container ">
                <ul class="sn-left list-unstyled list-inline">
                    <li>欢迎来到米米乐</li>
                    <s:if test="#session.member==null">
                    <li> <a data-toggle="modal" data-target="#loginModal">登录</a></li>
                    <li class="dropdown registerSelect" id="registerMenu">
                        <a class="dropdown-toggle" data-toggle="dropdown">
                            注册
                            <span class="caret"></span>
                        </a>
                        <ul class="dropdown-menu" role="menu">
                            <li><a data-target="#memberRegister" data-toggle="modal">会员注册</a></li>
                            <li><a data-target="#sellerRegister" data-toggle="modal">商家注册</a></li>
                        </ul>
                    </li>
                    </s:if>
                    <s:else>
                    <li>用户名</li>
                    </s:else>
                </ul>
                <div class="modal fade" id="loginModal" role="dialog" aria-hidden="true"
                     aria-labelledby="loginModal">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                                    &times;
                                </button>
                                <h4 class="modal-title">
                                    用户登录
                                </h4>
                            </div>
                            <div class="modal-body">
                                <div class="input-group">
                                    <span class="input-group-addon">
                                        <span class=" glyphicon glyphicon-user"></span>
                                    </span>
                                    <input type="text" class="form-control" placeholder="输入用户名">
                                </div>
                                <br>
                                <div class="input-group">
                                    <span class="input-group-addon">
                                        <span class=" glyphicon glyphicon-lock"></span>
                                    </span>
                                    <input type="text" class="form-control" placeholder="输入密码">
                                </div>
                            </div>
                            <div class="modal-footer">
                                <button type="submit" class="btn">
                                    登录
                                </button>
                                <button type="button" data-dismiss="modal" class="btn">
                                    取消
                                </button>
                            </div>
                        </div>
                    </div>

                </div>
                <div class="modal fade" id="memberRegister" role="dialog" aria-hidden="true"
                     aria-labelledby="memberRegister">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                                    &times;
                                </button>
                                <h4 class="modal-title">
                                    会员注册
                                </h4>
                            </div>
                            <div class="modal-body">
                               <form class="form-horizontal" role="form" id="memberRegisterForm" action="MemberLoginAction">
                                   <div class="form-group">
                                       <label for="m_Name" class="control-label col-sm-2">用户名</label>
                                       <div class="col-sm-10">
                                            <input id="m_Name" class="form-control" type="text" placeholder="请输入用户名">
                                                   <!--data-toggle="popover" data-container="body" data-placement="top"-->
                                                   <!--data-html="true" data-trigger="focus"-->
                                                   <!--data-content="<div style='font-size:12px;height=32px;'>6-16位字符，可由英文、数字及标点符号组成</div>">-->
                                       </div>
                                       <div class="col-sm-offset-2" style="height: 45px; padding-left:30px;line-height: 28px ">hello</div>
                                   </div>
                                   <div class="form-group">
                                       <label for="m_Password" class="control-label col-sm-2">密码</label>
                                       <div class="col-sm-10">
                                            <input id="m_Password" class="form-control" type="text" placeholder="请输入密码">
                                                   <!--data-toggle="popover" data-container="body" data-placement="top"-->
                                                   <!--data-html="true" data-trigger="focus"-->
                                                   <!--data-content="<div style='font-size:12px;height=32px;'>1-10位字符，可由英文、中文及符号组成</div>">-->
                                       </div>
                                       <div class="col-sm-offset-2" style="height: 45px; padding-left:30px;line-height: 28px ">hello</div>
                                   </div>
                                   <div class="form-group">
                                       <label for="m_Password" class="control-label col-sm-2">确认密码</label>
                                       <div class="col-sm-10">
                                           <input id="m_confirmPassword" class="form-control" type="text" placeholder="请确认密码">
                                       </div>
                                       <div class="col-sm-offset-2" style="height: 45px; padding-left:30px;line-height: 28px ">hello</div>
                                   </div>
                                   <div class="form-group">
                                       <label for="m_Phone" class="control-label col-sm-2">手机</label>
                                       <div class="col-sm-10">
                                           <input id="m_Phone" class="form-control" type="text" placeholder="请输入手机号码">
                                                  <!--data-toggle="popover" data-container="body" data-placement="top"-->
                                                  <!--data-html="true" data-trigger="focus"-->
                                                  <!--data-content="<div style='font-size:12px;height=32px;'>请输入11位手机号</div>">-->
                                       </div>
                                       <div class="col-sm-offset-2" style="height: 45px; padding-left:30px;line-height: 28px ">hello</div>
                                   </div>
                                   <div class="form-group">
                                       <label for="m_Email" class="control-label col-sm-2">邮箱</label>
                                       <div class="col-sm-10">
                                           <input id="m_Email" class="form-control" type="text" placeholder="请输入邮箱号码">
                                                  <!--data-toggle="popover" data-container="body" data-placement="top"-->
                                                  <!--data-html="true" data-trigger="focus"-->
                                                  <!--data-content="<div style='font-size:12px;height=32px;'>请输入正确的邮箱格式</div>">-->
                                       </div>
                                       <div class="col-sm-offset-2" style="height: 45px; padding-left:30px;line-height: 28px ">hello</div>
                                   </div>
                                   <div class="form-group">
                                        <div class="col-sm-offset-2 col-sm-10">
                                            <div class="checkbox">
                                                <label>
                                                    <input type="checkbox">阅读并<a href="#">同意服务</a>
                                                </label>
                                            </div>
                                        </div>
                                   </div>
                               </form>
                            </div>
                            <div class="modal-footer">
                                <button type="submit" class="btn">
                                    注册
                                </button>
                                <button type="button" data-dismiss="modal" class="btn">
                                    取消
                                </button>
                            </div>
                        </div>
                    </div>

                </div>
                <div class="modal fade" id="sellerRegister" role="dialog" aria-hidden="true"
                     aria-labelledby="sellerRegister">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                                    &times;
                                </button>
                                <h4 class="modal-title">
                                    商家注册
                                </h4>
                            </div>
                            <div class="modal-body">
                                <form class="form-horizontal" role="form" id="sellerRegisterForm">
                                    <div class="form-group">
                                        <label for="s_Name" class="control-label col-sm-2">用户名</label>
                                        <div class="col-sm-10">
                                            <input id="s_Name" class="form-control" type="text" placeholder="请输入用户名">
                                                   <!--data-toggle="popover" data-container="body" data-placement="top"-->
                                                   <!--data-html="true" data-trigger="focus"-->
                                                   <!--data-content="<div style='font-size:12px;height=32px;'>1-10位字符，可任意字符组成-->
                                                   <!--</div>">-->
                                        </div>
                                        <div class="col-sm-offset-2" style="height: 45px; padding-left:30px;line-height: 28px ">hello</div>
                                    </div>
                                    <div class="form-group">
                                        <label for="s_Password" class="control-label col-sm-2">密码</label>
                                        <div class="col-sm-10">
                                            <input id="s_Password" class="form-control" type="text" placeholder="请输入密码">
                                                   <!--data-toggle="popover" data-container="body" data-placement="top"-->
                                                   <!--data-html="true" data-trigger="focus"-->
                                                   <!--data-content="<div style='font-size:12px;height=32px;'>6-16位字符，可由英文、数字及标点符号组成</div>">-->
                                        </div>
                                        <div class="col-sm-offset-2" style="height: 45px; padding-left:30px;line-height: 28px ">hello</div>
                                    </div>
                                    <div class="form-group">
                                        <label for="s_Password" class="control-label col-sm-2">确认密码</label>
                                        <div class="col-sm-10">
                                            <input id="s_confirmPassword" class="form-control" type="text" placeholder="请确认密码">
                                        </div>
                                        <div class="col-sm-offset-2" style="height: 45px; padding-left:30px;line-height: 28px ">hello</div>
                                    </div>
                                    <div class="form-group">
                                        <label for="s_Phone" class="control-label col-sm-2">手机</label>
                                        <div class="col-sm-10">
                                            <input id="s_Phone" class="form-control" type="text" placeholder="请输入手机号码">
                                                   <!--data-toggle="popover" data-container="body" data-placement="top"-->
                                                   <!--data-html="true" data-trigger="focus"-->
                                                   <!--data-content="<div style='font-size:12px;height=32px;'>请输入11位手机号</div>">-->
                                        </div>
                                        <div class="col-sm-offset-2" style="height: 45px; padding-left:30px;line-height: 28px ">hello</div>
                                    </div>
                                    <div class="form-group">
                                        <label for="s_Email" class="control-label col-sm-2">邮箱</label>
                                        <div class="col-sm-10">
                                            <input id="s_Email" class="form-control" type="text" placeholder="请输入邮箱号码">
                                                   <!--data-toggle="popover" data-container="body" data-placement="top"-->
                                                   <!--data-html="true" data-trigger="focus"-->
                                                   <!--data-content="<div style='font-size:12px;height=32px;'>请输入正确的邮箱格式</div>">-->
                                        </div>
                                        <div class="col-sm-offset-2" style="height: 45px; padding-left:30px;line-height: 28px ">hello</div>
                                    </div>
                                    <div class="form-group">
                                        <label for="s_Verify" class="col-sm-2 control-label">验证</label>
                                        <div class="col-sm-10">
                                            <input id="s_Verify" type="file" class=" s_Verify">
                                                   <!--data-toggle="popover" data-container="body" data-placement="top"-->
                                                   <!--data-html="true" data-trigger="focus"-->
                                                   <!--data-content="<div style='font-size:12px;height=32px;'>请提交验证文件</div>">-->
                                        </div>
                                        <div class="col-sm-offset-2" style="height: 45px; padding-left:30px;line-height: 28px ">hello</div>
                                    </div>
                                    <div class="form-group">
                                        <div class="col-sm-offset-2 col-sm-10">
                                            <div class="checkbox">
                                                <label>
                                                    <input type="checkbox">阅读并<a href="#">同意服务</a>
                                                </label>
                                            </div>
                                        </div>
                                    </div>
                                </form>
                            </div>
                            <div class="modal-footer">
                                <button type="submit" class="btn">
                                    注册
                                </button>
                                <button type="button" data-dismiss="modal" class="btn">
                                    取消
                                </button>
                            </div>
                        </div>
                    </div>

                </div>
                <ul class="sn-right list-unstyled list-inline">
                    <li class="sn-right-one">
                            <a href="member.html">用户中心</a>
                    </li>
                    <li class="sn-right-two">
                        <a href="#">我的订单</a>
                        </li>
                    <li class="sn-right-thre">客户服务</li>
                    <li class="sn-right-for">网站导航</li>
                </ul>
            </div>
        </div>
    </div>
    <header>
        <div class="h-con">
            <div class="malllogo">
                <img src="image/mml.png">
            </div>
            <div class="h-banner">
            </div>
            <div id="mallsearch">
                <form class="mallsearch-form">
                    <input type="text" class="hs-con">
                    <button type="submit" class="hs-sub">搜索</button>
                </form>
            </div>
        </div>
    </header>
    <div id="content">
        <div class="main-nav">
            <div class="nav-content">
                <ul class= "n-list">
                    <li class="classify dropdown open">
                        <a type="button" data-toggle="dropdown" class="dropdown-toggle">
                            商品分类
                            <span class="caret"></span>
                        </a>
                        <ul class="dropdown-menu" role="menu" aria-hidden="false">
                            <li><a href="#">手机数码</a></li>
                            <li><a href="#">电脑办公</a></li>
                            <li><a href="#">食品酒饮</a></li>
                            <li><a href="#">日用百货</a></li>
                            <li><a href="#">服装鞋帽</a></li>
                            <li><a href="#">母婴玩具</a></li>
                            <li><a href="#">家居生活</a></li>
                            <li><a href="#">个护美妆</a></li>
                            <li><a href="#">家用电器</a></li>
                        </ul>
                    </li>
                    <li class="active"><a href="#">首页</a></li>
                    <li><a href="#">服装城</a></li>
                    <li><a href="#">美妆馆</a></li>
                    <li><a href="#">数码城</a></li>
                    <li><a href="#">生鲜百货</a></li>
                </ul>
            </div>
        </div>
        <div class="adv">
            <div id="myCarousel" class="carousel slide" data-ride="carousel">
                <!-- 轮播（Carousel）指标 -->
                <ol class="carousel-indicators">
                    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                    <li data-target="#myCarousel" data-slide-to="1"></li>
                    <li data-target="#myCarousel" data-slide-to="2"></li>
                    <li data-target="#myCarousel" data-slide-to="3"></li>
                </ol>
                <!-- 轮播（Carousel）项目 -->
                <div class="carousel-inner">
                    <div class="item active">
                        <a href="#"><img src="image/adv1.png" alt="First slide"></a>
                    </div>
                    <div class="item">
                        <a href="#"><img src="image/adv2.png" alt="Second slide"></a>
                    </div>
                    <div class="item">
                        <a href="#"><img src="image/adv3.png" alt="Third slide"></a>
                    </div>
                    <div class="item">
                        <a href="#"><img src="image/adv4.png" alt="four slide"></a>
                    </div>
                </div>
                <!-- 轮播（Carousel）导航 -->
                <a class="carousel-control left" href="#myCarousel"
                   data-slide="prev">&lsaquo;</a>
                <a class="carousel-control right" href="#myCarousel"
                   data-slide="next">&rsaquo;</a>
            </div>
        </div>
        <div class="brand">
            <h3>米米乐·品质生活</h3>
            <div class="brand-content"></div>
        </div>
    </div>
    <div id="footer"></div>
</div>
<script src="js/bootstrap.js" ></script>
<script src="js/index.js" ></script>
</body>
</html>