$("#cadastro").submit(function(event) {
    const novoUsuario = {
        cpf: $("#cpf").val(),
        anoNascimento : $("#anoNascimento").val(),
        cidade: $("#cidade").val(),
        estado: $("#estado").val(),
        sexo: $("input:radio[name=sexo]:checked").val(),
        senha: $("#senha").val(),
        confirmarSenha: $("#confirmarSenha").val()
    }
    
    $.post("http://localhost:4567/api/v1/UsuarioPessoaFisica", novoUsuario, function(data) {
        alert(data);
    })
});
























