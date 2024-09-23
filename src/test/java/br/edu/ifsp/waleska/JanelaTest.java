package br.edu.ifsp.waleska;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JanelaTest {
    private Janela janela;

    @BeforeEach
    void setUp() {
        // Inicializa a janela com dimensões 15 de altura e 25 de largura
        janela = new Janela(25, 15);
    }

    @Test
    @DisplayName("Testa se as dimensões da janela estão corretas")
    void testDimensoesJanela() {
        assertEquals(25, janela.getLarguraJanela(), "A largura da janela deve ser 25 cm");
        assertEquals(15, janela.getAlturaJanela(), "A altura da janela deve ser 15 cm");
    }

    @Test
    @DisplayName("Testa a alteração das dimensões da janela")
    void testAlterarDimensoesJanela() {
        janela.setLarguraJanela(20);
        janela.setAlturaJanela(10);

        assertEquals(20, janela.getLarguraJanela(), "A largura da janela deve ser 20 cm");
        assertEquals(10, janela.getAlturaJanela(), "A altura da janela deve ser 10 cm");
    }
}
