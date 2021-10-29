import org.apache.log4j.Logger;

public class Logs {
    private static Logger logger = Logger.getLogger(Logs.class);

    public static void gerarLogs(){
        if (Numeros.listaInteiros.size() == 6){
            logger.info("Lista com mais de 5 itens!");
        }
        if (Numeros.listaInteiros.size() == 11){
            logger.info("Lista com mais de 10 itens!");
        }

        try{
            logger.info("Media dos itens: "+Numeros.calcularMedia());
        }catch (Exception e){};

        if (Numeros.listaInteiros.size() ==0){
            logger.error("Lista vazia!");
        }
    }
}
