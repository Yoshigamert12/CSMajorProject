import java.util.Scanner;


public class App {
    private static String[] QTEXT; //Stores question text
    private static int[][] QROUTE; //Next question
    private static int[][] QVAL; //Stores choice consequence/affect
    private static int[] userChoice; //Stores the user responses
    private static int numofQ = 10; //Number of questions
    private static int maxChoices = 3; //number of options for response
    // Make the Counter
    public static void main(String[] args) throws Exception {
        gameSetup();
        Scanner keys = new Scanner(System.in);

        //Game loop
        for (int i = 0; i < numofQ; i++) {
            //Prompt the uswer with the question
            System.out.println(QTEXT[i]);
            int inp = keys.nextInt();
            System.out.println("Your choice was " + inp + ". The affect is this " + QVAL[i][inp]);

            //Do we need to skip?
            if (QROUTE[i][inp] > -1) {
                i = QROUTE[i][inp] - 1; //subtract to offset the loop increment
            }

        }

        System.out.println("EXITED");

    }




    // initializes the questions and values
    public static void gameSetup() {
        //Creating the Arrays
        QTEXT = new String[numofQ];
        QVAL = new int[numofQ][maxChoices]; //max 3 choices/options
        QROUTE = new int[numofQ][maxChoices]; //MAx 3 options
        userChoice = new int[numofQ];

        //Set all routes to -1 as default
        for (int i = 0; i<numofQ; i++) {
            for(int j = 0; j<maxChoices; j++) {
                QROUTE[i][j] = -1;
            }
        }

        //Question database
        for(int i = 0; i<numofQ; i++) {
            switch(i) {
                //first Question
                case 0:
                    QTEXT[i] = "Congragulations you woke up! how do you want to start your day?";
                    QTEXT[i] = QTEXT[i] + "\n type 0 for sleep in";
                    QTEXT[i] = QTEXT[i] + "\n type 1 get out of bed and get ready ";
                    
                    QVAL[i][0] = -15; //Option 1 affect
                    QROUTE[i][0] = 4;

                    QVAL[i][1] = 20; //Option 2 affect
                    QVAL[i][2] = 0; //Option 3 affect
                    
                    break;
                 case 1:
                    QTEXT[i] = "You decided to be productive today and got your BUTT out of bed! what are you going to do to be productive?";
                    QTEXT[i] = QTEXT[i] + "\n type 0 binge watch the new Fallout Show";
                    QTEXT[i] = QTEXT[i] + "\n type 1 to clean your house  ";
                    QTEXT[i] = QTEXT[i] + "\n type 2 make breakfast ";
                    QVAL[i][0] = -5; //Option 1 affect
                    QVAL[i][1] = 30; //Option 2 affect
                    QVAL[i][2] = 20; //Option 3 affect
                    
                    break;
                case 2:
                    QTEXT[i] = "You made it to the afternoon! now woud you like to do now with this free time?";
                    QTEXT[i] = QTEXT[i] + "\n type 0 Rot in your room playing League of Ledgends";
                    QTEXT[i] = QTEXT[i] + "\n type 1 hangout with friends";
                    QTEXT[i] = QTEXT[i] + "\n type 2 visit your mom ";
                    QVAL[i][0] = -100000; //Option 1 affect
                    QVAL[i][1] = 80; //Option 2 affect
                    QVAL[i][2] = 50; //Option 3 affect
                   
                    break;
                case 3:
                    QTEXT[i] = "You got home after visiting your mom! its now 5 what do you want to do?";
                    QTEXT[i] = QTEXT[i] + "\n type 0 dont eat anything";
                    QTEXT[i] = QTEXT[i] + "\n type 1 make a healthy meal for yourself";
                    QTEXT[i] = QTEXT[i] + "\n type 2 order the McDoanlds";
                    QVAL[i][0] = -50; //Option 1 affect
                    QVAL[i][1] = 40; //Option 2 affect
                    QVAL[i][2] = -10; //Option 3 affect
                    
                    break;
                case 4:
                    QTEXT[i] = "You made it to night! how would you like to spend it ";
                    QTEXT[i] = QTEXT[i] + "\n type 0 play league of legends till next morning ";
                    QTEXT[i] = QTEXT[i] + "\n type 1 get to bed early to have a good night";
                    QTEXT[i] = QTEXT[i] + "\n type 2 watch a movie";
                    QVAL[i][0] = -500000; //Option 1 affect
                    QVAL[i][1] = 40; //Option 2 affect
                    QVAL[i][2] = -10; //Option 3 affect
                    
                    break;
            }

        }
    }
}
