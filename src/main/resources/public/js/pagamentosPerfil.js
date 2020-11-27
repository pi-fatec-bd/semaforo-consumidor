$(document).ready(function(){
    const tabela = document.getElementById("tabela")
    $.get('http://localhost:4567/api/v1/dadosPF/' + cpf,function (response){
        const json = JSON.parse(response)
        alert(json)

    })
    $.each(json, function(index, value){
        tabela.innerHTML("<li>"+value+"</li>")
    })
})