/*  Micro desafio - Passo 7
Importe o módulo estudantes.js, que contém uma lista de alunos, dentro do arquivo que contém o objeto curso. 
Substitua o conteúdo da propriedade lista de estudantes, pela lista de estudantes do arquivo estudantes.js e 
garanta que sigam funcionando todos os métodos corretamente. (revisar que o arquivo tenha todos os métodos corretamente).*/

let Aluno = require('./construtor_aluno'); // importantando a função contrutora de objetos
let arrAlunos = []; // criado array para armazenar os alunos

//abaixo adicionar os novos aluno
arrAlunos[0] = new Aluno('João',3,[1,7,5,10]);
arrAlunos[1] = new Aluno('Aline',4,[3,10,2,10]);
arrAlunos[2] = new Aluno('Pedro',0,[10,8,6,7]);
arrAlunos[3] = new Aluno('Amanda',10,[10,8,9,7]);
arrAlunos[4] = new Aluno('Gertrudes',0,[3,4,8,5]);
arrAlunos[5] = new Aluno('Fernando',2,[10,3,1,1]);
arrAlunos[6] = new Aluno('Manoel',1,[8,5,10,10]);
arrAlunos[7] = new Aluno('Mathias',0,[5,5,5,5]);
arrAlunos[8] = new Aluno('Roseli',0,[3,7,8,1]);
arrAlunos[9] = new Aluno('Jenifer',6,[10,8,7,5]);
arrAlunos[10] = new Aluno('Agatha',1,[10,5,9,4]);
arrAlunos[11] = new Aluno('Gabi',0,[10,10,10,10]);
arrAlunos[12] = new Aluno('Leonidas',28,[5,2,2,3]);
arrAlunos[13] = new Aluno('Cupertino',1,[10,10,5,8]);

module.exports = arrAlunos; //exportando 