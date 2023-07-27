package AdventureGame;

import java.util.Objects;
import java.util.Random;

public class Mine extends BattleLoc{
    private static boolean Visited = false;
    public Mine(Player player) {
        super(player, "Mine" , new Snake(), null, 6);
    }
    public boolean combat(int monNumber) {
        for (int i = 1; i <= monNumber; i++) {
            this.getMonster().setHealth(this.getMonster().getDefaultHealth());
            playerStats();
            monStats(i);
            while (this.getPlayer().getHealth() > 0 && this.getMonster().getHealth() > 0) {
                System.out.println("<F>ight or <R>un");
                String selectCombat = input.nextLine().toUpperCase();
                if (selectCombat.equals("F")) {
                    System.out.println("You hit !");
                    getMonster().setHealth(this.getMonster().getHealth() - this.getPlayer().getTotalDamage());
                    afterHit();
                    if (this.getMonster().getHealth() > 0) {
                        System.out.println();
                        System.out.println("Monster hit you !");
                        int monDamage = this.getMonster().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                        if (monDamage < 0) {
                            monDamage = 0;
                        }
                        this.getPlayer().setHealth(this.getPlayer().getHealth() - monDamage);
                        afterHit();
                    }
                } else {
                    return false;
                }

            }
            if (this.getMonster().getHealth() < this.getPlayer().getHealth()) {
                System.out.println("You defeated the enemy");

                Object awardResult = award();

                    if (awardResult instanceof Weapon) {
                        Weapon weapon = (Weapon) awardResult;
                        System.out.println("Your award is: " + weapon.getName());
                        this.getPlayer().getInventory().setWeapon(weapon);
                    } else if (awardResult instanceof Armor) {
                        Armor armor = (Armor) awardResult;
                        System.out.println("Your award is: " + armor.getName());
                        this.getPlayer().getInventory().setArmor(armor);
                    }else if (awardResult instanceof Integer) {
                        Integer prize = (Integer) awardResult;
                        System.out.println("Your award is: " + prize);
                        this.getPlayer().setMoney(this.getPlayer().getMoney()+prize);
                        System.out.println("Your current money: " + this.getPlayer().getMoney());
                    } else {
                        System.out.println("There is nothing in there.");
                    }

            } else {
                return false;
            }
        }
        return false;

    }

    public Object award(){
        Random random = new Random();
        int luck = random.nextInt(100) + 1;
        int lowerLuck = random.nextInt(100) + 1;
        if (luck <= 15) {
            if (lowerLuck <= 20){
                return Weapon.getWeaponObj(1);
            } else if (lowerLuck <= 30){
                return Weapon.getWeaponObj(2);
            } else{
                return Weapon.getWeaponObj(3);
            }
        } else if (luck <= 30){
            if (lowerLuck <= 20){
                return Armor.getArmorObj(1);
            } else if (lowerLuck <= 30){
                return Armor.getArmorObj(2);
            } else{
                return Armor.getArmorObj(3);
            }
        } else {
            return null;
        }
    }
    public static boolean isVisited() {
        return Visited;
    }

    public static void setVisited(boolean visited) {
        Visited = visited;
    }
}
