package PPT;

public class Game {

    private Player[] players = new Player[2];
    final private int[][] scoringTable;

    public Game(String name1, String name2){
        scoringTable = new int[][] {
                                    {0,-1,1},
                                    {1,0,-1},
                                    {-1,1,0}
                                };
        players[0] = new Player(name1);
        players[1] = new Player(name2);
    }

    public void play(){

        int rounds = 0;

            do{
                rounds++;
                System.out.println("Round: " + rounds);
                players[0].choose();
                players[1].choose();
                System.out.println("[" + players[0].getName()+ "]" + " ha sacado " + players[0].getChoice() + " y " + "[" + players[1].getName() + "]" + " ha sacado " + players[1].getChoice());
                selectWinnerOfTheRound();
            }while(playing());
            System.out.println("\n");
            System.out.println("Jugador " + players[0].getName() + "\n" + players[0].getScore());
            System.out.println("Jugador " + players[1].getName() + "\n" + players[1].getScore());
    }

    private void selectWinnerOfTheRound(){
        switch(scoringTable[player[0].getSelection()][player[1].getSelection()]){
            case 0:
                System.out.println("> Empate");
                break;
            case 1:
                players[0].sumScore();
                System.out.println("> Gana " + players[0].getName());
                break;
            case -1:
                players[1].sumScore();
                System.out.println("> Gana " + players[1].getName());
                break;
        }
    }

    private boolean playing(){

        return players[0].getScore()!=3 && players[1].getScore()!=3;

    }

}