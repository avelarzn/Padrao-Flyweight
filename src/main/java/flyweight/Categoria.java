package flyweight;

public class Categoria {
    private String nome;
    private int tipo;

    public Categoria(String nome, int tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public int getTipo() {
        return tipo;
    }
}
