package br.edu.ifsp.waleska;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaixaTest {
    private Caixa caixa;

    @BeforeEach
    void setUp() {
        caixa = new Caixa(10, 20, 30);
    }

    @Test
    @DisplayName("Testa se as dimensões da caixa estão corretas")
    void testDimensoesCaixa() {
        assertEquals(10, caixa.getLarguraCaixa(), "A largura da caixa deve ser 10 cm");
        assertEquals(20, caixa.getAlturaCaixa(), "A altura da caixa deve ser 20 cm");
        assertEquals(30, caixa.getProfundidadeCaixa(), "A profundidade da caixa deve ser 30 cm");
    }

    @Test
    @DisplayName("Testa a alteração das dimensões da caixa")
    void testAlterarDimensoesCaixa() {
        caixa.setLarguraCaixa(15);
        caixa.setAlturaCaixa(25);
        caixa.setProfundidadeCaixa(35);

        assertEquals(15, caixa.getLarguraCaixa(), "A largura da caixa deve ser 15 cm");
        assertEquals(25, caixa.getAlturaCaixa(), "A altura da caixa deve ser 25 cm");
        assertEquals(35, caixa.getProfundidadeCaixa(), "A profundidade da caixa deve ser 35 cm");
    }
}
