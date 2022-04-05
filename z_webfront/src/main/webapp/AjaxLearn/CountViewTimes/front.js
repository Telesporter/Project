$(function () {
    setInterval(function () {
        $.get("back",function (data) {
            $("#content").html(data);
        })
    },2000)
});