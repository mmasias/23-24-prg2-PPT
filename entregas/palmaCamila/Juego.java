public class Juego {
    private Jugador[] jugadores = new Jugador[2];

    public Juego() {
        jugadores[0] = new Jugador("Bill Gates");
        jugadores[1] = new Jugador("Steve Jobs");
    }

    public void iniciar() {
        while (jugadores[0].getPuntaje() < 3 && jugadores[1].getPuntaje() < 3) {
            jugadores[0].jugar();
            jugadores[1].jugar();
            System.out.println(jugadores[0] + " / " + jugadores[1]);
            imprimeGanador(jugadores[0].comparar(jugadores[1]));
        }

        for (Jugador jugador : jugadores) {
            System.out.println("Jugador " + jugador.getNombre());
            System.out.println(jugador.getPuntaje() + " puntos...");
        }
    }

    private void imprimeGanador(int resultado) {
        System.out.print("> ");
        if (resultado == 0) {
            System.out.println("Empate");
        } else if (resultado == 1) {
            jugadores[0].incrementaPuntaje();
            System.out.println("Gana " + jugadores[0].getNombre());
        } else {
            jugadores[1].incrementaPuntaje();
            System.out.println("Gana " + jugadores[1].getNombre());
        }
    }
}
