import DTO.ComputadorDTO;
import Flyweight.ComputadorFactory;

public class Aplication {
    public static void main(String[] args) {
        ComputadorFactory computador = new ComputadorFactory();
        ComputadorDTO mac1 = computador.getComputador(16,500);
        ComputadorDTO windows = computador.getComputador(2,256);
        ComputadorDTO mac2 = computador.getComputador(16,500);

        System.out.println(mac1.toString());
        System.out.println(mac2.toString());
        System.out.println(windows.toString());



    }

}
