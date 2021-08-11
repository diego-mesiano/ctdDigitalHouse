alert("Olá visitante");
alert("Abra seu console!");
console.log("Obrigado por abrir o console.");
let resultado = confirm("Cria uma mensagem na tela e espera uma resposta que retornará True ou False");
console.log("\nSeu clique retornou:", resultado);
if (resultado == true) alert("Clicou em OK"); 
    else alert("Clicou em Cancelar");

let nome = prompt("Insira seu nome:");

console.log("oi",nome);

alert("Ola " + nome);

document.querySelector("h1").innerText += " " + nome;
document.querySelector("h1").innerHTML +=  "<h2>Bem vindo</h2><h3>Inseri comandos HTML pelo JS</h3>";