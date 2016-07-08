/**
 * Created by zxx on 2016/7/2.
 */
$('.registerSelect').mouseover(function() {$(this).addClass('open');}).mouseleave(function() { $(this).removeClass('open');});
var registerMenu=document.getElementById("registerMenu");
registerMenu.onmouseover=function(){
    var a=registerMenu.getElementsByTagName("a");
    a[0].style.backgroundColor="white";
    a[0].style.borderLeft="1px solid #e5e5e5";
    a[0].style.borderRight="1px solid #e5e5e5";
}
registerMenu.onmouseleave=function(){
    var a=registerMenu.getElementsByTagName("a");
    a[0].style.backgroundColor="#f2f2f2";
    //a[0].style.backgroundClip="border-box";
    a[0].style.borderLeft="none";
    a[0].style.borderRight="none";
}
$(function () { $("[data-toggle='popover']").popover(); });