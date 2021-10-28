import org.apache.log4j.Logger;

public class Tigre {
    public static Logger logger = Logger.getLogger(Tigre.class);

    private String nome;
    private int idade;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void correr(){
        logger.info("O Tigre " + nome + " esta correndo!");
    }

    public void ehMaiorQue10() throws Exception{
        if(idade>10){
            logger.info("O Tigre" + nome + " é maior que 10 anos e é Alpha!");
        }else if(idade<10 && idade>0){
            logger.info("O Tigre" + nome + " não tem idade para correr!");
        }else{
            logger.error("A idade não pode ser negativa");
            throw new Exception();
        }
    }
}
