public class Aplicativo {
    public static void main(String[] args) {
        //cadastrando cliente novo
        Cliente cliente1 = new Cliente(1,"Diego");
        //setando a divida
        cliente1.setDivida(1000);
        //obtendo saldo da divida
        cliente1.getDivida();
        //aumentando a divida
        cliente1.aumentarDivida(500);
        //obtendo saldo da divida
        cliente1.getDivida();
        //quitando a divida
        cliente1.pagarDivida();
        //obtendo saldo da divida
        cliente1.getDivida();

    }
}
