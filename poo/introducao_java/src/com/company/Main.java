package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String nome = "Diego";
        System.out.print("Hello World!!\nBem vindo ao Java: " + nome);

        int valor=15;
        float valor2;
        valor2 = valor/2; // aqui ira imprimir sem as casas decimais
        System.out.print("\nValor errado: " + valor2);

        valor2 = valor/2.0f; // aqui ira imprimir com as casas decimais, com esse comando o java faz o calculo e armazena com tipo de variavel mais abrangente, nesse caso o float
        System.out.print("\nValor correto: " + valor2);

        valor2 = 2;
        float divisao;
        //divisao = valor/valor2; dessa forma retornaria 7 (sem as casas decimais)
        divisao = (float)valor/valor2; // dessa forma especifico que desejo uma saída float
        System.out.print("\nAgora saiu certo:" + divisao);
    }
}
