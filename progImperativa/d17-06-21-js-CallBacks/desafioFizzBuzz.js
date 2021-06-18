// Neste exercício, você terá que criar uma função "FizzBuzz" que recebe dois parâmetros numéricos.
// A função deve atender aos seguintes requisitos:
// Você deve imprimir os números de 1 a 100;
// Se o número a ser impresso for um múltiplo de seu PRIMEIRO parâmetro, você deve imprimir a palavra “Fizz” em vez do número correspondente;
// Se o número a ser impresso for um múltiplo do seu SEGUNDO parâmetro, você deve imprimir a palavra "Buzz" em vez do número correspondente;
// Se o número for um múltiplo de AMBOS os parâmetros, você deve imprimir a palavra “FizzBuzz”.

let fizzBuzz = (par1,par2) => {
    for(let i = 1;i<=100;i++){
        if(i%par1==0 && i%par2==0){ 
            (console.log('FizzBuzz'));} 
        else {
            if(i%par1==0) console.log('Fizz'); else console.log(i);
            if(i%par2==0) console.log('Buzz'); else console.log(i);
            }
    }
}
fizzBuzz(2,2);

// Avançado: Como crédito extra, pense em como otimizar seu programa para que as palavras sejam passadas de forma dinâmica e seja você quem decide 
// quais palavras ele deve dizer.
console.log('\n-------------------------\n-------------------------\n')

let fizzBuzzPlus = (par1,par2,frase1,frase2,frase3) => {
    for(let i = 1;i<=100;i++){
        if(i%par1==0 && i%par2==0){ 
            (console.log(frase3));} 
        else {
            if(i%par1==0) console.log(frase1); else console.log(i);
            if(i%par2==0) console.log(frase2); else console.log(i);
            }
    }
}
fizzBuzzPlus(5,10,'Não Fatorial 1','Não fatorial 2','Ambos Fatoriais');

// O tech leader da equipe precisa criar um código onde seja calculado o número fatorial de um valor inteiro. Para isto, deveremos:
// Criar uma função que calcula o fatorial (soma dos seus antecessores até 1) usando loop (for);
// Recriar esta mesma função usando recursividade (sem o uso de for)

console.log('\n-------------------------\n-------------------------\n');
let fatorial = (n) =>{
    for (let i=n; i>1; i--) n = (i-1) + n;
    return n;
}

console.log('Fatorial', fatorial(500));



