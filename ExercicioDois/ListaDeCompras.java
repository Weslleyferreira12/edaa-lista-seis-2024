public interface ListaDeCompras {

    public void adicionarItens(String nome, double valor);
    public void removerItens(String nome);
    public void listarCompras();
    int tamanho();

}