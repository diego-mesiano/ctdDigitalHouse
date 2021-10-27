import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTesteJUnit {

    @Test
    void testDeveriaSomarNumerosPositivos(){

        //montagem do cenario
        Calculadora calculadora = new Calculadora();
        int soma = calculadora.somar(2,2);
        int subtracao = calculadora.subtrair(5,4);

        //casos de teste negativo
        //Assertions.assertEquals(5, soma);

        //caso de teste positivo
        Assertions.assertEquals(4, soma);
        Assertions.assertEquals(1,subtracao);
    }
}
