package estudos;

public class EstudandoMetodos {
//método main
    public static void main(String[] args) {
        imprimir("Olá!");
        int resultado2 = somar(3,7);

    }
//métodos
    static int somar(int n1, int n2){
        int resultado = n1+n2;
        return resultado;
    }

    static void imprimir(String mensagem){
        System.out.println(mensagem);
    }
}
