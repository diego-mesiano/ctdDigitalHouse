package service;

import dao.IDao;
import model.Dentista;
import model.Paciente;

import java.util.List;
import java.util.Optional;

public class DentistaService {

    private IDao<Dentista> dentistaIdao;

    public DentistaService(IDao<Dentista> dentistaIdao){
        this.dentistaIdao = dentistaIdao;
    }

    public Dentista salvar(Dentista dentista) {
        dentistaIdao.salvar(dentista);
        return dentista;
    }

    public Optional<Dentista> buscar (Integer numeroMatricula) {
        return dentistaIdao.buscar(numeroMatricula);
    }

    public List<Dentista> buscarTodos(){
        return dentistaIdao.buscarTodos();
    }

    public void excluir (Integer numeroMatricula) {
        dentistaIdao.excluir(numeroMatricula);
    }

}
