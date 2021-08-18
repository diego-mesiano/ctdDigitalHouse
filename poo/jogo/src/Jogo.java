public class Jogo {
    public static void main(String[] args) {
        UsuarioJogo jogador1 = new UsuarioJogo("Diego","dmesiano");
        jogador1.setAumentarPontuacao();
        jogador1.setSubirNivel();
        jogador1.setBonus(10);
        System.out.println(jogador1.getPontuacao());
        System.out.println(jogador1.getNome());
        System.out.println(jogador1.getNickname());
        jogador1.setAumentarPontuacao();
        jogador1.setSubirNivel();
        System.out.println(jogador1.getPontuacao());
        System.out.println(jogador1.getNivel());
    }
}
