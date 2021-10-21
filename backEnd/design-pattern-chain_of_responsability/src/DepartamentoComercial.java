public class DepartamentoComercial extends Handler{

    @Override
    public void verificar(Mail mail){
        if(mail.getDestino().equalsIgnoreCase("comercial@colmeia.com") || (mail.getAssunto().equalsIgnoreCase("comercial"))){
            System.out.println("E-mail enviado ao setor Comercial");
        }else{
            if (this.getSeguinte() != null){
                this.getSeguinte().verificar(mail);
            }
        }
    }
}
