/*Programação Imperativa

Prática Guiada - Parte 1
  Objetivos


Vamos realizar uma série de exercícios conectados entre si. O objetivo é trabalhar um pouco 
com exercícios que dependem da etapa anterior para manter uma linha de trabalho.
Importante: Ao final, lembre-se de enviar o código completo para o Github, compartilhando o link do projeto com seus professores.
  Micro desafio - Passo 1


Crie um objeto aluno que tenha como atributos: nome (string), quantidade de faltas (number) e notas (array de números). 
Crie um construtor para ele e importe-o como o módulo aluno.*/

/*Micro desafio - Passo 2


Nosso objeto aluno terá o método calcularMedia que retorna a média de suas notas. Também terá um método chamado faltas, 
que simplesmente aumenta o número de faltas em 1.*/

const Aluno = function(nome, faltas, notas){ //criando função contrutora para instanciar o objeto e criar novos alunos
    this.nome = nome;
    this.faltas = faltas;
    this.notas = notas;
    this.calcularMedia =_=>{ //metodo para calcular a media do objeto instanciado
        let total = this.notas.reduce(function(total, numero){ //utilizado metodo de array reduce para somar o conteudo da array notas
            return total+numero;
        });
        total = total / this.notas.length; //lenght para saber o tamanho do array notas para poder fazer a divisão correta para obter a média
        return total;
    }
    this.addFalta =_=> this.faltas++; //metodo para acrescentar 1 falta
}

module.exports = Aluno; //exportando

//Area de testes, manter comentado abaixo
/*let aluno1 = new Aluno('Diego',0,[9,10,5,10]); //teste da função contrutora
console.log('Média',aluno1.calcularMedia());
console.log('Faltas antes de aplicar o método:',aluno1.faltas);
aluno1.addFalta();
aluno1.addFalta();
aluno1.addFalta();
console.log('Faltas depois de aplicar o método 3 vezes:',aluno1.faltas);
console.log(aluno1)*/


