public class ProcessaMail {
    public static void main(String[] args) {
        CheckMail check = new CheckMail();
        check.verificar(new Mail("wheslley@dh.com","tecnico@colmeia.com","tecnico"));
        check.verificar(new Mail("wheslley@dh.com","comercial@colmeia.com","comercial"));
        check.verificar(new Mail("wheslley@dh.com","teste@colmeia.com","teste"));

    }
}
