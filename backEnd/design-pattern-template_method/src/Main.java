import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //instancia o funcionario
        Funcionario funcionario = new Efetivo("Aloisio", "Carvalho","1234",13500.0,4200,6000);

        //Pagamento do funcionario
        funcionario.pagamentoSalario();

        funcionario = new Contratado("Sara","Leite", "1234",150.00,220);
        funcionario.pagamentoSalario();
        
    }

}
