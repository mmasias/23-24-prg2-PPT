public class Juego {
    
    private Jugador jugador1;
    private Jugador jugador2;
    private int puntosJugador1;
    private int puntosJugador2;
    private String nombreJugador1;
    private String nombreJugador2;

    public Juego(String nombreJugador1, String nombreJugador2) {
        this.jugador1 = new Jugador();
        this.jugador2 = new Jugador();
        this.puntosJugador1 = 0;
        this.puntosJugador2 = 0;
        this.nombreJugador1 = nombreJugador1;
        this.nombreJugador2 = nombreJugador2;
    }

    public void jugar() {
        while (puntosJugador1 < 3 && puntosJugador2 < 3) {
            Jugador.Jugada jugada1 = jugador1.generarJugada();
            Jugador.Jugada jugada2 = jugador2.generarJugada();
            int resultado = ReglasDelJuego.compararJugadas(jugada1, jugada2);
            ManejadorUI.mostrarJugada(nombreJugador1, jugada1, nombreJugador2, jugada2, resultado);
            actualizarPuntos(resultado);
        }
        ManejadorUI.mostrarResultadoFinal(nombreJugador1, puntosJugador1, nombreJugador2, puntosJugador2);
    }

    private void actualizarPuntos(int resultado) {
        if (resultado == 1) {
            puntosJugador1++;
        } else if (resultado == -1) {
            puntosJugador2++;
        }
    }
}
