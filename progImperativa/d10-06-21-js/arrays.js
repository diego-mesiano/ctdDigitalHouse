/*Vamos fixar nosso conhecimento sobre Arrays explorando diferentes comandos sobre ele. 
Veremos se eles se comportam como esperamos ou se ocorrem resultados inesperados.

Em primeiro lugar, vamos praticar os comandos mais comuns e necessários:

1)Acesse elementos específicos de um array.
2)Percorra um Array  e modifique cada um de seus elementos. NÃO FAZER NESSE MOMENTO
3)Adicione elementos a um array.
4)Exclua elementos de um array.
5)Compare elementos de um array com elementos de outro array. NÃO FAZER NESSE MOMENTO

Micro Desafios:

1)O líder técnico da equipe precisa conhecer a estrutura de dados do novo projeto. Para isso, devemos:
Criar um arquivo arrays.js que contenha o código:
let filmes = ["star wars", "clube da luta",  "o poderoso chefão", "top gun",  "interestelar"]
Verificamos se tudo funciona bem se solicitarmos o segundo elemento do array e for "clube da luta".

2)NÃO FAZER POR ENQUANTO: No mesmo arquivo, coloque todos os elementos em letras MAIÚSCULAS utilizando  .toUpperCase() para cada elemento.

3)Enquanto trabalhava no exercício 2, descobrimos que também há outro array no código, mas com filmes animados. 
let cartoons = ["toy story", "Procurando Nemo", "kung-fu panda", "wally", "fortnite"]

4)No mesmo arquivo, crie este array e uma função que adiciona cada elemento do array de desenhos animados (cartoons) ao array de filmes. 

5)Um dos desenvolvedores avisou que a última animação é na verdade um jogo, então remova esse último elemento do array de desenhos 
animados (cartoons) antes de passá-los para os filmes.

6)NÃO FAZER POR ENQUANTO: Por fim, eles nos enviam dois arrays com as avaliações feitas por diferentes usuários do mundo desses filmes, da seguinte forma:
const asiaScores = [8, 10, 6, 9, 10, 6, 6, 8];
const euroScores = [8, 10, 6, 8, 10, 6, 7, 9]; 

Eles nos pedem para criar uma função que compare as notas e nos diga se elas são iguais ou diferentes. Eles confirmam que estão na 
respectiva ordem e que trazem apenas valores numéricos de 1 a 10. Para verificar se tudo está bem até agora, recomendamos testar cada 
uma das funções e testar seu funcionamento correto.

Se chegarmos a este ponto e tudo estiver bem, o líder técnico da equipe deve estar extremamente feliz com nosso trabalho e desempenho. 
Bom trabalho!
*/

let filmes = ["star wars", "clube da luta",  "o poderoso chefão", "top gun",  "interestelar"]

//1)Acesse elementos específicos de um array.
console.log('Acessando posição 0:',filmes[0]);
console.log('Acessando posição 3:',filmes[3]);

//2)Percorra um Array  e modifique cada um de seus elementos. NÃO FAZER NESSE MOMENTO
console.log('\nVoltar quando aprender!');

//3)Adicione elementos a um array.
filmes[5]="rambo"; //adicionei na posição 5
filmes.push('madagascar','a vida é bela'); //adicionei mais dois elementos nas ultimas posições
filmes.unshift('haniball','minha mãe é uma peça'); // adicionei mais dois elementos no inicio da array
console.log('\nNossa array ficou assim:',filmes);

//4)Exclua elementos de um array.
filmes.splice(2, 1); //apaga um elemento da array sendo (posição, quantidade de itens a remover). Nesse caso removeremos 'star wars'
console.log('Removendo "star wars":',filmes);
filmes.shift(); // removendo o primeiro elemento
filmes.pop(); // removendo o ultimo elemento
console.log('E nossa array ficou assim:',filmes);

//5)Compare elementos de um array com elementos de outro array. NÃO FAZER NESSE MOMENTO
console.log('\nVoltar quando aprender!');

console.log('\n--------------------------------------------------------------------\n');

//AGORA OS DESAFIOS:
/*1)O líder técnico da equipe precisa conhecer a estrutura de dados do novo projeto. Para isso, devemos:
Criar um arquivo arrays.js que contenha o código:
let filmes = ["star wars", "clube da luta",  "o poderoso chefão", "top gun",  "interestelar"]
Verificamos se tudo funciona bem se solicitarmos o segundo elemento do array e for "clube da luta".*/

var filme = ["star wars", "clube da luta",  "o poderoso chefão", "top gun",  "interestelar"];
if (filme[1] == "clube da luta"){
    console.log('Está tudo bem, "',filme[1],'" na posição 2! =)');
}else
{
    console.log('Nada bem! =(');
}

/*2)NÃO FAZER POR ENQUANTO: No mesmo arquivo, coloque todos os elementos em letras MAIÚSCULAS 
utilizando  .toUpperCase() para cada elemento.*/

//for (let i = 0; i < filme.length; i++){
//    filme[i] = filme[i].toUpperCase();
//}

//console.log('TUDO EM MAISCULO:',filme);
console.log('\nTudo normal:',filme);



function arrayMaiuscula(InserirArray){ //Cria Função que transforma uma array em maiuscula
    let permanente = []; //receberá a array transformada
    for (let j = 0; j < InserirArray.length; j++){//varre a array de acordo com o seu tamanho através do .lenght
        permanente[j] = InserirArray[j];//transfere os valores originais para a nova variavel
        permanente[j] = permanente[j].toUpperCase();}//converte o texto da array em maiusculo através do .toUpperCase
    return permanente;}//retorna a array transformada, é necessario atraibuir a uma variavel array
filme=arrayMaiuscula(filme); //deve se atribuir a ele mesmo ou outra array para aplicar as mudanças
console.log('Tudo maiusculo:',filme);

//3)Enquanto trabalhava no exercício 2, descobrimos que também há outro array no código, mas com filmes animados. 
//let cartoons = ["toy story", "Procurando Nemo", "kung-fu panda", "wally", "fortnite"]
//4)No mesmo arquivo, crie este array e uma função que adiciona cada elemento do array de desenhos animados (cartoons) ao array de filmes.

let cartoons = ["toy story", "Procurando Nemo", "kung-fu panda", "wally", "fortnite"];
let juncao = filme.concat(cartoons);
filme=juncao;
console.log('\nArrays concatenadas com sucesso!',filme);

//5)Um dos desenvolvedores avisou que a última animação é na verdade um jogo, então remova esse último elemento do array de desenhos 
//animados (cartoons) antes de passá-los para os filmes.

filme.pop();
console.log('\nRemovido ultimo elemento "fortinite" com sucesso!',filme);


/*6)NÃO FAZER POR ENQUANTO: Por fim, eles nos enviam dois arrays com as avaliações feitas por diferentes usuários do mundo desses filmes, 
da seguinte forma:
const asiaScores = [8, 10, 6, 9, 10, 6, 6, 8];
const euroScores = [8, 10, 6, 8, 10, 6, 7, 9]; 

Eles nos pedem para criar uma função que compare as notas e nos diga se elas são iguais ou diferentes. Eles confirmam que estão na 
respectiva ordem e que trazem apenas valores numéricos de 1 a 10. Para verificar se tudo está bem até agora, recomendamos testar cada 
uma das funções e testar seu funcionamento correto.*/

const asiaScores = [8, 10, 6, 9, 10, 6, 6, 8];
const euroScores = [8, 10, 6, 8, 10, 6, 7, 9]; 

for(let i=0; i<asiaScores.length; i++){
    console.log('Trabalhando no indice',i,'\nComparando',asiaScores[i],'com',euroScores[i],'......');
    if (asiaScores[i] == euroScores[i]){
        console.log('Igual!\n');
    }else{
        console.log('Diferente!!\n');
    }
}



