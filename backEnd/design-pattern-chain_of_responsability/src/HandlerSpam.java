public class HandlerSpam extends Handler{

    @Override
    public void verificar(Mail mail){
        System.out.println("Email marcado como Spam");
    }
}
