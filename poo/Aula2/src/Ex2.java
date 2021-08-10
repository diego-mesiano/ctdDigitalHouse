/*Defina duas sequências de texto. Verifique se são iguais ou diferentes e indique por meio de mensagem.*/
public class Ex2 {
    public static void main(String[] args) {
        String texto1 = "A";
        String texto2 = "A";

        //solução 1

        if (texto1 == texto2) System.out.print("Iguais\n");
        else System.out.print("Diferentes\n");



        //solução 2

        texto2 = "B";

        if (texto1.equals(texto2)) System.out.print("Iguais\n");
        else System.out.print("Diferentes\n");
    }
}
