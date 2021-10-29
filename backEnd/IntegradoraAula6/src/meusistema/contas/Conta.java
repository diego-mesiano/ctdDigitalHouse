package meusistema.contas;

public abstract class Conta {
    private String numero;
    protected Double saldo;
    private ContaTipo tipo;
    protected void gerarComprovante(){

    }
    public abstract void sacar(Double valorSolicitado);

    public void depositar(Double valorSolicitado){
        //depositamos de uma única maneira
        gerarComprovante();
    }
    protected boolean verificarSaldo(){
        return true;
    }
    public boolean verificarCliente(){
        return true;
    }

    public String getNumero() {
        return numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public ContaTipo getTipo() {
        return tipo;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setTipo(ContaTipo tipo) {
        this.tipo = tipo;
    }
}
