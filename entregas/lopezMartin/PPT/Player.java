package PPT;

import java.util.Random;

public class Player {

    private String name;
    private int selection;
    private int score;
    private String CHOICES = new {"Piedra","Papel","Tijera"};

    public Player(String name){
        this.name = name;
        score = 0;
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
        return CHOICES[selection];
    }

    public int getScore(){
        return score;
    }

    public void sumScore(){
        score++;
    }
    
}