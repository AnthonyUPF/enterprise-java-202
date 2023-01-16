package LabPart3;

public class Wizard extends Player{

    public Wizard(int health, int strength, int lives) {
        super(health, strength, lives);
    }

    public void restoreLives(){
        setLives(getLives()+1);
    }
}
