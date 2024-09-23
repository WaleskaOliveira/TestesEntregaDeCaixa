package br.edu.ifsp.waleska;

public class Janela {
    private int larguraJanela;
    private int alturaJanela;

    // Construtor que inicializa os valores da janela
    public Janela(int larguraJanela, int alturaJanela) {
        if (larguraJanela <= 0 || alturaJanela <= 0) {
            throw new IllegalArgumentException("A largura e a altura da janela devem ser valores positivos.");
        }
        this.larguraJanela = larguraJanela;
        this.alturaJanela = alturaJanela;
    }

    // Construtor padrão
    public Janela() {
    }

    // Getters e setters com validação
    public int getLarguraJanela() {
        return larguraJanela;
    }

    public void setLarguraJanela(int larguraJanela) {
        if (larguraJanela <= 0) {
            throw new IllegalArgumentException("A largura da janela deve ser um valor positivo.");
        }
        this.larguraJanela = larguraJanela;
    }

    public int getAlturaJanela() {
        return alturaJanela;
    }

    public void setAlturaJanela(int alturaJanela) {
        if (alturaJanela <= 0) {
            throw new IllegalArgumentException("A altura da janela deve ser um valor positivo.");
        }
        this.alturaJanela = alturaJanela;
    }
}

