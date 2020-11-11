$(document).ready(function() {

    var score = Math.floor(Math.random() * 3)
    alert(score)

    if (score == 0) {
        var userScore = document.getElementById("userScore")
        userScore.style.color = "red"
        userScore.innerHTML = "<h3>Vermelho</h3>"
        var scoreBar = document.getElementById("scoreBar")
        scoreBar.className = "determinate red"
        scoreBar.style.width = "20%"
    }
    else if (score == 1) {
        var userScore = document.getElementById("userScore")
        userScore.style.color = "yellow"
        userScore.innerHTML = "<h3>Amarelo</h3>"
        var scoreBar = document.getElementById("scoreBar")
        scoreBar.className = "determinate yellow"
        scoreBar.style.width = "60%"
    }
    else if (score == 2) {
        var userScore = document.getElementById("userScore")
        userScore.style.color = "green"
        userScore.innerHTML = "<h3>Verde</h3>"
        var scoreBar = document.getElementById("scoreBar")
        scoreBar.className = "determinate green"
        scoreBar.style.width = "100%"
    }

})