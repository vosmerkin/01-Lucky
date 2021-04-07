
public class Lucky {



    public static void main(String[] args) {

        int numTries;

        GameProtocol gameProtocol1= new GameProtocol();

        numTries = gameProtocol1.askForNumTries();
        gameProtocol1.compareTries(numTries);




    }

}
