package Flyweight;

import DTO.ArvoreDTO;

import java.util.HashMap;
import java.util.Map;

public class ArvoreFactory {
    private static Map<String, ArvoreDTO> arvore = new HashMap<>();
    public static ArvoreDTO getArvore(int altura, int largura, String cor, String tipo){

        String id = "id " + altura + ": " + largura + ": " + cor;
        System.out.println(id);
        if(!arvore.containsKey(id)){
            arvore.put(id, new ArvoreDTO(altura, largura, cor));
            System.out.println("Arvore criada");
            return arvore.get(id);
        }
        System.out.println("Arvore obtida");
        return arvore.get(id);
    }

}
