import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Cachorro> cachorros = new ArrayList<>();

        Cachorro c1 = new Cachorro();
        c1.setNome("Pitoco");
        c1.setIdade(3);

        Cachorro c2 = new Cachorro();
        c2.setNome("Amora");
        c2.setIdade(3);

        Cachorro c3 = new Cachorro();
        c3.setNome("Alfred");
        c3.setIdade(1);

        cachorros.add(c1);
        cachorros.add(c2);
        cachorros.add(c3);

        //Aqui salvamos em um arquivo
        FileOutputStream saida = null;

        try{
            saida = new FileOutputStream("SaidaArquivo.txt");
            ObjectOutputStream dos = new ObjectOutputStream(saida);
            dos.writeObject(cachorros);
        }catch (FileNotFoundException e){
            System.out.println("Error: "+ e.getMessage());
        }catch(Exception e){
            System.out.println("Error: "+ e.getMessage());
        }

        //recuperação do arquivo serializado
        List<Cachorro> cachorro2 = null;
        FileInputStream entrada = null;

        try{
            entrada = new FileInputStream("SaidaArquivo.txt");
            ObjectInputStream ois = new ObjectInputStream(entrada);
            cachorro2 = (ArrayList) ois.readObject(); // Casting
        }catch (FileNotFoundException e){
            System.out.println("Error: "+ e.getMessage());
        }catch(Exception e){
            System.out.println("Error: "+ e.getMessage());
        }

        //Imprimir
        for (Cachorro cachorro: cachorro2)
            System.out.println(
                    cachorro.getNome() + "-" + cachorro.getIdade()
            );

    }
}
