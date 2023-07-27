package AdventureGame;

public class Cave extends BattleLoc{
    private static boolean Visited = false;
    public Cave(Player player) {
        super(player, "Cave", new Zombie(),"Food",3);
    }

    public static boolean isVisited() {
        return Visited;
    }

    public static void setVisited(boolean visited) {
        Visited = visited;
    }
}
