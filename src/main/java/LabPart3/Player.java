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
        if(health<=0){
            this.health=0;
        }else {
            this.health = health;
        }
    }

    public void setStrength(int strength) {
        if(strength<=0){
            this.strength=0;
        }else {
            this.strength = strength;
        }
    }

    public void setLives(int lives) {
        if(lives<=0){
            this.lives=0;
        }else {
            this.lives = lives;
        }
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

    public void attack(Player player){
        player.setHealth(player.getHealth()-strength);
        if(player.getHealth()<=0){
            player.decreaseLives();
        }
    }


}
