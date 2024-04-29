import java.util.Random;

public class Jugador {
    public enum Jugada {
        PIEDRA, PAPEL, TIJERAS;
        
        public static Jugada obtenerJugadaAleatoria() {
            Random random = new Random();
            return values()[random.nextInt(values().length)];
        }
    }

    public Jugada generarJugada() {
        return Jugada.obtenerJugadaAleatoria();
    }
}
