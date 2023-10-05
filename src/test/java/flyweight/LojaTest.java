package flyweight;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LojaTest {

    @Test
    void deveRetornarProdutos() {
        Loja loja = new Loja();
        loja.cadastrar("Celular", "Eletronico", 1);
        loja.cadastrar("Aspirador", "Eletrodomestico", 2);
        loja.cadastrar("Notebook", "Eletronico", 1);
        loja.cadastrar("Vassoura", "Eletrodomestico", 2);

        List<String> saida = Arrays.asList(
                "Produto{nome='Celular', categoria='Eletronico', tipo=1}",
                "Produto{nome='Aspirador', categoria='Eletrodomestico', tipo=2}",
                "Produto{nome='Notebook', categoria='Eletronico', tipo=1}",
                "Produto{nome='Vassoura', categoria='Eletrodomestico', tipo=2}");

        assertEquals(saida, loja.obterProdutos());
    }

    @Test
    void deveRetornarTotalCategorias() {
        Loja loja = new Loja();
        loja.cadastrar("Celular", "Eletronico", 1);
        loja.cadastrar("Aspirador", "Eletrodomestico", 2);
        loja.cadastrar("Notebook", "Eletronico", 1);
        loja.cadastrar("Vassoura", "Eletrodomestico", 2);

        assertEquals(2, CategoriaFactory.getTotalCategorias());
    }
}