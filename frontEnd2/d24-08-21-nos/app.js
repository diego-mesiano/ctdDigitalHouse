//Armazenamos na variável "botaoVerMais" a criação de um botão.
var botaoVerMais = document.createElement("button");
//Armazenamos na variável "botaoTexto" a criação de um nó de texto 
//que diz "Ver mais".
var botaoTexto = document.createTextNode("Ver mais");
//Nós aderimos ao nosso botão o nó de texto criado anteriormente 
//acessando sua variável. E então, aderimos o botão ao corpo do 
//documento.
botaoVerMais.appendChild(botaoTexto);
document.body.appendChild(botaoVerMais);

//-------------------------------

//Selecionamos um elemento do HTML
let elemento = document.querySelector("#imagem");
//Consultamos se tem um atributo src
elemento.hasAttribute("src"); // true

//Selecionamos um elemento do HTML
let elemento = document.querySelector("#imagem");
//Pedimos o valor do atributo
elemento.getAttribute("src"); // imagem.jpg

//Selecionamos um elemento do HTML
let elemento = document.querySelector("#imagem");
//Excluímos o valor do atributo
elemento.removeAttribute("src");

//Selecionamos um elemento do HTML
let elemento = document.querySelector("#imagem");
//Adicionamos o atributo com seu valor
elemento.setAttribute("src", "imagem.jpg");