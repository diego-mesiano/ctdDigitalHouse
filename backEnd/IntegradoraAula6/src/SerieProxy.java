public class SerieProxy implements ISerie {
    int ativos;
    Serie serie;

    public SerieProxy(Serie serie) {
        this.ativos = 0;
        this.serie = serie;
    }

    @Override
    public String getSerie(String nomeSerie){
        if (this.ativos < 5) {
            this.ativos++;
            return serie.getSerie(nomeSerie);
        } else {
            throw new SerieException("Excede o número de reproduções permitidas");
        }
    }
}
