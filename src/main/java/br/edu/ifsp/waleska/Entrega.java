package br.edu.ifsp.waleska;

public class Entrega {
    private Caixa caixa;
    private Janela janela;
    private boolean sucesso;

    public Entrega(Caixa caixa, Janela janela) {
        this.caixa = caixa;
        this.janela = janela;
    }

    public Entrega(Caixa caixa, Janela janela, boolean sucesso) {
        this.caixa = caixa;
        this.janela = janela;
        this.sucesso = sucesso;
    }

    public char realizarEntrega() {
        // Verifica se a caixa cabe na janela
        boolean cabeNaJanela = caixaCabeNaJanela();

        // Retorna 'S' para sucesso e 'N' para falha
        return cabeNaJanela ? 'S' : 'N';
    }

    private boolean caixaCabeNaJanela() {
        // Lógica para verificar se a caixa cabe na janela
        // (já implementada anteriormente)
        int maiorDimensaoCaixa = Math.max(Math.max(caixa.larguraCaixa, caixa.alturaCaixa), caixa.profundidadeCaixa);
        int menorDimensaoJanela = Math.min(janela.larguraJanela, janela.alturaJanela);
        return maiorDimensaoCaixa <= menorDimensaoJanela;
    }
}