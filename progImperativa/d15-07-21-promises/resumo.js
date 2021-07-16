/*PROMISES = PROMESSA

São funçoes que permitem executar código assincrono de modo
eficiente.

PEDIDOS SINCRONOS

São instruções executada em linha, da forma padrão

PEDIDO ASSINCRONO

São instruções que se executam mediante a um mecaniscmo 
especifico, por ex, um callback, promise ou evento. Possibilita 
que a resposta seja executada no momento adequado, seu comporta-
mento não é bloqueante pois a solicitação é executada em para-
lelo com o código.

*/
const fs = require('fs'); //importando a biblioteca que faz leitura d arquivos
//let arquivo=fs.readFileSync('./letras.txt','utf-8'); // ...sync é uma leitura sincrona
//sincrono
/*console.log(arquivo);
console.log(1);
console.log(2);
console.log(3);*/
/*
//assincrono //comando assincrono não pode armazenar em variavel
console.log(1); //primeiro a imprimir
fs.readFile('./letras.txt',(err,contents)=>{ //readfile é um comando assincrono só vai executar depois que todas as linhas forem executadas
    console.log(4); //quarto a imprimir
    console.log(String(contents)); // quinto a imprimir - aqui ele vai imprimir o conteudo do arquivo letras.txt
    console.log(err); //sexto a imprimir - aqui ele vai imprimir o erro, se houver ou imprime null
})
console.log(2); //segundo a imprimir
console.log(3); //terceiro a imprimir
*/

console.log(1);
fs.readFile('./letras.txt',(err,content)=>{
    fs.readFile('./nomes.txt',(err1,content1)=>{
        fs.readFile('./salarios.txt',(err2,content2)=>{
                //ISSO É UM CODIGO COM BARRIGA, CONHECIDO COMO HADOUKEN, É BOM EVITAR POIS É DICIL DE ENTENDER
                console.log(4);
                console.log('Letras:', String(content));
                console.log('erro letras:', err);
                console.log('Nomes:',String(content1));
                console.log('Erro nomes:',err1);
                console.log('Salarios:',String(content2));
                console.log('Erro Salarios:',err2);
        })
    })
})

//promises é um OBJETO (método CONSTRUTOR-new )que representa o sucesso ou a falha de uma operação ASSÍNCRONA
//estados das promises:  
// pending: Estado inicial (pendente), ainda não foi realizada, nem rejeitada.
// fulfilled: Houve sucesso na operação, a Promise está realizada.
// rejected: Houve rejeição na operação da Promise.
// settled: A Promise foi realizada ou rejeitada. (finalizada)
//promise é uma função

//forma sem hadouken
//const fs=require('fs');
console.log(1);
const lerArquivo= file => new Promise((resolve)=>{
     fs.readFile(file,(err,contents)=>{
         if (err){
             reject(err);
         }
         else {
             resolve(contents);
         }
     })
})

//consumindo a promise          ..argumento
lerArquivo('./letras.txt').then(contents=>{
    console.log(String(contents));
    lerArquivo('./nomes.txt').then(contents=>{
        console.log(String(contents));
        lerArquivo('./salarios.txt').then(contents=>
            {
                console.log(String(contents));
            })
    })
})

