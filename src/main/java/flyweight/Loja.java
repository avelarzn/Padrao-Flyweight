package flyweight;

import java.util.ArrayList;
import java.util.List;

public class Loja {

    private List<Produto> produtos = new ArrayList<>();

    public void cadastrar(String nomeProduto, String nomeCategoria, int tipo) {
        Categoria categoria = CategoriaFactory.getCategoria(nomeCategoria, tipo);
        Produto produto = new Produto(nomeProduto, categoria);
        produtos.add(produto);
    }

    public List<String> obterProdutos() {
        List<String> saida = new ArrayList<String>();
        for (Produto produto : this.produtos) {
            saida.add(produto.obterProduto());
        }
        return saida;
    }
}
