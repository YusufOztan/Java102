package AdventureGame;

public class ToolStore extends NormalLoc{
    public ToolStore(Player player) {
        super(player, "Store");
    }
    @Override
    public boolean onLocation() {
        boolean showMenu = true;
        while (showMenu) {
            System.out.println("--------Welcome to store--------");
            System.out.println("1 - Guns\n" +
                    "2 - Armors\n" +
                    "3 - Exit");
            System.out.print("Your selection: ");
            int selectCase = Location.input.nextInt();
            while (selectCase < 1 || selectCase > 3) {
                System.out.println("Invalid value, please try again.");
                selectCase = input.nextInt();

            }
            switch (selectCase) {
                case 1:
                    printWeapon();
                    buyWeapon();
                    break;
                case 2:
                    printArmor();
                    buyArmor();
                    break;
                case 3:
                    System.out.println("We look forward to seeing you again..");
                    showMenu = false;
                    break;
            }

        }return true;
    }
    public void printWeapon(){
        System.out.println();
        System.out.println("---Weapons---");
        System.out.println();
        for (Weapon w: Weapon.weapons()) {
            System.out.println(w.getId() + " | " + w.getName()+" | Price: " + w.getPrice() + " | Damage: " + w.getDamage());
        }
        System.out.println("0 - Exit");



    }
    public void buyWeapon(){
        System.out.print("Please select a weapon: ");
        int selectWeaponID = input.nextInt();
        while(selectWeaponID < 0 || selectWeaponID > Weapon.weapons().length){
            System.out.println("Invalid value, please try again.");
            selectWeaponID = input.nextInt();

        }
        if( selectWeaponID != 0){
            Weapon selectedWeapon = Weapon.getWeaponObj(selectWeaponID);
            if(selectedWeapon!=null){
                if(selectedWeapon.getPrice()>this.getPlayer().getMoney()){
                    System.out.println("You have not enough money!");
                }else{
                    System.out.println("You buy " + selectedWeapon.getName());
                    int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Your remaining money: " + this.getPlayer().getMoney());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                }
        }

        }
    }

    public void printArmor(){
        System.out.println();
        System.out.println("---Armors---");
        System.out.println();
        for (Armor a: Armor.armors()) {
            System.out.println(a.getId() + " | " + a.getName()+" | Price: " + a.getPrice() + " | Block: " + a.getBlock());
        }
        System.out.println("0 - Exit");
    }
    public void buyArmor(){
        System.out.println("Please select a armor: ");

        int selectArmorID = input.nextInt();
        while(selectArmorID < 0 || selectArmorID > Armor.armors().length){
            System.out.print("Invalid value, please try again: ");
            selectArmorID = input.nextInt();

        }
        if(selectArmorID != 0){
            Armor selectedArmor = Armor.getArmorObj(selectArmorID);
            if (selectedArmor != null){
                if (selectedArmor.getPrice() > this.getPlayer().getMoney()){
                    System.out.println("You have not enough money!");
                }else{
                    System.out.println("You buy " + selectedArmor.getName());
                    int balance = this.getPlayer().getMoney() - selectedArmor.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Your remaining money: " + this.getPlayer().getMoney());
                    this.getPlayer().getInventory().setArmor(selectedArmor);
                }
        }

        }
    }
}
