package br.edu.ifsp.waleska;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura das dimensões da caixa
        System.out.println("Informe a altura da caixa (A):");
        int A = scanner.nextInt();
        System.out.println("Informe a largura da caixa (B):");
        int B = scanner.nextInt();
        System.out.println("Informe a profundidade da caixa (C):");
        int C = scanner.nextInt();

        // Leitura das dimensões da janela
        System.out.println("Informe a altura da janela (H):");
        int H = scanner.nextInt();
        System.out.println("Informe a largura da janela (L):");
        int L = scanner.nextInt();

        // Criação da caixa e da janela
        Caixa caixa = new Caixa(A, B, C);
        Janela janela = new Janela(L, H);

        // Verificação se a caixa passa pela janela
        Entrega entrega = new Entrega(caixa, janela);
        char resultado = entrega.realizarEntrega();

        // Saída do resultado
        System.out.println(resultado);
    }
}