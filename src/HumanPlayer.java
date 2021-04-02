import java.util.*;

public class HumanPlayer {
    // boolean[] playerGuesses;

    public boolean[] userMakesTries(int tries) {
        Scanner in = new Scanner(System.in);
        boolean[] userGuess = new boolean[tries];
//        int index = 1;
//        for (boolean usGs : userGuess) {
//            System.out.printf("(%d) Input a Obverse (1) or Reverse (something else): ", index++);
//            usGs = in.nextInt() == 1;
//        }

        for (int i = 0; i < tries; i++) {
            System.out.printf("(%d) Input a Obverse (1) or Reverse (0): ", i + 1);
            if (in.nextInt() == 1)
                userGuess[i] = true;
            else
                userGuess[i] = false;
        }

        return userGuess;
    }
}

