package LabPart3;

public class Player {

    private final int originalHealth;
    private int health;
    private int strength;
    private int lives;

    public Player(int health, int strength, int lives) {
        this.health = health;
        this.originalHealth=getHealth();
        this.strength = strength;
        this.lives = lives;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getOriginalHealth() {
        return originalHealth;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public int getLives() {
        return lives;
    }

    public void decreaseLives(){
        setLives(getLives()-1);
        setHealth(getOriginalHealth());
    }


}
