package quiniela;

import java.util.List;

public class VistaListado {
    private String titulo;

    public VistaListado(String titulo) {
        this.titulo = titulo;
    }

    public void mostrar(List<String> listado) {
        System.out.println(titulo);
        if (listado.isEmpty()) {
            System.out.println("No hay resultados disponibles.");
        } else {
            listado.forEach(System.out::println);
        }
    }
}

