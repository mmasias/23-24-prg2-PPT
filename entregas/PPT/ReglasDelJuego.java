public class ReglasDelJuego {
    
    public static int compararJugadas(Jugador.Jugada j1, Jugador.Jugada j2) {
        if (j1 == j2) return 0;
        switch (j1) {
            case PIEDRA:
                return (j2 == Jugador.Jugada.TIJERAS ? 1 : -1);
            case PAPEL:
                return (j2 == Jugador.Jugada.PIEDRA ? 1 : -1);
            case TIJERAS:
                return (j2 == Jugador.Jugada.PAPEL ? 1 : -1);
        }
        return 0;
    }
}
