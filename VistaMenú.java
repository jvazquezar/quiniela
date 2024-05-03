package quiniela;

import java.util.Scanner;

public class VistaMenú {
    private String titulo;
    private String[] opciones;
    private Scanner scanner;

    public VistaMenú(String titulo, String[] opciones) {
        this.titulo = titulo;
        this.opciones = opciones;
        this.scanner = new Scanner(System.in);
    }

	public void mostrarTítuloPrincipal() {
        System.out.println("\n" + titulo);
        System.out.println("================================");
    }

    public void mostrarMenú() {
        for (int i = 0; i < opciones.length; i++) {
            System.out.printf("%d. %s%n", i + 1, opciones[i]);
        }
        System.out.println("0. Salir");
    }

    public int pedirOpción() {
        System.out.print("Seleccione una opción: ");
        return Integer.parseInt(scanner.nextLine());
    }
}
