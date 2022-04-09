$(function () {
    $("#first").on("mouseover",function () {
        $("#first").html("Teleporter");
    });
    $("#first").on("mouseout",function () {
        $("#first").html("Zebra");
    });
});