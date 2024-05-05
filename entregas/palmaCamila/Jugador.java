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
        String opcionStr = "";
        switch (opcion) {
            case 0:
                opcionStr = "Piedra";
                break;
            case 1:
                opcionStr = "Papel";
                break;
            case 2:
                opcionStr = "Tijeras";
                break;
            case 3:
                opcionStr = "Pistola";
                break;
            case 4:
                opcionStr = "Rayo";
                break;
            case 5:
                opcionStr = "Dragón";
                break;
            case 6:
                opcionStr = "Agua";
                break;
            case 7:
                opcionStr = "Aire";
                break;
            case 8:
                opcionStr = "Esponja";
                break;
            case 9:
                opcionStr = "Lobo";
                break;
            case 10:
                opcionStr = "Árbol";
                break;
            case 11:
                opcionStr = "Humano";
                break;
            case 12:
                opcionStr = "Serpiente";
                break;
            case 13:
                opcionStr = "Fuego";
                break;
        }
        return opcionStr;
    }

    public void jugar() {
        this.opcion = (int) (Math.random() * this.reglas.length);
    }

    public void incrementaPuntaje() {
        this.puntaje++;
    }
}
