package br.edu.ifsp.waleska;



public class Main {
    public static void main(String[] args) {
        // Verifica se a quantidade correta de argumentos foi passada
        if (args.length != 5) {
            System.out.println("Erro: Forneça exatamente 5 números inteiros representando as dimensões da caixa e da janela.");
            return;
        }
    }
}