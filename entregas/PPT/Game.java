public class Game {

    private Player[] players = new Player[2];
    private int[][] scoringTable = new int[3][3];
    private int[] score = new int[2];

    public Game(String name1, String name2){

        players[0] = new Player(name1);
        players[1] = new Player(name2);
        scoringTable[0][0]= 0;
        scoringTable[0][1]= -1;
        scoringTable[0][2]= 1;
        scoringTable[1][0]= 1;
        scoringTable[1][1]= 0;
        scoringTable[1][2]= -1;
        scoringTable[2][0]= -1;
        scoringTable[2][1]= 1;
        scoringTable[2][2]= 0;
        score[0]= 0;
        score[1] = 0;
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
            System.out.println("Jugador " + players[0].getName() + "\n" + score[0]);
            System.out.println("Jugador " + players[1].getName() + "\n" + score[1]);

    }

    public void selectWinnerOfTheRound(){
        if (scoringTable[players[0].getSelection()][players[1].getSelection()]==0) {
            System.out.println("> Empate");
        }else if(scoringTable[players[0].getSelection()][players[1].getSelection()]==1){
            score[0]++;
            System.out.println("> Gana " + players[0].getName());
        }else{
            score[1]++;
            System.out.println("> Gana " + players[1].getName());
        }
    }

    public boolean playing(){

        return score[0] !=3 && score[1]!=3;

    }

}
