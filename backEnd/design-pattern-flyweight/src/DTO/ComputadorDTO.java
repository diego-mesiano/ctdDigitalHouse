package DTO;

public class ComputadorDTO {
    private int ram;
    private int hd;
    private static int contador = 0;

    public ComputadorDTO(int ram, int hd) {
        this.ram = ram;
        this.hd = hd;
        this.contador = contador + 1;
        System.out.println("contador: " + contador);
    }

    public int getRam() {
        return ram;
    }

    public int getHd() {
        return hd;
    }

    public static int getContador() {
        return contador;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setHd(int hd) {
        this.hd = hd;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    @Override
    public String toString() {
        return "ComputadorDTO{" +
                "ram=" + ram +
                ", hd=" + hd + "}";
    }
}
