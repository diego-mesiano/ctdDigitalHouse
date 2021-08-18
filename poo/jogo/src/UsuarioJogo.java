public class UsuarioJogo {
    private String nome;
    private String nickname;
    private int pontuacao = 0;
    private int nivel;


    public UsuarioJogo(String nome, String nickname){
        this.nome = nome;
        this.nickname = nickname;
    }

    //gets e sets

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public int getNivel() {
        return nivel;
    }

    public void setAumentarPontuacao(){
        this.pontuacao++;
    }

    public void setSubirNivel(){
        this.nivel++;
    }

    public void setBonus(int valor){
        this.pontuacao += valor;
    }

}
