package Grafo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Grafo {
    public List<No> nos;

    public Grafo() {
        nos = new ArrayList<>();
    }

    public void construirGrafo(int n_vert, int n_ares)
    {
        Scanner sc = new Scanner(System.in);
        while (n_vert > 0)
        {
            nos.add(new No());
            n_vert--;
        }
        int index1, index2, peso;
        while (n_ares > 0)
        {
            index1 = sc.nextInt();
            index2 = sc.nextInt();
            peso = sc.nextInt();
            nos.get(index1).novaIncidencia(nos.get(index2),peso);
            n_ares--;
        }
    }
}
