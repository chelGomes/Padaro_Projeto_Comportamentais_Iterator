import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MenuTest {
    @Test
    void deveContarProdutosRestaurante() {
        Restaurante restaurante = new Restaurante(
                new MenuItem("salada", true),
                new MenuItem("lasanha",true),
                new MenuItem("feijoada", false),

        );
        assertEquals(3, Restaurante.contarItensDisponiveis(restaurante));
    }

    @Test
    void deveContarTotalItens() {
        Restaurante restaurante = new Restaurante(
                new MenuItem("feijao", true),
                new MenuItem("arroz",true),
                new MenuItem("macarrao", false),
        );
        assertEquals(4, Restaurante.contarTotalItens(restaurante));
    }
}
