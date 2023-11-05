package OOPs.Encapsulation;

public class EmhancedPlayer {
    private String fullName;
    private int healthPercentage;
    private String weapon;

    public EmhancedPlayer(String name) {
        this(name, 100, "Sword");

    }

    public EmhancedPlayer(String fullName, int health, String weapon) {
        this.fullName = fullName;
        if (health <= 0) {
            this.healthPercentage = 1;
        } else if (health > 0) {
            this.healthPercentage = 100;
        } else {
            this.healthPercentage = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        healthPercentage -= damage;
        if (healthPercentage < 0) {
            System.out.println("Player Knocked Out of Game");
        }
    }

    public int healthRemaining() {
        return healthPercentage;
    }

    public void restoreHealth(int extraHealth) {
        healthPercentage += extraHealth;
        if (healthPercentage > 100) {
            System.out.println("Player Resored to 100%");
            healthPercentage = 100;
        }

    }
}
