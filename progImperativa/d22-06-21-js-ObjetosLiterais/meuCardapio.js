//Crie uma função construtora chamada Restaurante, que receba como parâmetros 
//o nome do restaurante e o cardápio (que será um array de strings).
//Após isso chame a função entrada() dentro do objeto, que irá trazer uma mensagem de boas-vindas, 
//informando o nome do restaurante, e o cardápio.


function Restaurante (nome, cardapio){
    this.nome = nome;
    this.cardapio = cardapio;
    entrada = function() { return console.log('Seja bem vindo ao',this.nome,'. Hoje temos de rango:',this.cardapio)}
    this.entrada();
};
Restaurante ('Bar do Marcão',['Almondega','Bife','Ovo']);