package implement;

public interface IDao <T>{

    public T salvar (T t);

    public T buscarPorId (Integer id);



}
