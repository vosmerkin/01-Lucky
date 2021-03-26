import java.util.*;

public class Lucky {

    public static final int numTries = 5;

    //пользователь0 делает 5 попыток угадать
    static boolean[] userMakesTries(int tries) {
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

    //комп 5 раз подкидывает монету
    static boolean[] computerTossesCoin(int tries) {
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

    //выводим результат по каждой попытке
    static void playTheGame(boolean[] userGuess, boolean[] coin) {

        for (int i = 0; i < numTries; i++) {
            if (coin[i] == userGuess[i])
                System.out.printf("(%d) User guessed right", i + 1);
            else
                System.out.printf("(%d) User guessed not right", i + 1);
            System.out.println();
        }
    }

    public static void main(String[] args) {

        playTheGame(userMakesTries(numTries), computerTossesCoin(numTries));


    }

}
