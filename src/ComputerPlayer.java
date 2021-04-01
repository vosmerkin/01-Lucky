import java.util.*;

public class ComputerPlayer {

    public boolean[] computerTossesCoin(int tries) {
        Random rand = new Random(47);
        boolean[] coin = new boolean[tries];
        for (int i = 0; i < tries; i++) {

            coin[i] = rand.nextBoolean();
            System.out.printf("(%d) Computer tosses the coin: ", i + 1);
            System.out.print(coin[i]);
            System.out.println();

        }
        return coin;
    }
}
