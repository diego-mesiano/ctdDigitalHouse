public class FacadeDesconto implements IFacadeDesconto{
    //armazenar na memoria (em variaveis) uma instancia de cada API
    private ApiCartao apiCartao;
    private ApiProduto apiProduto;
    private ApiQuantidade apiQuantidade;

    //construtor que cria as instancias
    public FacadeDesconto(){
        apiCartao = new ApiCartao();
        apiProduto = new ApiProduto();
        apiQuantidade = new ApiQuantidade();
    }

    //Metodo que vai calcular todos os descontos
    public int desconto(Cartao cartao, Produto prod, int quantidade){
        int desconto = 0;
        desconto = desconto + apiQuantidade.desconto(quantidade);
        desconto = desconto + apiProduto.desconto(prod);
        desconto = desconto + apiCartao.desconto(cartao);
        return desconto;
    }
}
