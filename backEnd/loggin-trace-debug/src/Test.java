import org.apache.log4j.Logger;

public class Test {

    private static Logger logger = Logger.getLogger(Test.class);

    public static void main(String[] args) {
        logger.info("Iniciamos nosso método Main");

        try{
            int divisao = 1/0;
        }catch(ArithmeticException e){
            logger.error("Numero não pode ser divisivel por 0", e);
        }
        logger.warn("Aviso, o método main esta prestes a terminar");
        logger.info("Aviso, o método main esta prestes a terminar");
        logger.debug("Aviso, o método main esta prestes a terminar");

    }
}
