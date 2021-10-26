package DTO;

public class ArvoreDTO {
    private int altura;
    private int largura;
    private String cor;
    private String tipo;

    public ArvoreDTO(int altura, int largura, String cor, String tipo) {
        this.altura = altura;
        this.largura = largura;
        this.cor = cor;
        this.tipo = tipo;
    }

    public int getAltura() {
        return altura;
    }

    public int getLargura() {
        return largura;
    }

    public String getCor() {
        return cor;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "ArvoreDTO{" +
                "altura=" + altura +
                ", largura=" + largura +
                ", cor='" + cor + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
