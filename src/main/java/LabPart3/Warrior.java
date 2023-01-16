package LabPart3;

public class Warrior extends Player{

    public Warrior(int health, int strength, int lives) {
        super(health, strength, lives);
    }

    public void restoreHealth(){
        setHealth(getHealth()+1);
    }


}
