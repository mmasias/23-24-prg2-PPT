import java.util.Random;

 class Player {
    private String name;
    private String choice;

    public Player(String name) {
        this.name = name;
    }

    public void choose() {
        Random random = new Random();
        int selection = random.nextInt(3);
        switch (selection) {
            case 0:
                choice = "Piedra";
                break;
            case 1:
                choice = "Papel";
                break;
            case 2:
                choice = "Tijeras";
                break;
        }
    }

    public String choice() {
        return choice;
    }

    public String name() {
        return name;
    }
}

 class Game {
    private Player player1;
    private Player player2;
    private int scorePlayer1 = 0;
    private int scorePlayer2 = 0;
    private int numberOfRounds = 7;

    public Game(String name1, String name2) {
        this.player1 = new Player(name1);
        this.player2 = new Player(name2);
    }

    public void play() {
        for (int round = 0; round < numberOfRounds; round++) {
            player1.choose();
            player2.choose();
            System.out.println("[" + player1.name() + "] saca [" + player1.choice() + "] / [" + player2.name() + "] saca [" + player2.choice() + "]");

            if (player1.choice().equals(player2.choice())) {
                System.out.println("> Empate");
            } else if ((player1.choice().equals("Piedra") && player2.choice().equals("Tijeras")) ||
                       (player1.choice().equals("Papel") && player2.choice().equals("Piedra")) ||
                       (player1.choice().equals("Tijeras") && player2.choice().equals("Papel"))) {
                System.out.println("> Gana " + player1.name());
                scorePlayer1++;
            } else {
                System.out.println("> Gana " + player2.name());
                scorePlayer2++;
            }
        }

        System.out.println("Jugador " + player1.name() + "\n" + scorePlayer1 + " puntos...");
        System.out.println("Jugador " + player2.name() + "\n" + scorePlayer2 + " puntos...");
    }
}

public class PPT {
    public static void main(String[] args) {
        Game game = new Game("Bill Gates", "Steve Jobs");
        game.play();
    }
}