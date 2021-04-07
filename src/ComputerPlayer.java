import java.util.*;

public class ComputerPlayer {

    public boolean[] computerTossesCoin(int tries) {
        Coin coin1 = new Coin();
        boolean[] coins = new boolean[tries];
        int index = 1;

        for (int i = 0; i < tries; i++) {
            coins[i] = coin1.toss();
            System.out.printf("(%d) Computer tosses the coin: (%d) %n", i + 1, coins[i]);
            System.out.print(coins[i]);
            System.out.println();
        }
        return coins;
    }
}
