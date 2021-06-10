/*Objetivo: Entender e aplicar as funções auxiliares relacionadas ao array.

Crie um array que contenha nomes de produtos para compra.
Após isso, exiba no console os resultados das funções relacionadas aos arrays,
que são: Join, Pop, Push, Shift e Unshift.
Também se deve escrever com suas palavras, o que cada função realiza.
Seguem abaixo alguns exemplos.
console.log(“O método Join realiza tal coisa”)
console.log(RESULTADO_DO_JOIN)*/

let produtos = ['Maça','Banana','Pera','Melancia','Uva'];

console.log('O método Join junta os elementos de uma array em formato de string usando os separados que quisermos, nesse caso o "-"');
console.log(produtos.join('-'));

console.log('\nO método Pop elimina o ultimo elemento de uma array, retorna o elemento eliminado');
console.log('Segue o retorno no metodo Pop: '+produtos.pop()+'\nAqui como ficou nossa array: '+produtos);

console.log('\nO método Push adicona um ou mais elementos no final de nossa array, retorna o indice do ultimo elemento adicionado');
console.log('Segue o retorno no metodo Push: '+produtos.push('Abacaxi')+'\nAqui como ficou nossa array: '+produtos);

console.log('\nO método Shift elimina o primeiro elemento de uma array, retorna o elemento eliminado');
console.log('Segue o retorno no metodo Shift: '+produtos.shift()+'\nAqui como ficou nossa array: '+produtos);

console.log('\nO método Unshift adiciona um elemento ou mais no inicio de uma array, retorna o tamanho atual da array');
console.log('Segue o retorno no metodo Unshift: '+produtos.unshift('Jaca')+'\nAqui como ficou nossa array: '+produtos);