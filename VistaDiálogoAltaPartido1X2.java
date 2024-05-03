package quiniela;

import java.util.Scanner;

public class VistaDiálogoAltaPartido1X2 {
    private String titulo;
    private Scanner scanner;

    public VistaDiálogoAltaPartido1X2(String titulo) {
        this.titulo = titulo;
        this.scanner = new Scanner(System.in);
    }

    public ElementoPartido1X2 entradaQuiniela1X2() throws DatoPartido1X2Exception, Partido1X2Exception {
        System.out.println(titulo);
        System.out.print("Ingrese los detalles del partido: ");
        String entrada = scanner.nextLine();
        return ElementoPartido1X2.of(entrada);
    }

    public boolean confirmarAlta(String datos) {
        System.out.println("Confirmar alta del siguiente partido: " + datos);
        System.out.print("Confirmar (s/n): ");
        String respuesta = scanner.nextLine();
        return "s".equalsIgnoreCase(respuesta);
    }
}

