public class DepartamentoGerencial extends Handler{

    @Override
    public void verificar(Mail mail){
        if(mail.getDestino().equalsIgnoreCase("gerencia@colmeia.com") || (mail.getAssunto().equalsIgnoreCase("gerencial"))){
            System.out.println("E-mail enviado ao setor Gerencial");
        }else{
            if (this.getSeguinte() != null){
                this.getSeguinte().verificar(mail);
            }
        }
    }
}
