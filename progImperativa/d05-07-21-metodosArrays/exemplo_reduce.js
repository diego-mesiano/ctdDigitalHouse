//reduce = percorre o array e retorna um unico valor

const numeros = [1,2,-3,4,5,0,7,8,9,19];

console.log(numeros.reduce((total,el)=>total+el));

// outro exemplo , transformar em string

const resultado = numeros.reduce((acumulador, atual, i)=>console.log('Loop', i, '-', acumulador, ':', atual))