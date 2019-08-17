package Grafo;

import java.util.ArrayList;
import java.util.List;

public class No {
    public List<Incidencia> incidencias;
    public Color estado;

    public No() {
        incidencias = new ArrayList<>();
    }

    public void novaIncidencia(No index, int peso) {
        incidencias.add(new Incidencia(index, peso));
    }
}
