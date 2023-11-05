package OOPs.Encapsulation;

public class Main {

    public static void main(String[] args) {

        // Player player = new Player();
        // player.name = "Madhan";
        // player.health = 17;
        // player.weapon = "Sword";

        // int damage = 7;
        // player.loseHealth(damage);
        // int a =player.healthRemaining();
        // System.out.println("Remaining Health = "+a);
        
        
        // damage =11;

        // player.loseHealth(damage);
        // a =player.healthRemaining();
        // System.out.println("Remaining Health = "+a);


        EmhancedPlayer Madhan = new EmhancedPlayer("Madhan",200 ,"G90");
        System.out.println("Inintial Health is " +Madhan.healthRemaining());

    }

}
