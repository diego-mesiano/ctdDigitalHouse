/*Deve-se criar unit test para as funções do arquivo funcionalidad.js:
init( )
limpar( )
resetar( )
resolver( )
*/


const { resetar, limpar, init, resultado } = require("../funcionalidad");
//const elemento = document.querySelector("span");

test('Limpar o imput',()=>{
    init();
    resultado.textContent = "10";
    
    limpar();
    expect(elemento.textContent).toBe("");
})