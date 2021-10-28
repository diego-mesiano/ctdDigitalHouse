import org.apache.log4j.Logger;

import java.util.concurrent.ExecutionException;

public class Test {
    private static Logger logger = Logger.getLogger(Test.class);

    public static void main(String[] args) {
        Leao leao = new Leao();
        leao.setNome("Léo");
        leao.setEhAlpha(true);
        leao.setIdade(5);
        leao.correr();

        try{
            leao.ehMaiorQue10();
        }catch(Exception e){
            logger.error("A idade do leão "+leao.getNome()+" está incorreta", e);
        }

        Leao leao2 = new Leao();
        leao2.setIdade(-20);
        leao2.setNome("Joarez");
        leao2.setEhAlpha(false);
        leao2.correr();

        try{
            leao2.ehMaiorQue10();
        }catch (Exception e){
            logger.error("A idade do leão "+leao2.getNome()+" está incorreta", e);
        }

        Tigre tigre = new Tigre();
        tigre.setNome("Tigrão");
        tigre.setIdade(8);
        tigre.correr();

        try{
            tigre.ehMaiorQue10();
        }catch(Exception e){
            logger.error("A idade do tigre "+tigre.getNome()+" está incorreta", e);
        }

        Tigre tigre2 = new Tigre();
        tigre2.setNome("Tiger");
        tigre2.setIdade(-8);
        tigre2.correr();

        try{
            tigre2.ehMaiorQue10();
        }catch(Exception e){
            logger.error("A idade do tigre "+tigre2.getNome()+" está incorreta", e);
        }
    }
}
