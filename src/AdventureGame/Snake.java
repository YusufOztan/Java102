package AdventureGame;

import java.util.Random;

public class Snake extends Monster{

    public Snake(){
        super(4, "Snake", 0, 12, 0);
        super.setDamage(randomDamage());
    }

    public int randomDamage() {
        Random r = new Random();
        return r.nextInt(4) + 3;
    }

}
