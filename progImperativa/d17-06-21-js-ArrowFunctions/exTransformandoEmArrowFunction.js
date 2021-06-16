/*Transforme as seguintes funções em arrow functions:

function print(mensagem){
    console.log(mensagem);
}*/

let print = mensagem => console.log(mensagem);
print('Olá, bom dia');

/*function soma(n1+n2){
    return n1 + n2;
}*/

let soma = (n1,n2) => n1+n2;
console.log('Somando: ', soma(10,10));