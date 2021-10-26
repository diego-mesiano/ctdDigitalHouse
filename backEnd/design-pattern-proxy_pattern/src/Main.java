import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        int year = 2021;
        int month = 10;
        int day = 23;

        Calendar calendar = Calendar.getInstance();
        calendar.set(year,month-1, day);
        Date date = calendar.getTime();

        Pessoa pessoa = new Pessoa("Diego","Mesiano", "40122333","Pfizer", date);
        IRegistro registro = new RegistroVacinaProxy();
        registro.registrar(pessoa.dados());

    }
}
