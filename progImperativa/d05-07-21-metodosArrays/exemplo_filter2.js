const numeros = [1,2,3,4,5,7,8,9,19];

const numerosPares=numeros.filter(el=>el%2==0);
const numerosImpares=numeros.filter(el=>el%2!=0);

console.log(numerosPares);
console.log(numerosImpares);