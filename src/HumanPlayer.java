import java.util.*;

public class HumanPlayer {
    // boolean[] playerGuesses;

    public boolean[] userMakesTries(int tries) {
        Scanner in = new Scanner(System.in);
        boolean[] userGuess = new boolean[tries];
        int index = 1;
        for (boolean usGs : userGuess) {
            System.out.printf("(%d) Input a Obverse (1) or Reverse (something else): ", index++);
            usGs = in.nextInt() == 1;
        }
        return userGuess;
    }
}

