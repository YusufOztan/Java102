package AdventureGame;

public class River extends BattleLoc {
    private static boolean Visited = false;
    public River(Player player) {
        super(player, "Bear", new Bear(), "Water",2);
    }

    public static boolean isVisited() {
        return Visited;
    }

    public static void setVisited(boolean visited) {
        Visited = visited;
    }
}
