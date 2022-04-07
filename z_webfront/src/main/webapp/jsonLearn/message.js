$(function () {
    $.get("message-list-json",function (data) {
        let tbody =  $("tbody");
        for (i in data) {
            let message = data[i];
            let content = "<tr>" +
                "<td>"+message.id+"</td>" +
                "<td>"+message.who+"</td>" +
                "<td>"+message.when+"</td>" +
                "<td>"+message.what+"</td>" +
                "</tr>"
            tbody.append(content);
        }
    });
});