public class Jugador {
    private String nombre;
    private int opcion;
    private int puntaje;

    private int[][] reglas = {
            { 0, 1, -1, -1, -1, -1, -1, 1, 1, 1, 1, 1, 1, 1 }, // Piedra
            { -1, 0, 1, 1, 1, 1, 1, -1, -1, -1, -1, -1, -1, -1 }, // Papel
            { 1, -1, 0, -1, -1, -1, -1, 1, 1, 1, 1, 1, 1, 1 }, // Tijeras
            { 1, -1, 1, 0, -1, -1, -1, 1, 1, 1, 1, 1, 1, 1 }, // Pistola
            { 1, -1, 1, 1, 0, -1, -1, 1, 1, 1, 1, 1, 1, 1 }, // Rayo
            { 1, -1, 1, 1, 1, 0, -1, 1, 1, 1, 1, 1, 1, 1 }, // Dragón
            { 1, -1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1 }, // Agua
            { -1, 1, -1, -1, -1, -1, -1, 0, 1, -1, 1, -1, -1, -1 }, // Aire
            { -1, 1, -1, -1, -1, -1, -1, -1, 0, 1, -1, 1, -1, -1 }, // Esponja
            { -1, 1, -1, -1, -1, -1, -1, 1, -1, 0, 1, -1, 1, -1 }, // Lobo
            { -1, 1, -1, -1, -1, -1, -1, 1, 1, -1, 0, 1, -1, 1 }, // Árbol
            { -1, 1, -1, -1, -1, -1, -1, 1, -1, 1, -1, 0, 1, -1 }, // Humano
            { -1, 1, -1, -1, -1, -1, -1, 1, -1, -1, 1, -1, 0, 1 }, // Serpiente
            { -1, 1, -1, -1, -1, -1, -1, 1, -1, 1, -1, 1, -1, 0 } // Fuego
    };

    private String[] opciones = {
        "Piedra","Papel", "Tijeras", "Pistola", "Rayo", "Dragón", "Agua", " Aire", "Esponja", "Lobo", "Árbol", "Humano", "Serpiente", "Fuego" 
    }
    
    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getOpcion() {
        return opcion;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public int comparar(Jugador jugador) {
        return reglas[this.opcion][jugador.getOpcion()];
    }

    public String toString() {
        return "[" + nombre + "] saca [" + this.toStringOpcion() + "]";
    }

    public String toStringOpcion() {
       return opciones[this.option];
    }

    public void jugar() {
        this.opcion = (int) (Math.random() * this.reglas.length);
    }

    public void incrementaPuntaje() {
        this.puntaje++;
    }
}
