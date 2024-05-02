import java.util.Scanner;

public class Menu {

    public void show() {
        System.out.println("Piedra, papel o tijeras");
        System.out.println("-".repeat(55));
        System.out.println("Presiona 1 si quieres simular una partida");
        System.out.println("Presiona 2 si quieres jugar contra la máquina");
        System.out.println("Presiona 3 si quieres salir del juego");
        System.out.println("-".repeat(55));

    }

    public int escoger() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Selecciona una opción: ");
        int opcionSeleccionada = scanner.nextInt();
        return opcionSeleccionada;

    }

    public boolean salirDelJuego(int opcionSeleccionada) {
        return opcionSeleccionada == 3;
    }

}
