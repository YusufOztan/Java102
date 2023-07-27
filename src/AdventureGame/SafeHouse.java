package AdventureGame;

public class SafeHouse extends NormalLoc{
    public SafeHouse(Player player){
        super(player,"Safe House");
    }

    @Override
    public boolean onLocation(){
        System.out.println("You are in safe house. \n" +
                "Your health is renewed.");
        this.getPlayer().setHealth(this.getPlayer().getDefaultHealth());
        return true;
    }
}
