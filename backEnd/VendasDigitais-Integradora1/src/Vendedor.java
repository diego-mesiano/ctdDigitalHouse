public abstract class Vendedor {
    protected String nome;
    protected int vendas = 0;
    protected int PONTOS_POR_VENDA;

    public void vender(int qtdVendas) {
        this.vendas += qtdVendas;
    }

    public abstract int calcularPontos();

    public String mostrarCategoria() {
        int pontosDoVendedor = calcularPontos();
        return this.nome + " tem um total de " + pontosDoVendedor + " pontos e categoriza como " + getNomeCategoria(pontosDoVendedor);
    }

    public String mostrarCategoriaEstagiario() {
        int pontosDoVendedor = calcularPontos();
        return this.nome + " tem um total de " + pontosDoVendedor + " pontos e categoriza como " + getNomeEstagiario(pontosDoVendedor);
    }

    private String getNomeCategoria(int pontosVendedor) {
        if (pontosVendedor < 20) {
            return "vendedor novato";
        } else if (pontosVendedor < 31) {
            return "vendedor aprendiz";
        } else if (pontosVendedor < 41) {
            return "vendedor bom";
        } else {
            return "vendedor mestre";
        }
    }

    private String getNomeEstagiario(int pontosVendedor) {
        if (pontosVendedor < 51) {
            return "estagiário novato";
        } else {
            return "estagiário experiente";
        }
    }
}


