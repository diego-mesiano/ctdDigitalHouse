package factory;

import model.Triangulo;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    public static Map<String, Triangulo> trianguloMap = new HashMap<>();

    public static  Triangulo obterTriangulo (String cor){
        Triangulo triangulo = trianguloMap.get(cor);
        if(triangulo == null){
            triangulo = new Triangulo(cor);
            trianguloMap.put(cor, triangulo);
        }
        return triangulo;
    }
}
