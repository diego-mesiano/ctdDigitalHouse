/*Crie um objeto, contendo int, string, object e array em seu conteúdo. 
Após isso transforme o array em JSON. Exiba o valor do JSON, 
copie e valide no site JSON Formatter & Validator

Pegue o JSON validado na etapa anterior, e o atribua a uma string. 
Após isso o transforme em um objeto e acesse alguns de seus valores 
e os exiba.*/

let objeto = {
    nome: 'Diego',
    idade: 20,
    filiacao: {
        pai: 'Papai',
        mae: 'Mamãe',
    },
    carros: ['Cruse','Civic','Jetta'],

};

//convertendo JS para JSON

let converteemjson = JSON.stringify(objeto);

console.log(objeto);
console.log(converteemjson);

//convertendo JSON para JS

let converteemjs = JSON.parse(converteemjson);

console.log(converteemjs);

//acessando dados

console.log('\n', converteemjs.nome, '\n', converteemjs.idade, '\n', converteemjs.filiacao, '\n', converteemjs.carros);





