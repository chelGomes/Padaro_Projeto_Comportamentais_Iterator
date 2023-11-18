public class MenuItem {
    private String nomeProduto;
    private double preco;
    private boolean disponivel;

    public MenuItem(String nomeProduto, double preco, boolean disponivel) {
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.disponivel = disponivel;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
