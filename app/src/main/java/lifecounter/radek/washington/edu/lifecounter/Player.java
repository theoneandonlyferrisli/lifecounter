package lifecounter.radek.washington.edu.lifecounter;

/**
 * Created by apple on 4/21/15.
 * A class that represents a single player in the game "Magic: The Gathering."
 */
public class Player {
    private int life;
    private boolean isDead;

    private static final int INITIAL_HP = 20;

    //Initializes the player with an initial health points of 20.
    public Player() {
        this.life = INITIAL_HP;
        this.isDead = false;
    }

    //Returns the player's current life.
    public int getLife() {
        return life;
    }

    //Changes the player's current life in game-play.
    public void play(int hpChange) {
        life -= hpChange;
        if (life <= 0) isDead = true;
    }

    //Returns whether the player has been killed.
    public boolean haveFallen() {
        return isDead;
    }
}
