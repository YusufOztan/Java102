package AdventureGame;

import java.util.Scanner;

public class Game {
    private Scanner scan = new Scanner(System.in);
    public void start(){
        System.out.println("Welcome to Adventure Game");
        System.out.print("Please enter a name: ");
        String playerName = scan.nextLine();
        Player player = new Player(playerName);
        System.out.println(player.getName() + " welcome to our game!");
        player.selectChar();

        Location location = null;
        while(true) {
            player.printInfo();
            System.out.println("-------------------------------------------------------------");
            System.out.println("0 - Exit");
            System.out.println("Areas:");
            System.out.println("--- Normal Locations ---");
            System.out.println("1 - Safe House");
            System.out.println("2 - Store");
            System.out.println("--- Battle Locations ---");
            System.out.println("3 - Cave | Prize : Food | Enemy : Zombie");
            System.out.println("4 - Forest | Prize : Firewood | Enemy : Vampire");
            System.out.println("5 - River | Prize : Water | Enemy : Bear");
            System.out.println("6 - Mine | Prize : Random | Enemy : Snake");
            System.out.print("Please select location you want to go: ");

            int selectLoc = scan.nextInt();
            switch(selectLoc){
                case 0:
                    location = null;
                    break;
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    if(!Cave.isVisited()) {
                        location = new Cave(player);
                        break;
                    } else {
                        printFinalInfo();
                        continue;
                    }
                case 4:
                    if(!Forest.isVisited()) {
                        location = new Forest(player);
                        break;
                    } else {
                        printFinalInfo();
                        continue;
                    }
                case 5:
                    if(!River.isVisited()) {
                        location = new River(player);
                        break;
                    } else {
                        printFinalInfo();
                        continue;
                    }
                case 6:
                    if(!Mine.isVisited()) {
                        location = new Mine(player);
                        break;
                    } else {
                        printFinalInfo();
                        continue;
                    }
                default:
                    System.out.println("Please enter a valid number of area.");
            }
            if(location == null){
                System.out.println("You left the game!\n" +
                        "Have a good day!");
            }
            if (location != null && !location.onLocation()) {
                System.out.println("Game Over!");
                break;
            }
        }
    }
    public void printFinalInfo(){
        System.out.println("---You completed this location. Please select another location.---");
        System.out.println();
    }
}
