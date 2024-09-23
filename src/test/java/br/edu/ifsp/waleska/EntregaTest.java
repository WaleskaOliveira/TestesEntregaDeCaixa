package br.edu.ifsp.waleska;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EntregaTest {

    private Entrega entrega;
    private Caixa caixa;
    private Janela janela;

    @BeforeEach
    void setUp() {
        caixa = new Caixa(10, 20, 30); // Caixa com dimensões adequadas
        janela = new Janela(11, 30);   // Janela com dimensões adequadas
        entrega = new Entrega(caixa, janela); // Associando caixa e janela à entrega
    }

    @Test
    @DisplayName("Retorno quando caixa ou janela são vazias")
    void retornoQuandoCaixaOuJanelaSaoVazias() {
        // Testando quando a caixa ou a janela estão nulas
        entrega.setCaixa(null);
        char resultado = entrega.realizarEntrega();
        assertEquals('N', resultado, "Deve retornar 'N' quando a caixa for nula");

        entrega.setJanela(null);
        resultado = entrega.realizarEntrega();
        assertEquals('N', resultado, "Deve retornar 'N' quando a janela for nula");
    }

    @Test
    @DisplayName("Entrega realizada com sucesso")
    void entregaRealizadaComSucesso() {
        // Testando o cenário normal onde a caixa cabe na janela
        char resultado = entrega.realizarEntrega();
        assertEquals('S', resultado, "A entrega deve ser realizada com sucesso (retornar 'S')");
    }

    @Test
    @DisplayName("Falha na entrega quando caixa não cabe na janela")
    void falhaNaEntregaQuandoCaixaNaoCabeNaJanela() {
        // Testando o caso em que a caixa não cabe na janela
        Caixa caixaGrande = new Caixa(50, 60, 70); // Caixa maior que a janela
        entrega.setCaixa(caixaGrande);
        char resultado = entrega.realizarEntrega();
        assertEquals('N', resultado, "A entrega deve falhar (retornar 'N') quando a caixa não cabe na janela");
    }
}
