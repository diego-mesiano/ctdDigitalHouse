package com.dmesiano.desafios1;

/*Faça uma função que, dado um número, indique se é um número primo ou não. Um número primo é aquele que só pode ser
dividido por 1 e ele mesmo. Por exemplo: 25 não é primo, pois 25 é divisível por 1, 5 e 25. 17 é primo porque só pode
ser dividido por 1 e por 17.
Para usar esta função que iremos criar  em um programa, podemos  permitir a entrada de apenas um número para verificar
 se o número é primo ou não. Para resolvê-lo, use a função obtida no exercício desenvolvido na aula assíncrona,
 Boolean e Divisível (int n, int divisor).
 */

import java.util.Scanner;

public class ChecaNprimo {

    public static void main(String[] args){
        int valor;
        System.out.println("***VERIFICADOR DE NÚMEROS PRIMOS***");
        do{
            System.out.print("Digite um número (0 para sair): ");
            Scanner scanner = new Scanner(System.in);
            valor = scanner.nextInt();
            if (prime(valor))
                System.out.print("É um numero primo!\n\n");
            else
                System.out.print("Não é um numero primo!\n\n");
        }while (valor != 0);
        System.out.print("Obrigado por utilizar!\n");
    }

    public static boolean prime(int number){ //função verifica se numero é primo
        if(number==2)  //se for 2 retorna true, 2 é o unico numero par e primo
            return true;
        else{ //se não for 2
            if (!oddOrEven(number)){ //verifica se é impar
                int placar = 0; //variavel responsavel por armazenar se econtrar uma divisão sem resto
                for (int i = 3;i<=number-2;i=i+2){ //for para testar se numero é divisivel por outro numero, além de 1 e ele mesmo
                    if(number%i == 0){ //se encontrar resto 0
                        placar++; //atribui 1 a varivel de controle
                        i=number+1; // sai do loop for
                    }
                }
                if (placar==0 && number!=1 && number>0) return true; //se nao encontrou nenhum resto zero e se numero for diferente de 1, retorna que o numero é primo
                else return false; // se econtrar pelo menos 1 divisão com resto retorna que o numero não é primo
            }
            else return false; //se não for impar retona false

        }
    }

    public static boolean oddOrEven(int number){ //retorna true para par(odd) e false para ìmpar(even)
        if (number%2==0)
            return true;
        else
            return false;
    }

}
