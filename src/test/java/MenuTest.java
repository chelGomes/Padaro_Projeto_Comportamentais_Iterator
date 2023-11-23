import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MenuTest {
    @Test
    void deveContarProdutosRestaurante() {
        Menu menu = new Menu(
                new MenuItem("salada", true),
                new MenuItem("lasanha",true),
                new MenuItem("feijoada", false)

        );
        assertEquals(3, Restaurante.contarItensDisponiveis(menu));
    }

    @Test
    void deveContarTotalItens() {
       Menu menu = new Menu(
                new MenuItem("feijao", true),
                new MenuItem("arroz",true),
                new MenuItem("macarrao", false)
        );
        assertEquals(4, Restaurante.contarTotalItens(menu));
    }
}
