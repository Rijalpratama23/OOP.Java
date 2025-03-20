package character;
import base.*;

public class Enemy extends Player{
    public Enemy(String name, int health, int attackPower){
        super(name,health,attackPower);
    }

    public int Attack() {
        int damage = super.attack();
        boolean criticalHit = rand.nextDouble() > 0.4;
        if (criticalHit) {
            damage *= 2;
            System.out.println("🐦‍🔥 Critical hit! :" + getName());
        }
        return damage;
    }
    @Override
    public void infoPlayer() {
        System.out.println("👹Enemy :" + "HP :" + getHealth());
    }

}
