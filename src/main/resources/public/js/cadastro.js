$( "#criar_usuario" ).click(function() {
    var dados = {
        cpf: document.getElementById("cpf").value,
        anoNascimento : document.getElementById("anoNascimento").value,
        cidade: document.getElementById("cidade").value,
        uf: document.getElementById("uf").value,
        sexo: $("input:radio[name=sexo]:checked").val(),
        senha: "des",
        confirmarSenha: "des"
    }
    
    $.post("http://localhost:4567/api/v1/PessoaFisica?" + $.param(dados), function() {
        alert( "enviando..." );
      })
        .done(function() {
          alert( "Cadastrado com sucesso!" );
        })
        .fail(function() {
          alert( "Algum erro ocorreu, tente novamente mais tarde" );
        })
        .always(function() {
          alert( "Você será redirecionado para a próxima página." );
        });
    })

// $( "#listar_cadastros" ).click(function() {
//     // $.get("http://localhost:3333/create-user", function(resultado){
//     //     console.log(resultado)
//     //     $("#resultado").html(resultado);
//     // })
//     $.getJSON( "http://localhost:3333/create-user", function( resultado ) {
//         var items = [];
//         $.each( resultado[0], function( key, val ) {
//           items.push( "<li id='" + key + "'>" + val + "</li>" );
//         });
       
//         $( "<ul/>", {
//           "class": "my-new-list",
//           html: items.join( "" )
//         }).appendTo( "body" );
//       });
// })

























