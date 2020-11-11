$('#loginForm').submit(function(e){    
    e.preventDefault();
    console.log("qualquer coisa")
    const loginURL = "http://localhost:4567/api/v1/Login"
    const usuarioForm = {
        cpf: $('#cpf').val(),
        senha: $('#senha').val(),
    }
    console.log(usuarioForm.cpf)
    $.post(loginURL, usuarioForm, function(data) {
            console.log(data)   
        //Se o usuário não existir, volte para a tela inicial
        if(data.cpf == 0){

            window.location.href = '/index.html';
        
        //Se o usuário existir, vá para a tela principal	
        } else {
        
            sessionStorage.setItem("cpf", data.cpf);

            window.location.href = '/tela-principal.html';            
        }
                    
    });
    
});






















