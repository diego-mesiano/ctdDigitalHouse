public class Main {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("Patricia", 3);
        func1.vender(2);

        Vendedor afi1 = new Afiliado("Arthur");
        afi1.vender(4);

        func1.addAfiliado(afi1);

        Estagiario est1 = new Estagiario("Diego");
        est1.vender(12);

        Estagiario est2 = new Estagiario("Pedro");
        est2.vender(5);


        System.out.println(func1.mostrarCategoria());
        System.out.println(afi1.mostrarCategoria());
        System.out.println(est1.mostrarCategoriaEstagiario());
        System.out.println(est2.mostrarCategoriaEstagiario());
    }
}
