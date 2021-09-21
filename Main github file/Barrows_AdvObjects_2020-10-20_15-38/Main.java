
public class Main {

    public static void main(String[] args) {
//most of this assignment is trying to read the existing code to understand how it works,
        //ask a classmate or instructor if you are unsure how the code works.


        //generate a new player
        Player play = new Player();
        //main game loop that continues while the player is alive
        //fill the () with a call to a method that checks if the player is alive
        while(play.isAlive()) {
            //generate a new enemy( the level of the enemy should be the player's level)
            Enemy em = new Enemy(play.getPlayerLevel());
            //battle loop that should continue while both the player and enemy are alive
            //Fill the () with a check to make sure the player is alive and(&&) the enemy is alive
            while(play.isAlive()&& em.isAlive() ) {
                //gets player's input on what to do (use one of the methods to do this)
                play.menu(em);
		em.takeDamage(play);
                play.takeDamage(em);
              
                

                //have the enemy take damage
                
                //have the player take damage
                
                
            }
        }
        //once the player is dead print out the player's level and how much xp they had.
        //use the following format: Level: 2 XP: 5
        System.out.println("Level: "+play.getPlayerLevel()+" XP: "+play.getXP());
    }
}
