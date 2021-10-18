public class Mercado {
    public static void main(String[] args) {
        FacadeDesconto facade = new FacadeDesconto();
        Cartao cartao = new Cartao("548555444547444454555","Star Bank");
        Produto produto = new Produto("Abacaxi em conserva","Lata");
        System.out.println("O desconto total é: " + facade.desconto(cartao,produto,13));
    }
}
