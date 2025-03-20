package character;
import base.*;

public class Hero extends Player{
    public Hero(String name, int health, int attackPower){
        super(name,health,attackPower);
    }

    public int Attack() {
        int damage;
        if (playerAvoid() %2 == 1) {
            damage = 0;
            System.out.println(getName() + " " + "Berhasil menghindar");
        }else {
            damage = super.attack();
            boolean criticalDamage = rand.nextDouble()> 0.3;
            if(criticalDamage) {
                damage *= 2;
                System.out.println("critical damage : " + " " + getName());
            }
        }
        return damage;
    }
    @Override
    public void infoPlayer() {
        System.out.println("Name :" + "HP :" + getHealth());
    }

}
