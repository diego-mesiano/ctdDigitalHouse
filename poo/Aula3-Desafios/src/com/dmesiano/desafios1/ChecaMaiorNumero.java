package com.dmesiano.desafios1;
/*Escreva uma função que receba três números e retorne o máximo dos três números.
int maximoEntreTresNumeros(int umNumeroA, int umNumeroB, int umNumeroC)
Em seguida, faça um programa que permita a entrada de 3 valores, use a função e exiba o resultado.*/

import java.util.Scanner;

public class ChecaMaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***VERIFICA MAIOR VALOR***");
        System.out.println("Digite Valor 1:");
        int n1 = scanner.nextInt();
        System.out.println("Digite Valor 2:");
        int n2 = scanner.nextInt();
        System.out.println("Digite Valor 3:");
        int n3 = scanner.nextInt();

        System.out.println("O maior valor é: " + maiorNum(n1,n2,n3));
    }

    static int maiorNum(int n1, int n2, int n3){
        int maior = 0;
        if(n1>=n2 && n1>=n3) maior = n1;
        if(n2>=n1 && n2>=n3) maior = n2;
        if(n3>=n1 && n3>=n2) maior = n3;
        return maior;
    }
}
