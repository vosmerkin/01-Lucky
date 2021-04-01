import java.util.*;

public class Coin {

    public boolean toss () {
        Random rand = new Random(47);
        boolean rnd;
        rnd=rand.nextBoolean();
        rnd=rand.nextBoolean();
        return rnd;
    }
}
