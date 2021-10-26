import java.util.Date;

public class RegistroVacinaProxy implements IRegistro{

    @Override
    public void registrar(Object[] dados){
        if(verificarData((Date)(dados[1]))){
            RegistroVacina registro = new RegistroVacina();
            registro.registrar(dados);
        }
    }

    public boolean verificarData(Date data){
        return data.before(new Date());
    }
}
