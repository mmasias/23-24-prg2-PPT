package PPT;

public class Game {

    private Player[] players = new Player[2];
    final private int[][] scoringTable = new int[][] {
                                    {0,-1,1},
                                    {1,0,-1},
                                    {-1,1,0}

    };

    public Game(String name1, String name2){

        players[0] = new Player(name1);
        players[1] = new Player(name2);
        }

    public void play(){

        int rounds = 1;

            do{
                System.out.println("Round: " + rounds);
                players[0].choose();
                players[1].choose();
                System.out.println("[" + players[0].getName()+ "]" + " ha sacado " + players[0].getChoice() + " y " + "[" + players[1].getName() + "]" + " ha sacado " + players[1].getChoice());
                selectWinnerOfTheRound();
                rounds++;
            }while(playing());
            System.out.println("\n");
            System.out.println("Jugador " + players[0].getName() + "\n" + players[0].getScore());
            System.out.println("Jugador " + players[1].getName() + "\n" + players[1].getScore());

    }

    private void selectWinnerOfTheRound(){
        if (scoringTable[players[0].getSelection()][players[1].getSelection()]==0) {
            System.out.println("> Empate");
        }else if(scoringTable[players[0].getSelection()][players[1].getSelection()]==1){
            players[0].sumScore();
            System.out.println("> Gana " + players[0].getName());
        }else{
            players[1].sumScore();
            System.out.println("> Gana " + players[1].getName());
        }
    }

    private boolean playing(){

        return players[0].getScore()!=3 && players[1].getScore()!=3;

    }

}