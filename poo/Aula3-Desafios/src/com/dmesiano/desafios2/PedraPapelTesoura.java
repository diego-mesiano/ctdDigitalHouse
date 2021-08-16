package com.dmesiano.desafios2;

import java.util.Scanner;



/*Faça um programa que permita jogar o jogo "Pedra-Papel-Tesoura" . Primeiro, o aplicativo solicita o nome de cada
jogador e, em seguida, qual a opção esse jogador escolhe para jogar: pedra, papel ou tesoura. O jogo consiste em
perguntar qual opção cada um escolhe e somar pontos ao vencedor —se houver—. Defina e use uma função chamada whichWin
com dois parâmetros com as jogadas de cada um dos jogadores, que retorna 0 em caso de empate, 1 se o primeiro vencer, 2
se o segundo vencer. O jogo termina quando o primeiro escolhe "*" como indicador de fim.
 */

public class PedraPapelTesoura {
    private static String player1;
    private static String player2;
    private static String maoPlayer1;
    private static String maoPlayer2;
    private static int pontosPlayer1 = 0;
    private static int pontosPlayer2 = 0;
    private static int rodada = 1;
    private static Scanner scanner = new Scanner(System.in);
    private static int nJogador = 1;
    private static int vencedorRodada = 0;

    public static void main(String[] args){
        player1 = cadastraJogador();
        nJogador++;
        player2 = cadastraJogador();
        nJogador++;
        do{
        escolherJogada();
        wichWin(maoPlayer1,maoPlayer2);
        adicionarPontos();
        } while (!maoPlayer1.equals("*") && !maoPlayer2.equals("*"));
        verificaVencedor();
    }

    public static String cadastraJogador(){
        System.out.print("Olá Jogador " + nJogador +", digite seu nome: ");
        Scanner scanner = new Scanner(System.in);
        String player = ("Jogador-"+nJogador);
        player = scanner.nextLine();
        if(player == null || player.trim().isEmpty())
            return ("Jogador-"+nJogador);
        else
            return player;
    }

    public static void escolherJogada(){
        System.out.println("\nRodada:"+rodada+"\n(1)Pedra - (2)Papel - (3)Tesoura");
        System.out.print(player1+", escolha sua mão: ");
        maoPlayer1 = scanner.nextLine();
        System.out.print(player2+", escolha sua mão: ");
        maoPlayer2 = scanner.nextLine();
        rodada++;
    }

    public static void wichWin(String mao1, String mao2) {
        if (!mao1.equals("*") && !mao2.equals("*")) {
            if (mao1.equals("1")) { //pedra
                if (mao2.equals("1")) vencedorRodada = 0; //pedra
                if (mao2.equals("2")) vencedorRodada = 2; //papel
                if (mao2.equals("3")) vencedorRodada = 1; //tesoura
            }
            if (mao1.equals("2")) { //papel
                if (mao2.equals("1")) vencedorRodada = 1; //pedra
                if (mao2.equals("2")) vencedorRodada = 0; // papel
                if (mao2.equals("3")) vencedorRodada = 2; //tesoura
            }
            if (mao1.equals("3")) { //tesoura
                if (mao2.equals("1")) vencedorRodada = 2; //pedra
                if (mao2.equals("2")) vencedorRodada = 1; // papel
                if (mao2.equals("3")) vencedorRodada = 0; //tesoura
            }


            if (vencedorRodada == 0) System.out.println("\nEmpatou, ninguem marcou ponto!");
            if (vencedorRodada == 1) System.out.println("\n" + player1 + " ganhou e marcou 1 ponto");
            if (vencedorRodada == 2) System.out.println("\n" + player2 + " ganhou e marcou 1 ponto");
        }
    }

    public static void adicionarPontos(){
        if (!maoPlayer1.equals("*") & !maoPlayer2.equals("*")) {
            if (vencedorRodada == 1) pontosPlayer1++;
            if (vencedorRodada == 2) pontosPlayer2++;
            System.out.println("\nPlacar => (" + player1 + ")" + pontosPlayer1 + " X " + pontosPlayer2 + "(" + player2 + ")");
        }
    }
    public static void verificaVencedor(){
        System.out.println("\nJogo encerrado!");
        if(pontosPlayer1>pontosPlayer2) System.out.println(player1 +" Ganhou!");
        if(pontosPlayer1<pontosPlayer2) System.out.println(player2 +" Ganhou!");
        if(pontosPlayer1==pontosPlayer2) System.out.println("\nEmpatou!");
    }

}


