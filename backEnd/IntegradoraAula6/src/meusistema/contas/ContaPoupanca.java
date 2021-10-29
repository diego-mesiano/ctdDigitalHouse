package meusistema.contas;

public class ContaPoupanca extends Conta {
    @Override
    public void sacar(Double valorSolicitado) {
        if(saldo  < valorSolicitado ){
            System.out.println("OPS nao pode sacar");
        }else{
            saldo = saldo - valorSolicitado;
        }
        super.gerarComprovante();
    }
}
