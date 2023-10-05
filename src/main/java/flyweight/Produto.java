package flyweight;

public class Produto {
    private String nome;
    private Categoria categoria;

    public Produto(String nome, Categoria categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }

    public String obterProduto() {
        return "Produto{" +
                "nome='" + this.nome + '\'' +
                ", categoria='" + categoria.getNome() + '\'' +
                ", tipo=" + categoria.getTipo() +
                '}';
    }
}
