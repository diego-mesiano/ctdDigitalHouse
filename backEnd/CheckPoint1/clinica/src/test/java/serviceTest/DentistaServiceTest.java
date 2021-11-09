package serviceTest;

import dao.impl.DentistaDaoH2;
import model.Dentista;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import service.DentistaService;

import java.util.List;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DentistaServiceTest {
    private static DentistaService dentistaService = new DentistaService(new DentistaDaoH2());

    @BeforeClass
    public static void cadastrarDentistas(){
        Dentista dentista1 = new Dentista(1,"Joarez","Nogueira");
        Dentista dentista2 = new Dentista(2,"Fernando","Silva");
    }

    @Test
    public void salvarEbuscarDentistaTest(){
        Dentista dentista1 = dentistaService.salvar(new Dentista(1,"Andre","Souza"));
        Dentista dentista2 = dentistaService.salvar(new Dentista(2,"Fernanda","Marinho"));
        Dentista dentista3 = dentistaService.salvar(new Dentista(3,"Mauricio","Jorge"));
        Assert.assertNotNull(dentistaService.buscar(dentista1.getNumeroMatricula()));
        Assert.assertNotNull(dentistaService.buscar(dentista2.getNumeroMatricula()));
        Assert.assertNotNull(dentistaService.buscar(dentista3.getNumeroMatricula()));
    }

    @Test
    public void excluirDentistaTest(){
        dentistaService.excluir(3);
        Assert.assertTrue(dentistaService.buscar(3).isEmpty());
    }

    @Test
    public void buscarTodosDentistasTest(){
        List<Dentista> dentistas = dentistaService.buscarTodos();
        Assert.assertTrue(!dentistas.isEmpty());
        Assert.assertTrue(dentistas.size()==2);
        System.out.println(dentistas);
    }
}
