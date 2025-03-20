package base;
import abilities.Attackable;
import java.util.Random;


public abstract class Player implements Attackable {
    String name;
    int health;
    int attackPower;
    protected Random rand = new Random();

    // cosntructor
    public Player(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }
    @Override
    public int attack() {
        return rand.nextInt(attackPower) + 1;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        System.out.println(this.name + "menerima damage" + damage + "!!" + "sisa health :" + this.health);
    }
    
    public int playerAvoid() {
        return rand.nextInt(10)+1;
    }
    // untuk mengecek player hidup/tidak
    public boolean isLive() {
        return health > 0;
    }

    // method bersifat Abstract
    public abstract void infoPlayer();

    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }
}

