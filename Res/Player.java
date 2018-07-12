package Res;

public class Player
{
    //data of the player ship
    private static Player player;
    private int lives;
    private int health;
    private int weaponLevel;

    private void newGame()
    {
        lives = 3;
        health = 100;
        weaponLevel = 1;
    }
    private Player()
    {
        newGame();
    }
    public static Player getInstance()
    {
        if(player==null)
        {
            player = new Player();
        }
        return player;
    }
    public int getLives()
    {
        return lives;
    }
    public int getHealth()
    {
        return health;
    }
    public int getDamage(int difficulty)
    {
        return weaponLevel * 10 * difficulty;
    }
    public void checkPlayer()
    {
        if(lives == 0)
        {
            newGame();
        }
    }
}
