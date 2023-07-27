package AdventureGame;

import java.util.Scanner;

public class Player{
    private int damage;
    private int health;
    private int defaultHealth;

    private int money;
    private String charName;
    private String name;
    private Inventory inventory;


    Scanner scan = new Scanner(System.in);
    public Player(String name){
        this.name = name;
        this.inventory = new Inventory();
    }

    public void selectChar(){

        GameChar[] charList = {new Samurai(),new Archer(),new Knight()};
        System.out.println("-------------------------------------------------------------");
        for (GameChar gameChar : charList) {
            System.out.println(gameChar.getId()+". Character: " + gameChar.getName() +
                    "\t Damage: " + gameChar.getDamage() +
                    "\t Health: " + gameChar.getHealth() +
                    "\t Money: " + gameChar.getMoney());

        }
        System.out.println("-------------------------------------------------------------");
        System.out.print("Please select a character: ");
        int selectChar = scan.nextInt();
        switch(selectChar){
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            default:
                initPlayer(new Samurai());
        }
        System.out.println("Your Character: " + this.getCharName() +
                "\t Damage: " + this.getDamage() +
                "\t Health: " + this.getHealth() +
                "\t Money: " + this.getMoney());
    }

    public void initPlayer(GameChar gameChar){
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setDefaultHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
        this.setCharName(gameChar.getName());
    }
    public void printInfo(){
        System.out.println("Your Weapon: " + this.getInventory().getWeapon().getName() +
                "\t Your Armor: " + this.getInventory().getArmor().getName() +
                "\t Block: " + this.getInventory().getArmor().getBlock() +
                "\t Damage: " + this.getTotalDamage() +
                "\t Health: " + this.getHealth() +
                "\t Money: " + this.getMoney());
    }
    public int getTotalDamage(){
        return damage + this.getInventory().getWeapon().getDamage();
    }
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDefaultHealth() {
        return defaultHealth;
    }

    public void setDefaultHealth(int defaultHealth) {
        this.defaultHealth = defaultHealth;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

}
