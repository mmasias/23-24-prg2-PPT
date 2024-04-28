public class ManejadorUI {
    
    public static void mostrarJugada(String nombreJugador1, Jugador.Jugada jugada1, String nombreJugador2, Jugador.Jugada jugada2, int resultado) {
        System.out.println("[" + nombreJugador1 + "] saca [" + jugada1 + "] / [" + nombreJugador2 + "] saca [" + jugada2 + "]");
        if (resultado == 0) {
            System.out.println("> Empate");
        } else if (resultado == 1) {
            System.out.println("> Gana " + nombreJugador1);
        } else {
            System.out.println("> Gana " + nombreJugador2);
        }
    }

    public static void mostrarResultadoFinal(String nombreJugador1, int puntosJugador1, String nombreJugador2, int puntosJugador2) {
        System.out.println("Jugador " + nombreJugador1 + "\n" + puntosJugador1 + " puntos...");
        System.out.println("Jugador " + nombreJugador2 + "\n" + puntosJugador2 + " puntos...");
        if (puntosJugador1 > puntosJugador2) {
            System.out.println("¡Jugador " + nombreJugador1 + " es el ganador del juego!");
        } else {
            System.out.println("¡Jugador " + nombreJugador2 + " es el ganador del juego!");
        }
    }
}
