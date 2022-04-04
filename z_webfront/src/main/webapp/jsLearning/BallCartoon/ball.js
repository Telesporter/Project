$(function main() {
    setInterval(function () {
        let a = $(".s1");
        let b = $(".s2");
        a.removeClass("s1").addClass("s2");
        b.removeClass("s2").addClass("s1");
    },1000)
});