package model;

public class Dentista {

    private int numeroMatricula;
    private String nome;
    private String sobrenome;

    public Dentista(int numeroMatricula, String nome, String sobrenome) {
        this.numeroMatricula = numeroMatricula;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
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
        sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        return "Dentista{" +
                "numeroMatricula=" + numeroMatricula +
                ", nome='" + nome + '\'' +
                ", Sobrenome='" + sobrenome + '\'' +
                '}';
    }
}
