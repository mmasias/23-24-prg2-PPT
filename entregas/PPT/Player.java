import java.util.Random;

public class Player {

    private String name;
    private int selection;
    private String choice;

    public Player(String name){

        this.name = name;

    }

    public void choose(){
        Random random = new Random();
        selection = random.nextInt(3);
    }

    public String getName(){

        return name;
    }

    public int getSelection(){

        return selection;
    }

    public String getChoice(){

    if (selection==0) {
        choice = "piedra";
    }else if(selection==1){
        choice = "papel";
    }else{
        choice = "tijera";
    }

    return choice;
    }
    
}
