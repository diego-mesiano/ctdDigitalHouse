package test;

import configuracao.ConfigurationJDBC;
import implement.MedicamentoDaoH2;

import model.Medicamento;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import service.MedicamentoService;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MedicamentoServiceTest {

    private MedicamentoService service =
            new MedicamentoService(new MedicamentoDaoH2(new ConfigurationJDBC()));

    @Test
    public void salvarMedicamentoTest(){
        Medicamento medicamento = new Medicamento("Ibuprofeno","Laboratorio1",500,200.0);
        service.salvar(medicamento);
        Assert.assertTrue(medicamento != null);
    }

    @Test
    public void buscarPorIdTest(){
        Medicamento medicamento = service.buscarPorId(1);
        Assert.assertTrue(medicamento != null);
    }
}
