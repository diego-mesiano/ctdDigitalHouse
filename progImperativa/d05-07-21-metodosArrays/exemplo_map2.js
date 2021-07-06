let salarios = [1050.00, 2000.00, 5000.00, 1000.00];
//reajustar salarios em 40%

let ajusta=(sal)=>sal*1.4; // arrow function para o map

let salAtualizados=salarios.map(ajusta);



console.log(salarios);
console.log(salAtualizados);

//ajustar o salario de quem ganha menos que 2000

ajusta2 = sal2 => sal2<2000 ? sal2*1.4  : sal2;
let salAtualizados2 = salarios.map(ajusta2);
console.log('\n',salAtualizados2);