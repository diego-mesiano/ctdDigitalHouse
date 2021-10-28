import org.apache.log4j.Logger;

public class Leao {

    public static Logger logger = Logger.getLogger(Leao.class);

    private String nome;
    private int idade;
    private boolean ehAlpha;

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

    public boolean isEhAlpha() {
        return ehAlpha;
    }

    public void setEhAlpha(boolean ehAlpha) {
        this.ehAlpha = ehAlpha;
    }

    public void correr(){
        logger.info("O Leão " + nome + " esta correndo!");
    }

    public void ehMaiorQue10() throws Exception{
        if(idade>10 && isEhAlpha()){
            logger.info("O leão" + nome + " é maior que 10 anos e é Alpha!");
        }else if(idade<10 && idade>0) {
            logger.info("O leão" + nome + " tem menos de 10 anos!");
        }else if(idade>10 && !isEhAlpha()){
            logger.info("O leão" + nome + " é maior que 10 anos e é Beta!");
        }else{
            logger.error("A idade não pode ser negativa");
            throw new Exception();
        }
    }
}
