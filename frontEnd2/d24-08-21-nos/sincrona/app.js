//Crie um formulário
let formulario = document.createElement("form");
document.body.appendChild(formulario); 

//Selecione o formulário e salve-o numa variável com 
//querySelector.
formulario = document.querySelector("form");

//Itens a seguir serão inseridos dentro do formulário:

//Um título com o texto: “Login”.
let h1 = document.createElement("h1"); //cria o elemento h1 
let txtH1 = document.createTextNode("Login"); //cria o texto do elemento h1
formulario.appendChild(h1); // diz que h1 é elemento filho de form
h1.appendChild(txtH1); // diz que o texto é elemento filho de h1

//Um campo de input text com um placeholder: “Email”.
let input = document.createElement("input");//cria elemento input
formulario.appendChild(input); // diz que o elemento input é filho de form
input = document.querySelector("input"); // armazena o input na variavel
input.setAttribute("placeholder","Email"); // adiciona o atributo placeholder ao input
input.setAttribute("type","email");

//Um campo de input password com um placeholder: “Senha”.
let inputSenha = document.createElement("input");// cria segundo elemento input 
formulario.appendChild(inputSenha);//diz que elemento input é filho de form
inputSenha = document.querySelectorAll("input")[1]; // seleciona o segundo input do form, acessando através de seu indice [1]
inputSenha.setAttribute("placeholder","Senha") // adiciona atributo placeholder
inputSenha.setAttribute("type","password");

//Um botão submit com o texto “Enviar”.
let btnEnviar = document.createElement("button"); // cria elemento botão
let txtBtnEnviar = document.createTextNode("Enviar") // texto que será filho de botão
formulario.appendChild(btnEnviar); // torna botão filho de form
btnEnviar = document.querySelector("button"); // seleciona o botão criado
btnEnviar.appendChild(txtBtnEnviar); // da texto ao botão
btnEnviar.setAttribute("type","submit"); // muda o atributo para torna-lo um botão submit

//Um botão reset com o texto “Cancelar”.
let btnCancelar = document.createElement("button"); // cria elemento botão 2
let txtBtnCancelar = document.createTextNode("Cancelar");
formulario.appendChild(btnCancelar);
btnCancelar = document.querySelectorAll("button")[1];
btnCancelar.appendChild(txtBtnCancelar);
btnCancelar.setAttribute("type","reset");

//Insira a propriedade disabled no campo de Email.
input.setAttribute("disabled","");

//Insira um estilo da sua escolha, 
//a sugestão seria o display flex 
//com flex-direction column.

//Remova o atributo placeholder do email.
input.removeAttribute("placeholder");

document.querySelector("button").style.backgroundColor = "Green";