package utils;

import java.util.Scanner;

public class Utils {

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static char readChar() {
        return new Scanner(System.in).next().charAt(0);
    }

    public static String readString() {
        return new Scanner(System.in).nextLine();
    }

    public static int readInteger() {
        return new Scanner(System.in).nextInt();
    }

    public static void makePause() {
        new Scanner(System.in).nextLine();
    }

    public static int readIntegerBetween(int min, int max) {
        int value;
        boolean validValue = false;
        do {
            System.out.println("Ingrese un valor entre [" + min + "] y [" + max + "]");
            value = readInteger();
            validValue = value >= min && value < max;
        } while (!validValue);
        return value;
    }
}
