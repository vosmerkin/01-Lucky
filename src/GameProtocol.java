import java.util.*;

public class GameProtocol {

    private final Player humanPlayer;
    private final Player computerPlayer;

    public GameProtocol(Player humanPlayer, Player computerPlayer) {
        this.humanPlayer = humanPlayer;
        this.computerPlayer = computerPlayer;
    }

    public int askForNumTries() {
        int numTries;
        Scanner in = new Scanner(System.in);
        System.out.println("Input number of tries:");
        numTries = in.nextInt();
        return numTries;
    }

    public void compareTries(int tries) {

        boolean[] playerGuesses;
        playerGuesses = humanPlayer.makeGuesses(tries);

        boolean[] compTries;
        compTries = computerPlayer.tossTheCoin(tries);

       for (int i = 0; i < tries; i++) {
            if (playerGuesses[i] == compTries[i])
                System.out.printf("(%d) User guessed right", i + 1);

            else
                System.out.printf("(%d) User guessed not right", i + 1);
            System.out.println();

        }
    }


}
