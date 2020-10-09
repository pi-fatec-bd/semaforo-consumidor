$( "#criar_usuario" ).click(function() {
    var dados = {
        cpf: document.getElementById("cpf").value,
        ano_nascimento : document.getElementById("ano_nascimento").value,
        cidade: document.getElementById("cidade").value,
        uf: document.getElementById("uf").value,
        sexo: $("input:radio[name=sexo]:checked").val()
    }
    $.ajax
    ({
        //o objeto json que será passado pela requisição
        data : JSON.stringify(dados),
        contentType : 'application/json',
        type : 'POST',
        //a url que vai receber a requisição
        url: 'https://my-json-server.typicode.com/felipemessi/fakeapi-jsonplaceholder/pessoa_fisica?" + $.param(data)',
        dataType: 'json',
        async: true,
        
        success: function () {
            alert("Cadastrado com sucesso!!!"); 
        }
    })
    alert("Cadastrado com sucesso!!!"); 
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

























