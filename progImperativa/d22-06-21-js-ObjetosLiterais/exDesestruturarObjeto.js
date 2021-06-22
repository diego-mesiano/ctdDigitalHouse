let pessoa = {
    nomeCompleto: "José",
    sexo: "m",
    cpf: "123.456.789"
}
//desestruturou um objeto abaixo
let {nomeCompleto,sexo,cpf,nascimento,renda}=pessoa;

console.log(nomeCompleto); //criamos uma variavel para cada propriedade 
console.log(sexo);
console.log(cpf);