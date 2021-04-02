import java.util.*;

public class GameProtocol {     //used to collect tries

    public int askForNumTries() {
        int numTries;
        Scanner in = new Scanner(System.in);
        System.out.println("Input number of tries:");
        numTries = in.nextInt();
        return numTries;
    }

    public void compareTries(int tries) {
        HumanPlayer HumanPlayer1 = new HumanPlayer();
        boolean[] playerGuesses;
        playerGuesses = HumanPlayer1.userMakesTries(tries);

        ComputerPlayer ComputerPlayer1 = new ComputerPlayer();
        boolean[] compTries;
        compTries = ComputerPlayer1.computerTossesCoin(tries);

        for (int i = 0; i < tries; i++) {
            if (playerGuesses[i] == compTries[i])
                System.out.printf("(%d) User guessed right", i + 1);

            else
                System.out.printf("(%d) User guessed not right", i + 1);
            System.out.println();

        }
    }


}
