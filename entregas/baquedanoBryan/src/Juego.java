public class Juego {

    private Menu menu;
    private Jugador[] jugadores;
    private int opcionSeleccionada;
    private boolean hayGanador;

    public Juego() {

        menu = new Menu();
        jugadores = new Jugador[3];
        jugadores[0] = new Jugador("Usuario");
        jugadores[1] = new Jugador("Nebel");
        jugadores[2] = new Jugador("María");

    }

    public void execute() {
        do{
        menu.show();

        do {
            opcionSeleccionada = menu.escoger();
            jugadores[0].jugar(opcionSeleccionada, jugadores);
            hayGanador = jugadores[0].comprobarGanador(jugadores[1]);

        } while (!hayGanador);

    } while (!menu.salirDelJuego(opcionSeleccionada));

    }

    public static void main(String[] args) {
        Juego ppt = new Juego();
        ppt.execute();
    }

}
