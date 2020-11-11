$('#cadastroForm').submit(function() {
    const usuarioForm = {
        docCliBloqueador: sessionStorage.getItem("cnpj"),
        docCliBloqueado: $('#cnpj').val()
    }

    $.post('http://localhost:4567/api/v1/ListaNegra', usuarioForm, function(response) {
        alert(response);
    })
        .done(function() {
            alert('CNPJ bloqueado com sucesso!')
            window.location.href = 'http://localhost:4567'
        })
        .fail(function() {
            alert('Algum erro ocorreu, tente novamente mais tarde');
        })
        .always(function() {
            alert('Você será redirecionado para a próxima página.');
        });
})