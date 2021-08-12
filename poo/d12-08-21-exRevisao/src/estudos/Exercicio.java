/*Implemente um programa que nos permita exibir os primeiros números primos pelo
console, onde é um valor numérico inserido pelo console. Por exemplo: Com n = 7, o
que o programa deve retornar Os primeiros 7 números primos são: 2, 3, 5, 7, 11, 13, 17*/
package estudos;

public class Exercicio {
    public static void main(String[] args) {


    }

    static void numeroPrimos(int limite){
        int n = 1;
    }

}
//logica
public class Exercicio1 {
    static boolean numPrimo(int number) {
        if(number==1) return false;
        boolean resultado = false;
        for (int i = 2; i < number; i++) {
            resultado = divisivel(number, i);
            if(resultado){return false;}
        }
        return true;
    }

    static boolean divisivel(int n, int divisor) {
        if (n % divisor == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(numPrimo(113));
    }
}

