import java.util.*;

public class ComputerPlayer {

    public boolean[] computerTossesCoin(int tries) {
        Coin coin1 = new Coin();
        boolean[] coins = new boolean[tries];
        int index = 1;
//        for (boolean coin : coins) {
//            coin = coin1.toss();
//            System.out.printf("(%d) Computer tosses the coin: ", index++);
//            System.out.print(coin);
//            System.out.print(coins[index-2]);
//            System.out.println();
//        }
        for (int i = 0; i < tries; i++) {
            coins[i] = coin1.toss();
            System.out.printf("(%d) Computer tosses the coin: ", i + 1);
            System.out.print(coins[i]);
            System.out.println();
        }
        return coins;
    }
}
