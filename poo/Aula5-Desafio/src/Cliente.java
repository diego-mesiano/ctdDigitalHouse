public class Cliente {
    private int numero;
    private String nome;
    private double divida;

    //metodo construtor
    public Cliente(int numero, String nome){
        this.numero = numero;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public double getDivida() {
        System.out.println(this.getNome() + " deve " + divida );
        return divida;
    }

    //seta a divida
    public void setDivida(double divida) {
        this.divida = divida;
        System.out.println(this.getNome() + " sua divida foi setada para: " + this.divida);
    }

    //aumenta a divida
    public void aumentarDivida(double valor){
        this.divida += valor;
        System.out.println("Sua divida foi aumentada em: " + valor);
    }

    //quita a divida
    public void pagarDivida(){
        this.divida = 0;
        System.out.println("Divida quitada com sucesso");
    }
}
