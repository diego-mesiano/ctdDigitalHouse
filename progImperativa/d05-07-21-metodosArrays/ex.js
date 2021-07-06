/*
1.Crie um array de números pares, e utilizando a função .map() nesse array, crie um novo array com apenas números ímpares.

2.Crie um array de nomes, que possua dois índices com o nome Maria. Utilize o .filter() para obter apenas esses dois índices com o nome Maria.

3.Crie um array de números e utilize a função .reduce() para devolver uma string com os números formatados.

Exemplo [1,5,9,3,7] => “1 – 5 – 9 – 3 – 7”


4.Crie um array de animais, após isso passe por cada índice utilizando o .forEach() e imprima a frase “O animal é NOME_DO_ANIMAL”.
*/

//1
console.log('\n1)\n');

let pares = [0,2,4,6,8,10,12,14,16,18,20];

let impares = pares.map(function(valor){
    return valor + 1;
});

console.log(impares);

//2

console.log('\n2)\n');

let nomes = ['Diego','João','Maria','Donizete','Marcos','Amanda','Maria','Leticia'];

let procuraMaria = nomes.filter(function(nome){
    return nome=='Maria';
});

console.log(procuraMaria);

//3

console.log('\n3)\n');

let numbers = [1,2,3,4,5,6,7,8,9];

let devolveFormatado = numbers.reduce(function(acumulador, numero){
    return acumulador + " - " + numero;
});

console.log(devolveFormatado);

//4
console.log('\n4)\n');

let animais = ['Leão','Tigre','Hipopotamo','Arara','Jacaré'];

let msgAnimais = animais.forEach(function(animal){
    console.log ('O nome do animal é: ', animal);
});

msgAnimais;

