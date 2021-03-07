import java.util.*;

public class lucky {
    public static void main(String[] args) {
        boolean[] coin = new boolean[5];
        boolean[] user_guess = new boolean[5];
        Scanner in = new Scanner(System.in);

        //пользователь делает 5 попыток угадать
            for (int i=0;i<5;i++)
                {
                    System.out.printf("(%d) Input a Obverse (1) or Reverse (0): ", i+1);
                    if (in.nextInt()== 1)
                        user_guess[i] = true;
                    else
                        user_guess[i] = false;
                }

            Random rand = new Random(47);
        //комп 5 раз подкидывает монету
            for (int i=0;i<5;i++)
                {

                    coin[i] = rand.nextBoolean();
                    System.out.printf("(%d) Computer tosses the coin: ", i+1);
                    System.out.print(coin[i]);
                    System.out.println();
                }


        //выводим результат по каждой попытке
            for (int i=0;i<5;i++)
                {
                    if (coin[i] == user_guess[i])
                        System.out.printf("(%d) User guessed right", i+1 );
                    else
                        System.out.printf("(%d) User guessed not right", i+1 );
                    System.out.println();
                }



    }

}
