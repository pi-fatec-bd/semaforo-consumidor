$(document).ready(function(){
    $('loginForm').submit(function(e){    
        
        e.preventDefault();
        const loginURL = "http://localhost:4567/api/v1/Login"
        const usuarioForm = {
            cpf: $('#cpf').val(),
            senha: $('#senha').val(),
        }
        
        $.post(loginURL, JSON.stringify(usuarioForm), function(data){
                
            //if user not exists, return to index page
            if(data.doc_cli == 0){

                window.location.href = '/index.html';
            
            //if user exists, go to user html page	
            } else {
            
                sessionStorage.setItem("cpf", data.doc_cli);

                window.location.href = '/user.html';            
            }
                      
        }, "json");
        
    });
});





















