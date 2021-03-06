import java.util.*;

public class HumanPlayer implements Player {
    // boolean[] playerGuesses;



    public boolean[] makeGuesses(int tries) {
        Scanner in = new Scanner(System.in);
        boolean[] userGuess = new boolean[tries];

        for (int i = 0; i < tries; i++) {
            System.out.printf("(%d) Input a Obverse (1) or Reverse (0): ", i + 1);
            if (in.nextInt() == 1)
                userGuess[i] = true;
            else
                userGuess[i] = false;
        }

        return userGuess;
    }

    public boolean[] tossTheCoin(int tries) {
        Coin coin1 = new Coin();
        boolean[] coins = new boolean[tries];

        for (int i = 0; i < tries; i++) {
            coins[i] = coin1.toss();
            System.out.printf("(%d) Computer tosses the coin: (%b) %n", i + 1, coins[i]);
        }
        return coins;
    }
}

