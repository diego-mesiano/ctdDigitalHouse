public class DepartamentoTecnico extends Handler{

    @Override
    public void verificar(Mail mail){
        if(mail.getDestino().equalsIgnoreCase("tecnico@colmeia.com") || (mail.getAssunto().equalsIgnoreCase("tecnico"))){
            System.out.println("E-mail enviado ao setor Técnico");
        }else{
            if (this.getSeguinte() != null){
                this.getSeguinte().verificar(mail);
            }
        }
    }
}
