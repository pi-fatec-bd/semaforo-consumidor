$(document).ready(function() {
    $('select').formSelect();
});

$('#consultaCpfForm').submit(function(e) {
    e.preventDefault();
    const cpf = $('#cpf').val();
    console.log(cpf);
    $.get('http://localhost:4567/api/v1/DadosPF/' + cpf, function(response) {
        const json = JSON.parse(response);
        console.log(json);
        alert(json);
    });
})
