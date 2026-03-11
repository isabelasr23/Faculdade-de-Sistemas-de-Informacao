const steps = document.querySelectorAll(".step")

let etapaAtual = 0


const titulo = document.getElementById("titulo-topo")
const descricao = document.getElementById("descricao-topo")


const textos = [

{
titulo:"Criar conta",
descricao:"Informe seus dados de acesso"
},

{
titulo:"Dados pessoais",
descricao:"Conte um pouco sobre você"
},

{
titulo:"Objetivo",
descricao:"Qual seu objetivo?"
},

{
titulo:"Nível",
descricao:"Qual seu nível de treino?"
}

]


function mostrarEtapa(index){

steps.forEach(step => {

step.classList.remove("active")

})

steps[index].classList.add("active")


titulo.textContent = textos[index].titulo
descricao.textContent = textos[index].descricao

}



document.querySelectorAll(".next").forEach(botao => {

botao.addEventListener("click", () => {
if (etapaAtual < steps.length - 1) {
    etapaAtual++
    mostrarEtapa(etapaAtual)
}
})

})


document.querySelectorAll(".prev").forEach(botao => {

botao.addEventListener("click", () => {
if (etapaAtual > 0) {
    etapaAtual--
    mostrarEtapa(etapaAtual)
} else {
    // Se estiver na primeira etapa (index 0), volta para a tela splash
    window.location.href = "splash.html"
}
})

})

// Inicializa a primeira etapa com os textos corretos
mostrarEtapa(0)