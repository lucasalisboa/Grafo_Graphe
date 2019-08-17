package Grafo;

public class Incidencia {
    public No proximo_no;
    public int peso;

    public Incidencia(No index, int peso) {
        this.proximo_no = index;
        this.peso = peso;
    }
}