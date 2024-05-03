public class Juego {

    private Jugador[] jugador = new Jugador[2];
    final private int[][] tablaPuntaje = new int[][] {
    {0,-1,1},
    {1,0,-1},
    {-1,1,0}};

    public Juego(String nombre1, String nombre2) {
        jugador[0] = new Jugador(nombre1);
        jugador[1] = new Jugador(nombre2);
    }

    public void jugar(){
        int rondas = 1;
        do {
            int segundos = 1;
            System.out.println("Ronda: " + rondas);
            jugador[0].escoge();
            jugador[1].escoge();
            System.out.println("[" + jugador[0].nombre()+ "]" + " ha sacado " + jugador[0].seleccionar() + " y " + "[" + jugador[1].nombre() + "]" + " ha sacado " + jugador[1].seleccionar());
            obetenerGanador();
            rondas++;
            pause(segundos);
        } while (jugando());
    }

    private void obetenerGanador() {
        if (tablaPuntaje[jugador[0].obtenerSeleccion()][jugador[1].obtenerSeleccion()]==0) {
            System.out.println("> Empate");
        }else if(tablaPuntaje[jugador[0].obtenerSeleccion()][jugador[1].obtenerSeleccion()]==1){
            jugador[0].sumarPuntaje();
            System.out.println("> Gana " + jugador[0].nombre());
        }else{
            jugador[1].sumarPuntaje();
            System.out.println("> Gana " + jugador[1].nombre());
        }
    }

    private boolean jugando() {
        return jugador[0].puntaje() != 3 && jugador[1].puntaje() != 3;
    }

    static void pause(int seconds) {
        try {
            Thread.sleep(1000 * seconds);
        } catch (InterruptedException e) {
        }
    }
}