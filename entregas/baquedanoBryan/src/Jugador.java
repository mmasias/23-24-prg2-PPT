import java.util.Random;
import java.util.Scanner;

public class Jugador {

    private String nombre;
    private int opcion;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.opcion = 0;

    }

    public void jugar(int opcionSeleccionada, Jugador[] jugadores) {
        if (opcionSeleccionada == 1) {
            simularPartida(jugadores);
        } else if (opcionSeleccionada == 2) {
            jugarContraMaquina(jugadores);
        }
    }

    public void elegirOpcion() {
        Random rand = new Random();
        int opcionAleatoria = rand.nextInt(3);

        if (opcionAleatoria == 0) {
            opcion = 1;
        } else if (opcionAleatoria == 1) {
            opcion = 2;
        } else if (opcionAleatoria == 2) {
            opcion = 3;
        }
    }

    private int getOpcion() {
        return opcion;
    }

    private String getNombre() {
        return nombre;
    }

    private String opcionTexto(int opcion) {
        if (opcion == 1) {
            return "Piedra";
        } else if (opcion == 2) {
            return "Papel";
        } else if (opcion == 3) {
            return "Tijeras";
        } else {
            return "Desconocido";
        }
    }

    private void simularPartida(Jugador[] jugadores) {
        System.out.println("Simulando una partida...");

        jugadores[1].elegirOpcion();
        jugadores[2].elegirOpcion();

        int opcionJugador2 = jugadores[1].getOpcion();
        int opcionJugador3 = jugadores[2].getOpcion();

        System.out.println(jugadores[1].getNombre() + " eligió: " + opcionTexto(opcionJugador2));
        System.out.println(jugadores[2].getNombre() + " eligió: " + opcionTexto(opcionJugador3));
        this.determinarGanador(jugadores[0]);

    }

    private void jugarContraMaquina(Jugador[] jugadores) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Elige tu opción:");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijeras");
        jugadores[0].opcion = scanner.nextInt();

        while (jugadores[0].opcion < 1 || jugadores[0].opcion > 3) {
            System.out.println("Opción inválida. Por favor, elige 1, 2 o 3.");
            jugadores[0].opcion = scanner.nextInt();
        }

        jugadores[1].elegirOpcion();
        int opcionJugador2 = jugadores[1].getOpcion();

        System.out.println("Elegiste: " + opcionTexto(jugadores[0].opcion));
        System.out.println(jugadores[1].getNombre() + " eligió: " + opcionTexto(opcionJugador2));
        
        this.determinarGanador(jugadores[0]);
    }

    public boolean comprobarGanador(Jugador otroJugador) {
        int miOpcion = this.getOpcion();
        int opcionOtroJugador = otroJugador.getOpcion();

        if ((miOpcion == 1 && opcionOtroJugador == 3) ||
                (miOpcion == 2 && opcionOtroJugador == 1) ||
                (miOpcion == 3 && opcionOtroJugador == 2)) {

            return true;
        } else if ((opcionOtroJugador == 1 && miOpcion == 3) ||
                (opcionOtroJugador == 2 && miOpcion == 1) ||
                (opcionOtroJugador == 3 && miOpcion == 2)) {

            return true;
        } else {
            return false;
        }
    }

    public void determinarGanador(Jugador otroJugador) {
        if (this.comprobarGanador(otroJugador)) {
            System.out.println(this.getNombre() + " gana!");
        } else if (otroJugador.comprobarGanador(this)) {
            System.out.println(otroJugador.getNombre() + " gana!");
        } else {
            System.out.println("¡Es un empate!");
        }
    }
}
