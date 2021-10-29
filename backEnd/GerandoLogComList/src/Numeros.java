import java.util.ArrayList;
import java.util.List;

public class Numeros {
    private int valor;
    static List<Integer> listaInteiros = new ArrayList<>();

    public static void setValor(int valor) {
        listaInteiros.add(valor);
        System.out.println("Foi adicionado a lista o valor: " + valor + " na posição: " + listaInteiros.size());
        Logs.gerarLogs();
    }

    public static int getValor(int posicao) {
        System.out.println("Na posição " + posicao + " da lista, temos o numero: " + listaInteiros.get(posicao-1));
        return listaInteiros.get(posicao-1);
    }

    public static double calcularMedia(){
        int cont = 0;
        int soma = 0;
        for (int valor : listaInteiros) {
            soma += valor;
            cont++;
        }
        double media = soma/cont;
        System.out.println("Média dos numeros contidos na lista: " + media);
        return media;
    }

    public static int maximo(){
        int atual = 0;
        for (int valor : listaInteiros) {
            if (valor>atual){
                atual = valor;
            }
        }
        System.out.println("O maior valor da lista é: " + atual);
        return atual;
    }

    public static int minimo(){
        int atual = listaInteiros.get(0);
        for (int valor : listaInteiros) {
            if (valor<atual){
                atual = valor;
            }
        }
        System.out.println("O menor valor da lista é: " + atual);
        return atual;
    }
}
