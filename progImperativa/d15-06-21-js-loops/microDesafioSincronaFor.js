//MICRO DESAFIOS 1
//1.1)Percorra o array abaixo e exiba seus elementos:
console.log('---------------------------\nExercicio 1.1:\n')

const pontos = [12, 34, 56, 34, 5, 8, 76, 4, 1, 90];
for (let i=0; i<pontos.length; i++){
    console.log(i,':',pontos[i]);}
console.log();

//2.1)Crie um array com valores diversos, percorra-o, altere e mostre seus elementos:
console.log('---------------------------\nExercicio 2.1:\n')

let novaArr = ['A','B','C','D','E','F','G'];
for (let i=0; i<novaArr.length; i++){
    novaArr[i] = Math.floor(Math.random() * 100);//altera a array, gera numeros aleatorios de 0 a 100
    console.log('Indice', i,'alterado:', novaArr[i]);}
console.log();

//3.1)Crie outro array, percorra-o, altere, salve e exiba seus elementos:
//Obs: Neste exercício, utilize funções e domínios separados, ou seja, salvar é uma coisa e exibir é outra. 
//Sendo assim, nem tudo deve ser feito junto.
console.log('---------------------------\nExercicio 3.1:\n')

let novaArr2 = [1,2,3,4,5,6,7,8,9,10];

function exibirArr(arr){
    console.log('Array encontrada, possui',arr.length,'elementos');
    console.log('Imprimindo:');
    for (let i=0; i<arr.length; i++){
        console.log(i,':',arr[i]);}}

exibirArr(novaArr2); console.log();

function alterarArr(arr){
    //let arrAlterada = [];
    for(let i=0;i<arr.length;i++){
        arr[i] = Math.floor(Math.random() * 100);}
    //arr=arrAlterada;
    console.log('Array alterada com sucesso! Numeros aleátorios foram inseridos');}

alterarArr(novaArr2); console.log();
exibirArr(novaArr2); console.log();

//4.1)Crie um último array, percorra-o, selecione os elementos, salve e mostre-os:
console.log('---------------------------\nExercicio 4.1:\n');
let novaArray3 = [3,5,8,10,52,36,85,9,4,33];

//2.EXTRAS:
//1.2)Escrever um programa que imprime 25 termos da série 11 - 22 - 33 - 44, etc. 
console.log('---------------------------\nExercicio 1.2:\n');
let numero=0;
for (let i=1; i<=25;i++){
    numero=numero+11;
    console.log(numero);}

//2.2 2) Mostrar os múltiplos de 8 até o valor 500. A tela deve mostrar 8 -16 -24;
console.log('---------------------------\nExercicio 2.2:\n');
numero=0;
for (let i=1; i<=500;i++){
    numero=numero+8;
    console.log(numero);}

//3.2 3) Usando FOR, desenvolver um programa que mostre a tabuada de 5.
console.log('---------------------------\nExercicio 3.2:\n');
for (let i=1; i<=10; i++){
    console.log(i,'x 5 =',i*5);}
