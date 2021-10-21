public abstract class Handler {
    protected Handler seguinteManipulador;

    public Handler getSeguinte(){
        return this.seguinteManipulador;
    }

    public void setSeguinte(Handler m){
        this.seguinteManipulador = m;
    }

    public abstract void verificar(Mail mail);
}
