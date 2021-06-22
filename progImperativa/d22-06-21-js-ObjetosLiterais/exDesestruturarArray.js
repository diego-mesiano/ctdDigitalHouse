//array frutas
let frutas=['Morango','Manga','Limão'];
// desestruturar = separar
//console.log(frutas);
//let nomeFruta = frutas;
//console.log(nomeFruta);

let [fruta1, fruta2, fruta3] = frutas;
console.log (fruta1, fruta2);
fruta2 = 'Tomate';
console.log(fruta1, fruta2.toUpperCase());

//desestruturou um array