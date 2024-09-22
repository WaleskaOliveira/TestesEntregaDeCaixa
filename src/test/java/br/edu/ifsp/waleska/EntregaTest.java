package br.edu.ifsp.waleska;

import br.edu.ifsp.waleska.Caixa;
import br.edu.ifsp.waleska.Entrega;
import br.edu.ifsp.waleska.Janela;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class EntregaTest {
    @Test
    @DisplayName("Retorno quando caixa ou janela são vazias")
    void retornoQuandoCaixaOuJanelaSãoVazias() {
        Caixa caixa = new Caixa(30, 50, 80);
        Janela janela = new Janela(80, 60);
        Entrega entrega = new Entrega(caixa, janela);

        char resultado = entrega.realizarEntrega();

        // Verifica se o resultado não é nulo e não é uma string vazia
        assertNotNull(resultado);
        assertNotEquals("", String.valueOf(resultado));
    }
}