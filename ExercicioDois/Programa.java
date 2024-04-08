public class Programa {
    public static void main(String[] args) {

        // Capacidade da lista
        Compras compra = new Compras(6);

        // Adicionando produtos na lista de compra
        compra.adicionarItens("Feijão", 8.99);
        compra.adicionarItens("Açucar", 11.39);
        compra.adicionarItens("Carne", 55.68);
        compra.adicionarItens("Suco", 5.49);
        compra.adicionarItens("Biscoito", 2.99);
        compra.adicionarItens("Leite", 4.99);

        // Remover produto
        compra.removerItens("Iorgute");

        // Listar tudo
        compra.listarCompras();


    }
    
}