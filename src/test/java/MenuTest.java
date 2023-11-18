import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MenuTest {
    @Test
    void deveContarProdutosRestaurante() {
        Restaurante restaurante = new Restaurante(
                new MenuItem("salada", '5',true),
                new MenuItem("lasanha", '7',true),
                new MenuItem("feijoada", '9',false),
                new MenuItem("peixe", '',true)
        );
        assertEquals(3, Restaurante.contarItensDisponiveis(restaurante));
    }

    @Test
    void deveContarTotalItens() {
        Restaurante restaurante = new Restaurante(
                new MenuItem("feijao", '7',true),
                new MenuItem("arroz",'9' ,true),
                new MenuItem("macarrao", '6',false),
                new MenuItem("carne",'' ,true)
        );
        assertEquals(4, Restaurante.contarTotalItens(restaurante));
    }
}
