import java.sql.SQLOutput;

public class App {
    public static void main(String[] args) {
        //String nome, String raca, int dataNascimento,
        // float peso, boolean possuiChip, boolean ferido
        Cachorros cachorro1 = new Cachorros("Tor","SRD", 2018,7,true,false);
        cachorro1.podeSerPerdido();
        cachorro1.podeSerAdotado();
        Cachorros cachorro2 = new Cachorros("Thanos","Pit Bull", 2020,20,false,true);
        cachorro2.podeSerPerdido();
        cachorro2.podeSerAdotado();
    }
}
