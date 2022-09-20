package Exercicios;

import java.util.Scanner;

/*
Escreva um programa em Java que pergunte ao usuário via linha de comando qual seu herói favorito.
Atribua a resposta em uma variável.
Imprima no console a frase: "Seu herói favorito é <nome do herói informado>".
 */
public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual o seu herói favorito? ");
        String resposta = scanner.nextLine();

        System.out.println("Seu herói favorito é " + resposta);
    }
}
