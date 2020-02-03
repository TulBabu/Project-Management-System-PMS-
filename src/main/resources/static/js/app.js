//common function lai yesari js ma liyera rakhne yo project bata liyeko ho jun project ko index ma comment gariyeko xa
function loadTable(param) {
    $.get(param.url, function (data) {
        $(param.el).html(data);
    });
}

function loadCombobox(param) {
//        let param is a student object and url is a parameter like student.id el means element student.el
    $.getJSON(param.url, function (data) {
        $dropDown = $(param.el);
        $('<option/>').val('').html(param.title)
                .appendTo($dropDown);
        $.each(data, function (index, row) {
            $('<option/>').val(row[param.data[0]]).html(row[param.data[1]])
                    .appendTo($dropDown);
        });
    });
}

function showDialog(param) {
    var $dialog = $(param.el);
    $dialog.find('#modal-title')
            .html(param.title);
    $dialog.modal();
}

function mapInputData(data) {
    for (attr in data) {
        $('input[name=' + attr + ']').val(data[attr]);
    }
}
//
//$(document).ready(function(){
//    //id datepicker vaye datepicker gar vaneko
//    $('.datepicker').datepicker({
//        format:'yyyy-mm-dd',
//    autoclose:true
//    });
//});