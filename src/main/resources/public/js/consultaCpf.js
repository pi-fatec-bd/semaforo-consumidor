$(document).ready(function() {
    $('select').formSelect();
});

$('#consultaCpfForm').submit(function() {
    const consultaCpfForm = {
      cpf: $('#cpf').val(),
    }
  
    $.get('http://localhost:4567/api/v1/UsuarioPessoaFisica', consultaCpfForm, function(response) {
        alert(response);
    })
    .done(function() {
        alert('Sucesso!')
        window.location.href = 'http://localhost:4567'
    })
    .fail(function() {
        alert('Algum erro ocorreu, tente novamente mais tarde');
    })
    .always(function() {
        alert('Você será redirecionado para a próxima página.');
    });
})
