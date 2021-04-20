import java.util.Scanner;

public class ComputerPlayer implements Player {
    @Override
    public boolean[] tossTheCoin(int tries) {
        Coin coin1 = new Coin();
        boolean[] coins = new boolean[tries];

        for (int i = 0; i < tries; i++) {
            coins[i] = coin1.toss();
            System.out.printf("(%d) Computer tosses the coin: (%b) %n", i + 1, coins[i]);
        }
        return coins;
    }

    @Override
    public boolean[] makeGuesses (int tries) {
        // the same as Toss_the_coin
        System.out.print("Computer tosses to guess the coin");

        return tossTheCoin(tries);
    }

}
