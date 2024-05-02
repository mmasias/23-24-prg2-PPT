import java.util.Random;

public class Jugador {
    private String nombre;
    private int eleccion;
    private String seleccionado;
    private int puntuacion = 0;

    public Jugador(String nombre) {
        this.nombre = nombre;
        puntuacion = 0;
    }

    public void escoge() {
        Random random = new Random();
        eleccion = random.nextInt(3);
    }

    public String nombre() {
        return nombre;
    }

    public int obtenerSeleccion(){
        return eleccion;
    }

    public String selccionado() {
        if (eleccion==0) {
            seleccionado = "piedra";
        }else if(eleccion==1){
            seleccionado = "papel";
        }else if(eleccion == 3){
            seleccionado = "tijera";
        }
    
        return seleccionado;
    }

    public void sumarPuntaje() {
        puntuacion++;
    }

    public int puntaje() {
        return puntuacion;
    }

}
