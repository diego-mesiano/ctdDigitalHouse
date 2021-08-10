//Digite seu nome e sobrenome separadamente, a partir dessas variáveis, você deve obter uma terceira com as suas iniciais

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        String nome;
        String sobrenome;
        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();
        System.out.print("Digite seu Sobrenome: ");
        sobrenome = scanner.nextLine();
        System.out.println("Iniciais: "+ nome.charAt(0) + sobrenome.charAt(0));
    }
}
