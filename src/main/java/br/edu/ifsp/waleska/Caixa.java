package br.edu.ifsp.waleska;

public class Caixa {
    private int larguraCaixa;
    private int alturaCaixa;
    private int profundidadeCaixa;

    // Construtor que inicializa a caixa com validações
    public Caixa(int larguraCaixa, int alturaCaixa, int profundidadeCaixa) {
        if (larguraCaixa <= 0 || alturaCaixa <= 0 || profundidadeCaixa <= 0) {
            throw new IllegalArgumentException("As dimensões da caixa devem ser valores positivos.");
        }
        this.larguraCaixa = larguraCaixa;
        this.alturaCaixa = alturaCaixa;
        this.profundidadeCaixa = profundidadeCaixa;
    }

    // Getters e setters com validação
    public int getLarguraCaixa() {
        return larguraCaixa;
    }

    public void setLarguraCaixa(int larguraCaixa) {
        if (larguraCaixa <= 0) {
            throw new IllegalArgumentException("A largura da caixa deve ser um valor positivo.");
        }
        this.larguraCaixa = larguraCaixa;
    }

    public int getAlturaCaixa() {
        return alturaCaixa;
    }

    public void setAlturaCaixa(int alturaCaixa) {
        if (alturaCaixa <= 0) {
            throw new IllegalArgumentException("A altura da caixa deve ser um valor positivo.");
        }
        this.alturaCaixa = alturaCaixa;
    }

    public int getProfundidadeCaixa() {
        return profundidadeCaixa;
    }

    public void setProfundidadeCaixa(int profundidadeCaixa) {
        if (profundidadeCaixa <= 0) {
            throw new IllegalArgumentException("A profundidade da caixa deve ser um valor positivo.");
        }
        this.profundidadeCaixa = profundidadeCaixa;
    }
}

