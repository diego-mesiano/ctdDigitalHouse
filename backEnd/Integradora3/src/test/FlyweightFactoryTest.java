package test;

import factory.FlyweightFactory;
import model.Triangulo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FlyweightFactoryTest {
    @Test
    void testObterTriangulo(){

        Triangulo triangulo = FlyweightFactory.obterTriangulo("vermelho");
        triangulo.setTamanho(2);
        Triangulo triangulo2 = FlyweightFactory.obterTriangulo("vermelho");
        triangulo2.setTamanho(3);
        Triangulo triangulo3 = FlyweightFactory.obterTriangulo("amarelo");
        triangulo2.setTamanho(3);

        Assertions.assertEquals(triangulo.getCor(),"vermelho");
        Assertions.assertEquals(triangulo2.getTamanho(),3);

        //Assertions.assertEquals(FlyweightFactory.trianguloMap.size() == 1, true);
        Assertions.assertTrue(FlyweightFactory.trianguloMap.size() == 2);


    }
}
