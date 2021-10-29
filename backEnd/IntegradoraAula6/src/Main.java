public class Main {
    public static void main(String[] args) throws SerieException {
        SerieProxy proxy = new SerieProxy(new Serie());
        try {
            System.out.println(proxy.getSerie("As Lindas trancas do careca"));
            System.out.println(proxy.getSerie("Poeira em alto mar"));
            System.out.println(proxy.getSerie("Criatividade baixa"));
            System.out.println(proxy.getSerie("Breaking bad"));
            System.out.println(proxy.getSerie("Aleatoriedade Excessiva"));
            System.out.println(proxy.getSerie("Chamas da vingança"));
            System.out.println(proxy.getSerie("Velozes e Furiosos 25"));

        } catch(SerieException e){
            System.out.println(e.getMessage());
        }
    }
}
