package vPRG1;

import java.util.Scanner;

class TresEnRaya {
    public static void main(String[] args) {
        final String[] PIEZAS = { "Piedra", "Papel", "Tijera" };
        final int[][] REGLAS = {
                { 0, -1, 1 },
                { 1, 0, -1 },
                { -1, 1, 0 }
        };

        int miJugada = pedirPieza();
        int suJugada = lanzamiento();

        System.out.println(PIEZAS[miJugada] + " vs " + PIEZAS[suJugada]);
        String resultado = REGLAS[miJugada][suJugada] == 0 ? "Empate" : REGLAS[miJugada][suJugada] == 1 ? "Gane" : "Perdí";
        System.out.println(resultado);
    }

    static int lanzamiento() {
        return (int) (Math.random() * 3);
    }

    static int pedirPieza() {
        return new Scanner(System.in).nextInt();
    }
}