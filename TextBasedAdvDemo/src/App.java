import java.util.Scanner;


public class App {
    private static String[] QTEXT; //Stores question text
    private static int[][] QVAL; //Stores choice consequence/affect
    private static int[] userChoice; //Stores the user responses
    private static int numofQ = 10; //Number of questions
    
    public static void main(String[] args) throws Exception {
        gameSetup();


    }




    // initializes the questions and values
    public static void gameSetup() {
        //Creating the Arrays
        QTEXT = new String[numofQ];
        QVAL = new int[numofQ][3]; //max 3 choices/options
        userChoice = new int[numofQ];

        for(int i = 0; i<numofQ; i++) {
            switch(i) {
                //first Question
                case 0:
                    QTEXT[i] = "Congragulations you woke up what do you want to do today?";
                    QTEXT[i] = QTEXT[i] + "\n type 0 for sleep in";
                    QTEXT[i] = QTEXT[i] + "\n type 1 get out of bed and get ready ";
                    QVAL[i][0] = 0; //Option 1 affect
                    QVAL[i][1] = 20; //Option 2 affect
                    QVAL[i][2] = 0; //Option 3 affect
                    QVAL[i][3] = 0; //Option 4 affect
                    break;

            }

        }
    }
}
