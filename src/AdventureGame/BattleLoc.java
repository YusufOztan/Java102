package AdventureGame;

import java.sql.SQLOutput;
import java.util.Random;

public abstract class BattleLoc extends Location{
    private Monster monster;
    private String award;
    private int maxMonster;
    public BattleLoc(Player player, String name,Monster monster,String award,int maxMonster) {
        super(player, name);
        this.monster = monster;
        this.award = award;
        this.maxMonster = maxMonster;
    }

    @Override
    public boolean onLocation() {
        int monNumber = this.randomMonsterNumber();

        System.out.println("Now you are here: " + this.getName());
        System.out.println("Careful! There are " + monNumber + " " + this.getMonster().getName() + " in here.");
        System.out.println("Fight or Run");
        String selectCase = input.nextLine();
        selectCase = selectCase.toUpperCase();
        if (selectCase.equals("F") && combat(monNumber)){
            System.out.println("You defeated all monsters in " + this.getName());
            switch (this.getName()){
                case "Cave":
                    Cave.setVisited(true);
                    break;
                case "Forest":
                    Forest.setVisited(true);
                    break;
                case "River":
                    River.setVisited(true);
                    break;
                case "Mine":
                    Mine.setVisited(true);
                    break;
            }
            return true;
        }
        if (this.getPlayer().getHealth() <= 0){
            System.out.println("You died.");
            return false;
        }
        return true;
    }
    public boolean combat(int monNumber){
        for( int i = 1; i <= monNumber; i ++) {
            this.getMonster().setHealth(this.getMonster().getDefaultHealth());
            playerStats();
            monStats(i);
            while(this.getPlayer().getHealth() > 0 && this.getMonster().getHealth() > 0){
                System.out.println("<F>ight or <R>un");
                String selectCombat = input.nextLine().toUpperCase();
                if (selectCombat.equals("F")){
                    System.out.println("You hit !");
                    monster.setHealth(this.getMonster().getHealth() - this.getPlayer().getTotalDamage());
                    afterHit();
                    if(this.getMonster().getHealth() > 0){
                        System.out.println();
                        System.out.println("Monster hit you !");
                        int monDamage = this.getMonster().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                        if(monDamage < 0) {
                            monDamage = 0;
                        }
                        this.getPlayer().setHealth(this.getPlayer().getHealth() - monDamage);
                        afterHit();
                    }
                } else {
                    return false;
                }

            }
            if(this.getMonster().getHealth() < this.getPlayer().getHealth()){
                System.out.println("You defeated the enemy");
                System.out.println("Your award is : " + this.getMonster().getAward());
                this.getPlayer().setMoney(this.getPlayer().getMoney()+this.getMonster().getAward());
                System.out.println("Your current money: " + this.getPlayer().getMoney());
            } else {
                return false;
            }
        }
        return false;

    }
    public void afterHit(){
        System.out.println("Your Health: " + this.getPlayer().getHealth());
        System.out.println(this.getMonster().getName() + "'s Health is : " + this.getMonster().getHealth());
        System.out.println();
    }
    public void playerStats(){
        System.out.println("---Player Status---");
        System.out.println("Health: " + this.getPlayer().getHealth());
        System.out.println("Damage: " + this.getPlayer().getTotalDamage());
        System.out.println("Weapon: " + this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Armor: " + this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Block: " + this.getPlayer().getInventory().getArmor().getBlock());
        System.out.println("Money : " + this.getPlayer().getMoney());

    }
    public void monStats(int i){
        System.out.println("---" + i + "." +  "Enemy Status---");
        System.out.println("Health: " + this.getMonster().getHealth());
        System.out.println("Damage: " + this.getMonster().getDamage());
        System.out.println("Money: " + this.getMonster().getAward());
    }
    public int randomMonsterNumber(){
        Random r = new Random();
        return r.nextInt(3) + 1;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxMonster() {
        return maxMonster;
    }

    public void setMaxMonster(int maxMonster) {
        this.maxMonster = maxMonster;
    }
}
