$(function () {
    let o1 = $("#content");
    $("button").on("click",function () {
        $.get("test.txt",function (data) {  //ajax请求
            o1.append("<li>" + data + "</li>");
        })
    })
});