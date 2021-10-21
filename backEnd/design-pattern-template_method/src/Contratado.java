public class Contratado extends Funcionario{
    private double valorHora;
    private int horas;

    public Contratado(String nome, String sobrenome, String numeroConta, double valorHora, int horas){
        super(nome, sobrenome, numeroConta);
        this.valorHora = valorHora;
        this.horas = horas;
    }

    @Override
    public double calcularSalario(){
        return valorHora * horas;
    }

    @Override
    public double imprimirRecibo(double quantia){
        System.out.println("Foi gerado um recibo impresso");
        return quantia;
    }

    @Override
    public void depositar(double quantia){
        System.out.println("Foi depositada a quantia de: " + quantia);
    }
}
