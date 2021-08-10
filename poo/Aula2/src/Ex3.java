/*Defina duas variáveis Integer e determine pelo valor delas qual é maior, qual é menor ou se são iguais.
Mostre o resultado obtido.*/

public class Ex3 {
    public static void main(String[] args) {
        Integer n1 = 499;
        Integer n2 = 500;

        if (n1.equals(n2)) System.out.print("Valores Iguais");
        else {
            if (n1>n2) System.out.print(n1 + " é maior que " + n2);
            else    System.out.print(n2 + " é maior que " + n1);
        }
    }
}
