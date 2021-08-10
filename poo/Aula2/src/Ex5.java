/*Faça uma função que receba dois valores como parâmetro e que no retorno sejam do tipo booleano.
A função deve verificar se o primeiro número é divisível pelo segundo. boolean eDivisivel(int num, int divisor)
NOTA: O fato de ser divisível pelo outro significa que ao dividir precisa dar um resultado exato, ou seja, sem decimais.
*/

public class Ex5 {
    static boolean eDivisivel(int num, int divisor){
        if (num%divisor == 0) {return true;}
        else {return false;}
    }
    public static void main(String[] args) {

        System.out.print(eDivisivel(10,3));
    }
}
