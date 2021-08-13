package com.dmesiano.desafios2;

/*Implemente um programa que nos permita exibir os primeiros "n" números primos pelo
console, onde "n" é um valor numérico inserido pelo console. Por exemplo: Com n = 7, o
que o programa deve retornar é "Os primeiros 7 números primos são: 2, 3, 5, 7, 11, 13, 17"*/

import com.dmesiano.desafios1.ChecaNprimo;

import java.util.Scanner;

public class SequenciaDePrimos{
    public static void main(String[] args) {
        System.out.println("***SEQUENCIA DE PRIMOS***");
        System.out.print("Digite a quantidade de numeros primos que deseja vizualizar: ");
        Scanner scanner = new Scanner(System.in);
        int escolhaUsuario = scanner.nextInt();
        System.out.println("\nGerando os primeiros "+ escolhaUsuario +" números primos....");
        int cont = 0;
        int contInterno = 1;
        int quebraLinha = 41;
        while(cont>=0 && cont<escolhaUsuario){
            if (cont==quebraLinha){
                System.out.print("\n");
                quebraLinha = quebraLinha + 34;
            }

            if (ChecaNprimo.prime(contInterno)){
                System.out.print(contInterno + " ");
                cont++;
                contInterno++;
            }
            else{
                contInterno++;
            }

        }

    }
}
