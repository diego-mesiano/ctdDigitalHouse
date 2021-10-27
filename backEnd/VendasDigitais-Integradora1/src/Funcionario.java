import java.util.ArrayList;

public class Funcionario extends Vendedor {
    private int anosAntiguidade;

    private ArrayList<Vendedor> afiliados = new ArrayList<>();

    public Funcionario(String nome, int anosAntiguidade){
        super.nome = nome;
        super.PONTOS_POR_VENDA = 5;
        this.anosAntiguidade = anosAntiguidade;
    }

    //Adicionar um afiliado ao funcionario, e por sua vez soma os pontos
    public void addAfiliado(Vendedor afiliado){

        this.afiliados.add(afiliado);
    }

    @Override
    public int calcularPontos(){
        return (this.afiliados.size()*10) + (this.anosAntiguidade)*5 + (this.vendas * 5);
    }

    public void vender(int qtdVendas) {
    }
}
