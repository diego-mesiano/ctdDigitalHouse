public class Cachorros {
    private String nome;
    private String raca;
    private int dataNascimento;
    private float peso;
    private boolean possuiChip;
    private boolean ferido;

    public Cachorros(String nome, String raca, int dataNascimento, float peso, boolean possuiChip, boolean ferido){
        this.nome = nome;
        this.raca = raca;
        this.dataNascimento = dataNascimento;
        this.peso = peso;
        this.possuiChip = possuiChip;
        this.ferido = ferido;
    }
    //metodos
    public boolean podeSerPerdido(){
        if (this.possuiChip) {
            System.out.println(this.nome + ", esta seguro !");
            return true;
        }else {
            System.out.println(this.nome + ", pode ser perdido pois está sem chip!");
            return false;
        }
    }

    public boolean podeSerAdotado(){
        if (this.ferido == false && this.peso>5) {
            System.out.println(this.nome + ", pode ser adotado!");
            return true;
        }else{
            System.out.println(this.nome + ", não pode ser adotado!");
            return false;
        }

    }



    //gets e sets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public boolean isPossuiChip() {
        return possuiChip;
    }

    public void setPossuiChip(boolean possuiChip) {
        this.possuiChip = possuiChip;
    }

    public boolean isFerido() {
        return ferido;
    }

    public void setFerido(boolean ferido) {
        this.ferido = ferido;
    }
}
