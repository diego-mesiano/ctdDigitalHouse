import com.sun.javafx.geom.Edge;

import java.util.ArrayList;

public class Sistema {
    public static void main(String[] args) {
        Cadastro gleyson = new Cadastro();
        gleyson.setNome("GLEYSON SAMPAIO");
        gleyson.setCpf("123123");
        gleyson.setDataNascimento("30/06/1984");

        Endereco endereco = new Endereco();
        endereco.setNumero("12312");
        endereco.setLogradouro("RUA DA SILVA CASTRO");
        endereco.setCidade("SAO PAULO");

        gleyson.setEndereco(endereco);

        ArrayList<Telefone> telefones = new ArrayList<Telefone>();
        Telefone fixo = new Telefone();
        fixo.setDdd(11);
        fixo.setNumero(986786);
        fixo.setTipo("F");

        Telefone whats = new Telefone();
        whats.setDdd(11);
        whats.setNumero(656558);
        whats.setTipo("W");

        telefones.add(fixo);
        telefones.add(whats);

        gleyson.setTelefones(telefones);

        System.out.println("FIM");

    }
}
