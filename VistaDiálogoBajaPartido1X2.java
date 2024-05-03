package quiniela;

import java.util.List;
import java.util.Scanner;

public class VistaDiálogoBajaPartido1X2 {
    private String titulo;
    private Scanner scanner;

    public VistaDiálogoBajaPartido1X2(String titulo) {
        this.titulo = titulo;
        this.scanner = new Scanner(System.in);
    }

    public int bajaQuiniela1X2(List<String> listado) {
        System.out.println(titulo);
        if (listado.isEmpty()) {
            System.out.println("No hay partidos disponibles para borrar.");
            return -1;
        }
        for (int i = 0; i < listado.size(); i++) {
            System.out.printf("%d. %s%n", i + 1, listado.get(i));
        }
        System.out.print("Seleccione un partido para borrar (Ingrese número): ");
        return Integer.parseInt(scanner.nextLine()) - 1;
    }

    public boolean confirmarBaja(String data) {
        System.out.println("Confirmar baja del siguiente partido: " + data);
        System.out.print("Confirmar (s/n): ");
        String respuesta = scanner.nextLine();
        return "s".equalsIgnoreCase(respuesta);
    }
}
