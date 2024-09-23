package br.edu.ifsp.waleska;

public class Entrega {
    private Caixa caixa;
    private Janela janela;
    private boolean sucesso;

    public Entrega(Caixa caixa, Janela janela) {
        this.caixa = caixa;
        this.janela = janela;
    }

    public Entrega() { }

    public Caixa getCaixa() {
        return caixa;
    }

    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }

    public Janela getJanela() {
        return janela;
    }

    public void setJanela(Janela janela) {
        this.janela = janela;
    }

    public boolean isSucesso() {
        return sucesso;
    }

    public void setSucesso(boolean sucesso) {
        this.sucesso = sucesso;
    }

    public char realizarEntrega() {
        // Verifica se a caixa cabe na janela
        boolean cabeNaJanela = verificaSeCaixaPassa(caixa.getLarguraCaixa(), caixa.getAlturaCaixa(), caixa.getProfundidadeCaixa(), janela.getLarguraJanela(), janela.getAlturaJanela());

        // Retorna 'S' para sucesso e 'N' para falha
        return cabeNaJanela ? 'S' : 'N';
    }

    // Método para verificar se a caixa passa pela janela
    private boolean verificaSeCaixaPassa(int A, int B, int C, int larguraJanela, int alturaJanela) {
        // Ordena as dimensões da janela para garantir que altura <= largura
        int altura = Math.min(larguraJanela, alturaJanela);
        int largura = Math.max(larguraJanela, alturaJanela);

        // Verifica todas as rotações possíveis da caixa
        return (Math.min(A, B) <= altura && Math.max(A, B) <= largura) ||
                (Math.min(A, C) <= altura && Math.max(A, C) <= largura) ||
                (Math.min(B, C) <= altura && Math.max(B, C) <= largura);
    }
}