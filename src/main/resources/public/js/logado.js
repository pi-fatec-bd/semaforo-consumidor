$(document).ready(function(){
			
    var userName = sessionStorage.getItem("cpf");
        
        if(userName == null){
        
            window.location.href = '/index.html';
        
        }
    
});