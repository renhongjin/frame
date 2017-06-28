/**
 * Created by Administrator on 2017/6/4.
 */

$(document).ready(function(){
    //商店类型回车事件
    $('#shopTope').keydown(function(e){
        if(e.keyCode==13){
             //处理事件
            var shopTope = $("#shopTope").val();
                //如果传输值为空
                if(shopTope == "" || shopTope == undefined){
                    alert("不能输入为空")
                }
                //如果不是空执行下列代码
                else {
                    if($(".showTope").children().length < 3){
                        $(".showTope").append('<span class="shopTopeStyle" onclick="$(this).remove()">'+ shopTope + '</span>');
                        $("#shopTope").val("");
                    }
                    else {
                        alert("添加数量达到上限")
                    }
                }
        }
    });



});

function upload() {
    $("#fileNew").click(); // 隐藏了input:file样式后，点击头像就可以本地上传
    $("#fileNew").on("change", function() {

        $.ajaxFileUpload({
            url : "https://renhongjin.org/index/uploadImg.html", // 用于文件上传的服务器端请求地址
            secureuri : false, // 是否需要安全协议，一般设置为false
            fileElementId : 'fileNew', // 文件上传域的ID
            dataType: 'json',

            success : function(data) {// 服务器成功响应处理函数
                // var item = JSON.parse($(data).text());
                 console.log(data)
                var baseUrl = "https://renhongjin.org/" ;
                var imgurl = '<img class="uploadimg" src = ' + baseUrl + data.data[0] + '>';
                $("#picNew").before(imgurl);
            }
        });
    });
};
