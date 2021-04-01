import java.util.*;

public class HumanPlayer {
    // boolean[] playerGuesses;

    public boolean[] userMakesTries(int tries) {
        Scanner in = new Scanner(System.in);
        boolean[] userGuess = new boolean[tries];
        for (int i = 0; i < tries; i++) {
            System.out.printf("(%d) Input a Obverse (1) or Reverse (something else): ", i + 1);
            if (in.nextInt() == 1)
                userGuess[i] = true;
            else
                userGuess[i] = false;
        }
        return userGuess;
    }
}

