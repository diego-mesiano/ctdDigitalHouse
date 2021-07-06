let letras = ['a','b','c','d'];

let letrasMai = letras.map(function maiuscula(el){
    return el.toUpperCase();
})

console.log(letras);
console.log(letrasMai);

//com arrow function

let letrasMai2=letras.map(maiuscula=el=>el.toUpperCase());
console.log(letrasMai2);