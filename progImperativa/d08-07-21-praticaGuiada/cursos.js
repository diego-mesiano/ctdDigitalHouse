/*  Micro desafio - Passo 3


Em um arquivo diferente, crie o objeto literal curso que tem como atributos: nome do curso (string), nota de aprovação (number), 
faltas máximas (number) e uma lista de estudantes (um array composto pelos alunos criados no passo 1).*/

/*Micro desafio - Passo 4
Crie o método que permite adicionar alunos à lista do curso, ou seja, quando chamamos nosso método em nosso objeto curso, 
deverá adicionar um aluno a mais na propriedade lista de estudantes do objeto curso.*/

/*Micro desafio - Passo 5
Crie um método para o objeto curso que receba um aluno (como parâmetro) e retorne true se ele aprovou no curso ou false em caso de reprovação.
Para ser aprovado, o aluno tem que ter uma média igual ou acima da nota de aprovação  e ter menos faltas que faltas máximas. 
Se tiver a mesma quantidade, tem que estar 10% acima da nota de aprovação.*/

/*Micro desafio - Passo 6
Crie um método para o objeto curso que percorra a lista de estudantes e retorne um array de booleanos 
com os resultados se os alunos aprovaram ou não.*/ 



let Aluno = require('./construtor_aluno'); // importantando a função contrutora de objetos
arrAlunos = require('./estudantes'); // importa os alunos

let Curso = { // criando objeto literal
    nome:"HTML",
    nota_aprov: 7,
    faltas_maxima: 2,
    alunos_inscritos: arrAlunos,
    inserir_alunos: function(nome,faltas,nota){ //função para adicionar aluno novo na ultima posição do array
        return arrAlunos.push(new Aluno(nome,faltas,nota)); //metodo push atribui um valor ao ultimo indice de um array
    },
    verificar_aprovacao: function(aluno){ //função para verificar aprovação do aluno
        //console.log('**Verificador de Aprovação**\n');
        //console.log('Aluno',aluno.nome+', obteve média',aluno.calcularMedia(),'e faltou',aluno.faltas,'vezes.');
        
        if (aluno.faltas == this.faltas_maxima && aluno.calcularMedia()>(this.nota_apov*0.10)+this.nota_aprov){//verifica primeiro se as faltas são iguais ao maximo do curso e se a nota é maior q 10% da nota de aprovação
            //console.log('Aluno reprovado!');
            return false;
        }
        else
        {   
            if (aluno.calcularMedia() >= this.nota_aprov && aluno.faltas <= this.faltas_maxima){ //se a condição de cima for falsa verifica se a nota de aprovação e faltas estão de acordo com o curso
                //console.log('Aluno Aprovado!');
                return true;
            }
            else
            {
                //console.log('Aluno reprovado!');
                return false;
            }
            
        }
    },
    retorno_de_aprovacoes: function(){ //retorna um array com as aprovações e reprovações
        let arr = []; //cria o array a ser retornado
        //pesquisar e melhorar, existe um metodo de array que faz isso
        for (let i=0;i<arrAlunos.length;i++){ //varre a array alunos
            arr[i]=this.verificar_aprovacao(arrAlunos[i]); //atribui o resultado da função ao novo array
        }
        return arr;
    }
};

//Area de testes, manter comentado abaixo:
//console.log(Curso);
//Curso.inserir_alunos('Joãozinho',50,[1,0,1,1]);
//console.log(Curso);
//Curso.verificar_aprovacao(arrAlunos[7]);
//console.log(Curso.retorno_de_aprovacoes());

