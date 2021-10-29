package meusistema.contas;

public class ContaCorrente extends Conta {
    private Double limiteChequeEspecial;
    @Override
    public void sacar(Double valorSolicitado) {
        if(saldo + limiteChequeEspecial < valorSolicitado ){
            System.out.println("OPS nao pode sacar");
        }else{
            saldo = saldo - valorSolicitado;
        }
        super.gerarComprovante();
    }

    public Double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(Double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
}
