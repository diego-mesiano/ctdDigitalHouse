package Flyweight;

import DTO.ComputadorDTO;

import java.util.HashMap;
import java.util.Map;

public class ComputadorFactory {
    private static Map<String, ComputadorDTO> macFlyweight = new HashMap<>();
        public ComputadorDTO getComputador(int ram, int hd){
            String id = "id " + ram + ": " + hd;
            System.out.println(id);

            if(!macFlyweight.containsKey(id)){
                macFlyweight.put(id, new ComputadorDTO(ram, hd));
                System.out.println("Computador criado");
                return macFlyweight.get(id);
            }
            System.out.println("Computador obtido");
            return macFlyweight.get(id);

        }
}
