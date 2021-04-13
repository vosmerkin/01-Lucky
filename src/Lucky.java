
public class Lucky {



    public static void main(String[] args) {
        Player humanPlayer=  new HumanPlayer();
        Player computerPlayer = new ComputerPlayer();
        int numTries;

        GameProtocol gameProtocol1= new GameProtocol(humanPlayer, computerPlayer);

        numTries = gameProtocol1.askForNumTries();
        gameProtocol1.compareTries(numTries);




    }

}
