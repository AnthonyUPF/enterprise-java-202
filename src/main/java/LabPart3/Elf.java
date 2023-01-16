package LabPart3;

public class Elf extends Player{
    public Elf(int health, int strength, int lives) {
        super(health, strength, lives);
    }

    public void restoreStrength(){
        setStrength(getStrength()+1);
    }
}
