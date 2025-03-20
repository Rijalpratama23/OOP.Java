package main;
import character.Enemy;
import character.Hero;


public class Battle {
    public static void main(String[] args) {
        Hero hero = new Hero("Warrio",100,20);
        Enemy enemy = new Enemy("👹Reog",100,20);

        System.out.println("pertarungan dimulai" + hero.getName() + "VS" + enemy.getName());

        hero.infoPlayer();
        enemy.infoPlayer();
        System.out.println("===================================");

        while(hero.isLive() && enemy.isLive()) {
            int heroDamage = hero.attack();
            enemy.takeDamage(heroDamage);
            if(!enemy.isLive()) {
                System.out.println(hero.getName() + "Menang!!!");
            }

            int enemyDamage = enemy.Attack();
            hero.takeDamage(enemyDamage);

            if(!hero.isLive()) {
                System.out.println(enemy.getName() + " " + "Menang!!!");
            }
        }
    }
}
