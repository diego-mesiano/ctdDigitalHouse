//exemplos de template string

//dentro das chaves pode-se executar qualquer código JS,
//para as boas praticas, é recomendando utilizar codigos o mais
//curto possivel.

const nome = "Mauro";
let meuTemplate = `Meu nome é ${nome}`;
console.log(meuTemplate);
meuTemplate = `2 * 3 é ${2*3*2}`;
console.log(meuTemplate);

const soma=(var1, var2)=>{
    return var1+var2;
}
const temp = `O resultado é ${soma(10,2)}`;
console.log(temp+"\n\n\n");