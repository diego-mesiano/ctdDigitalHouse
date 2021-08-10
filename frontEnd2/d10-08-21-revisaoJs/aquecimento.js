/*
A fim de revermos alguns conceitos aprendidos anteriormente, realize esse estudo de caso
com os colegas de sua mesa. Codificando o que for pedido usando a ferramenta VS Code.

A secretaria de uma escola contratou a sua empresa para desenvolver sua plataforma de
gestão de alunos, sendo uma dessas partes a criação de um sistema que calcule as notas
obtidas ao longo do semestre, Você e seu grupo fazem parte da equipe responsável por
implementar esta funcionalidade no sistema.

Para isso, crie um script que permita adicionar uma sequência de números (um array de
números) consecutivamente para receber as notas dos 4 bimestres. Após isso, crie uma
estrutura na qual todos os números do array sejam somados sequencialmente: o primeiro
número seja somado ao segundo e o resultado seja impresso no console. Então,
temos que pegar esse resultado e adicionar o terceiro número a ele, e assim por
diante, até terminarmos de percorrer o array. Seguindo a lógica do exemplo a seguir:

Por fim, a soma desses números deve ser dividida pelo total de bimestres (4) para calcular a
média e guardada em uma variável, a qual deve ser exibida no console.

Micro desafios - Etapa II - Extra (Para quem terminar
antes dos 50 minutos)

Terminada esta etapa é hora de preparar o código para ficar mais amigável ao usuário final,
com mensagens que informem a nota do aluno e sua condição:
1. Utilizando a função console.log informe a nota que o aluno teve em cada um dos
bimestres e por fim sua nota final. Por exemplo: “Parabéns pela conclusão do primeiro
bimestre. Sua nota foi: 8.”;
2. Após mostrar a nota final, crie uma estrutura de decisão que informe se o aluno foi
aprovado ou não, sendo a média da escola 7.
3. Por fim, comente as etapas do código.
*/

//DECLARAÇÃO DAS VARIÁVEIS
let nota = [7,7,7,7,7,7];
let soma=nota[0];
let media;

//PERCORRE A VARIÁVEL NOTA E SOMA OS VALORES
for(let i=1;i<nota.length;i++){
    soma+=nota[i];
    console.log('Soma'+ i +'= ' + soma);
}

//CALCULA A MÉDIA
media = soma / nota.length;

//IMPRIME A MÉDIA
console.log('\nMedia =',media);

//PERCORRE A VARIAVEL E IMPRIME AS NOTAS NA TELA
for (let i=0;i<nota.length;i++){
    console.log('Nota bimestre',i+1, '=' + nota[i]);
}
//IMPRIME A MÉDIA NA TELA
console.log ('Média = ',media);

//VERIFICA SE O ALUNO FOI APROVADO OU NÃO
media >= 7 ? console.log('Aprovado') : console.log("Reprovado"); 
