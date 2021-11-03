package main.com.dh.academia.model;

public class Aluno {

    private String id;
    private String nome;
    private String sobrenome;

    public Aluno(String id, String nombre, String sobrenome) {
        this.id = id;
        this.nome = nombre;
        this.sobrenome = sobrenome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                '}';
    }
}
