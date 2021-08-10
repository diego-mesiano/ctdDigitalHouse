/*Defina dois números inteiros. Atribua um valor a cada um. Verifique se um número é divisível pelo segundo e indique o
resultado obtido por meio de uma mensagem.NOTA: O fato de ser divisível significa que ao dividir precisa dar um valor
exato, ou seja, sem decimais.*/

public class Ex1 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 3;
        if (n1%n2 == 0) System.out.print("Números divisíveis");
        else System.out.print("Números NÃO divisíveis");
    }
}
