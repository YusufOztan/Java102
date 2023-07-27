package AdventureGame;

public class Forest extends BattleLoc{
    private static boolean Visited = false;
    public Forest(Player player) {
        super(player,"Forest",new Vampire(),"Firewood", 3);
    }

    public static boolean isVisited() {
        return Visited;
    }

    public static void setVisited(boolean visited) {
        Visited = visited;
    }
}
