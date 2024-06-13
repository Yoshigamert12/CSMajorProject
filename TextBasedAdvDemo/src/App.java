import java.util.Scanner;


public class App {
    private static String[] QTEXT; //Stores question text
    private static int[][] QROUTE; //Next question
    private static int[][] QVAL; //Stores choice consequence/affect
    private static int[] userChoice; //Stores the user responses
    private static int numofQ = 30; //Number of questions
    private static int maxChoices = 3; //number of options for response
    // Make the Counter
    public static void main(String[] args) throws Exception {
        gameSetup();
        Scanner keys = new Scanner(System.in);

        //Game loop
        for (int i = 0; i < numofQ; i++) {
            //Prompt the answer with the question
            System.out.println(QTEXT[i]);
            int inp = keys.nextInt();
            System.out.println("Your choice was " + inp + ". Your Aura is affected " + QVAL[i][inp]);

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
                    QROUTE[i][0] = 5;

                    QVAL[i][1] = 20; //Option 2 affect
                    QROUTE[i][1] = 1;

                    QVAL[i][2] = 0; //Option 3 affect
                    
                    break;
                 case 1:
                    QTEXT[i] = "You decided to be productive today and got your BUTT out of bed! what are you going to do to be productive?";
                    QTEXT[i] = QTEXT[i] + "\n type 0 binge watch the new Fallout Show";
                    QTEXT[i] = QTEXT[i] + "\n type 1 to clean your house  ";
                    QTEXT[i] = QTEXT[i] + "\n type 2 make breakfast ";

                    QVAL[i][0] = -5; //Option 1 affect
                    QROUTE[i][0] = 5;

                    QVAL[i][1] = 30; //Option 2 affect
                    QROUTE[i][1] = 3;

                    QVAL[i][2] = 20; //Option 3 affect
                    QROUTE[i][2] = 2 ;

                    break;
                case 2:
                    QTEXT[i] = "You made breakfast it was good! How would you like to spend the rest of your afternoon?";
                    QTEXT[i] = QTEXT[i] + "\n type 0 Rot in your room playing League of Ledgends";
                    QTEXT[i] = QTEXT[i] + "\n type 1 hangout with friends";
                    QTEXT[i] = QTEXT[i] + "\n type 2 visit your mom ";

                    QVAL[i][0] = -500000; //Option 1 affect
                    QROUTE[i][0] = 16 ;

                    QVAL[i][1] = 80; //Option 2 affect
                    QROUTE[i][1] = 9;

                    QVAL[i][2] = 50; //Option 3 affect
                    QROUTE[i][2] = 4 ;
                    break;
                case 3:
                    QTEXT[i] = "You Decided to Clean your house! how would you like to soend the rest of your afternoon? ";
                    QTEXT[i] = QTEXT[i] + "\n type 0 Rot in your room playing League of Ledgends";
                    QTEXT[i] = QTEXT[i] + "\n type 1 hangout with friends";
                    QTEXT[i] = QTEXT[i] + "\n type 2 visit your mom";

                    QVAL[i][0] = -500000; //Option 1 affect
                    QROUTE[i][0] = 16 ;

                    QVAL[i][1] = 80; //Option 2 affect
                    QROUTE[i][1] = 9;

                    QVAL[i][2] = 50; //Option 3 affect
                    QROUTE[i][2] = 4;
                    break;
                case 4:
                    QTEXT[i] = "You got home after visiting your mom! its now 5 what do you want to do?";
                    QTEXT[i] = QTEXT[i] + "\n type 0 dont eat anything";
                    QTEXT[i] = QTEXT[i] + "\n type 1 make a healthy meal for yourself";
                    QTEXT[i] = QTEXT[i] + "\n type 2 order the McDoanlds";

                    QVAL[i][0] = -50; //Option 1 affect
                    QVAL[i][1] = 40; //Option 2 affect
                    QVAL[i][2] = -10; //Option 3 affect
                    
                    break;
                case 5:
                    QTEXT[i] = "You made it to night! how would you like to spend it ";
                    QTEXT[i] = QTEXT[i] + "\n type 0 play league of legends till next morning ";
                    QTEXT[i] = QTEXT[i] + "\n type 1 get to bed early to have a good night";
                    QTEXT[i] = QTEXT[i] + "\n type 2 watch a movie";

                    QVAL[i][0] = -500000; //Option 1 affect
                    QROUTE[i][0] = 16 ;

                    QVAL[i][1] = 40; //Option 2 affect
                    QROUTE[i][1] = 6;

                    QVAL[i][2] = 10; //Option 3 affect
                    QROUTE[i][2] = 7;
                    
                    break;
                case 6: // ENDING
                    QTEXT[i] = "You went to Bed! Sweet Dreams!";
                    QTEXT[i] = QTEXT[i] + "\n type 0 to Start Over";
                    QVAL[i][0] = 0;
                    QROUTE[i][0] = 0 ;

                    QTEXT[i] = QTEXT[i] + "\n type 1 to Stop Playing ";
                    QVAL[i][1] = 0;
                    QROUTE[i][1] = 33 ;

                    QTEXT[i] = QTEXT[i] + "\n type 2 to Retry the Situation";
                    QVAL[i][2] = 0;
                    QROUTE[i][2] = 5;
                    
                    break;
                case 7:
                    QTEXT[i] = "You wanted to watch a movie to end this day! Which Movie? ";
                    QTEXT[i] = QTEXT[i] + "\n type 0 for a youtube iceberg video on youtube creepypastas ";
                    QTEXT[i] = QTEXT[i] + "\n type 1 Cars 2";
                    QTEXT[i] = QTEXT[i] + "\n type 2 there is nothing good. head to bed";

                    QVAL[i][0] = 15; //Option 1 affect
                    QROUTE[i][0] = 13;

                    QVAL[i][1] = 100000000; //Option 2 affect
                    QROUTE[i][1] = 8;

                    QVAL[i][2] = -40; //Option 3 affect
                    QROUTE[i][2] = 6;
                    break;
                case 8: // ENDING 
                    QTEXT[i] = "Cars 2 was fantastic and you wont let others tell you other wise! you then headed off to bed";
                    QTEXT[i] = QTEXT[i] + "\n type 0 to Start Over";
                    QVAL[i][0] = 0;
                    QROUTE[i][0] = 0 ;

                    QTEXT[i] = QTEXT[i] + "\n type 1 to Stop Playing ";
                    QVAL[i][1] = 0;
                    QROUTE[i][1] = 33 ;

                    QTEXT[i] = QTEXT[i] + "\n type 2 to Retry the Situation";
                    QVAL[i][2] = 0;
                    QROUTE[i][2] = 7;
                    break;
                case 9:
                    QTEXT[i] = "You choose to hangout with your friends! you guys go mini golfing! What do you guys want to do for the night?";
                    QTEXT[i] = QTEXT[i] + "\n type 0 head home youve had enough for the day";
                    QTEXT[i] = QTEXT[i] + "\n type 1 head to a friends house";
                    QTEXT[i] = QTEXT[i] + "\n type 2 go to the boston pizza to have some apple juice ;)";

                    QVAL[i][0] = 10; //Option 1 affect
                    QROUTE[i][0] = 5;

                    QVAL[i][1] = 40; //Option 2 affect
                    QROUTE[i][1] = 10;

                    QVAL[i][2] = 80; //Option 3 affect
                    QROUTE[i][2] = 6;
                    break;
                case 10:
                    QTEXT[i] = "You guys went to your friends house! What are you fellas doing its yo choice?";
                    QTEXT[i] = QTEXT[i] + "\n type 0 watch a movie";
                    QTEXT[i] = QTEXT[i] + "\n type 1 play Mario Kart";
                    QTEXT[i] = QTEXT[i] + "\n type 2 Play Mario Party";

                    QVAL[i][0] = 60; //Option 1 affect
                    QROUTE[i][0] = 11;

                    QVAL[i][1] = 100; //Option 2 affect
                    QROUTE[i][1] = 12;

                    QVAL[i][2] = 90; //Option 3 affect
                    QROUTE[i][2] = 6;

                    break;
                case 11:
                    QTEXT[i] = "You guys watched Broke Back Mountain to show your bond with your friends! its getting late so you head home! what do you do when home?";
                    QTEXT[i] = QTEXT[i] + "\n type 0 play league of legends till next morning";
                    QTEXT[i] = QTEXT[i] + "\n type 1 to go to bed";
                    
                    QVAL[i][0] = -500000; //Option 1 affect
                    QROUTE[i][0] = 16 ;

                    QVAL[i][1] = 40; //Option 2 affect
                    QROUTE[i][1] = 6;

                    QVAL[i][2] = 0; //Option 3 affect
                    
                    break;
                case 12:
                    QTEXT[i] = "You guys played Mario Kart! who would you like to play?";
                    QTEXT[i] = QTEXT[i] + "\n type 0 Play as any of the Baby Characters";
                    QTEXT[i] = QTEXT[i] + "\n type 1 Play as Yoshi!";
                    QTEXT[i] = QTEXT[i] + "\n type 2 Play as Goku?";

                    QVAL[i][0] = -500000; //Option 1 affect
                    QROUTE[i][0] = 16;


                    QVAL[i][1] = 1000000000; //Option 2 affect
                    QROUTE[i][1] = 18;

                    QVAL[i][2] = 50; //Option 3 affect
                    QROUTE[i][2] = 17;
                    break;
                case 13: 
                    QTEXT[i] = "You Watched the Creepy iceberg video but cant get the feealing of being watched off of your shoulders";
                    QTEXT[i] = QTEXT[i] + "\n type 0 decide to just go to bed";
                    QTEXT[i] = QTEXT[i] + "\n type 1 Look around your house to calm yourself";
                    QTEXT[i] = QTEXT[i] + "\n type 2 investigate the weird scartching at your window you swear you keep hearing";

                    QVAL[i][0] = 40; //Option 1 affect
                    QROUTE[i][0] = 6;

                    QVAL[i][1] = -40; //Option 2 affect
                    QROUTE[i][1] = 14;

                    QVAL[i][2] = -10; //Option 3 affect
                    QROUTE[i][2] = 15;
                    break;
                case 14: // ENDING
                    QTEXT[i] = "You looked around your house but fortunatley you didn't find anything so you went to bed and had a good sleep!";
                    QTEXT[i] = QTEXT[i] + "\n type 0 to Start Over";
                    QVAL[i][0] = 0;
                    QROUTE[i][0] = 0 ;

                    QTEXT[i] = QTEXT[i] + "\n type 1 to Stop Playing ";
                    QVAL[i][1] = 0;
                    QROUTE[i][1] = 33 ;

                    QTEXT[i] = QTEXT[i] + "\n type 2 to Retry the Situation";
                    QVAL[i][2] = 0;
                    QROUTE[i][2] = 13;
                    break;
                case 15://ENDING
                    QTEXT[i] = "You Checked the Scratching out and saw something and it lunged at you an then ꇸꉈꅔꅂ ꇞꀟꀧꉖ ꁕꅂꁄꉖꍈ'ꇞ ꅔꄡꇞ꒦ꅔ꒒꒒ꒄ ꉈꁄꅔꍈ ꅔꍈꒄꇞꀟꀧꍈꁅ ꋣ꒦ꇞ ꁅꅂꅂꁕ ꆽꅂꋣ ꇞꎡꅔꍈꉖ꒒ꅔꇞꀧꍈꁅ ꀧꇞ!";
                    QTEXT[i] = QTEXT[i] + "\n type 0 to Start Over";
                    QVAL[i][0] = 0;
                    QROUTE[i][0] = 0 ;

                    QTEXT[i] = QTEXT[i] + "\n type 1 to Stop Playing ";
                    QVAL[i][1] = 0;
                    QROUTE[i][1] = 33 ;

                    QTEXT[i] = QTEXT[i] + "\n type 2 to Retry the Situation";
                    QVAL[i][2] = 0;
                    QROUTE[i][2] = 13;
                    break;
                case 16: // ENDING
                    QTEXT[i] = "You Distgust Me";
                    QTEXT[i] = QTEXT[i] + "\n type 0 to Start Over";
                    QVAL[i][0] = 0;
                    QROUTE[i][0] = 0 ;

                    QTEXT[i] = QTEXT[i] + "\n type 1 to Stop Playing ";
                    QVAL[i][1] = 0;
                    QROUTE[i][1] = 33 ;

                    QVAL[i][2] = 0;
                   
                    
                    break;
                case 17: // ENDING
                    QTEXT[i] = "Your Friend had a hacked version of the game! UH OH Bad Desicion! Nintendo Ninjas found you you are now locked up in Nintendo's Dugeon!";
                    QTEXT[i] = QTEXT[i] + "\n type 0 to Start Over";
                    QVAL[i][0] = 0;
                    QROUTE[i][0] = 0 ;

                    QTEXT[i] = QTEXT[i] + "\n type 1 to Stop Playing ";
                    QVAL[i][1] = 0;
                    QROUTE[i][1] = 33 ;

                    QTEXT[i] = QTEXT[i] + "\n type 2 to Retry the Situation";
                    QVAL[i][2] = 0;
                    QROUTE[i][2] = 12;
                    break;
                case 18:
                    QTEXT[i] = "You Crushed Your Friends in Mario Kart! its getting late so you head home! what do you do when home?";
                    QTEXT[i] = QTEXT[i] + "\n type 0 play league of legends till next morning";
                    QTEXT[i] = QTEXT[i] + "\n type 1 to go to bed";
                    
                    QVAL[i][0] = -500000; //Option 1 affect
                    QROUTE[i][0] = 16 ;

                    QVAL[i][1] = 40; //Option 2 affect
                    QROUTE[i][1] = 6;

                    QVAL[i][2] = 0; //Option 3 affect
                    
                    break;
                case 19:
                    QTEXT[i] = "You Guys Played Mario Party! Choose Your Character!";
                    QTEXT[i] = QTEXT[i] + "\n type 0 Choose Yoshi";
                    QTEXT[i] = QTEXT[i] + "\n type 1 Choose Toad";
                    QTEXT[i] = QTEXT[i] + "\n type 1 Choose Peter Griffin?";

                    QVAL[i][0] = 1000000000; //Option 1 affect
                    QROUTE[i][0] = 21 ;

                    QVAL[i][1] = -50; //Option 2 affect
                    QROUTE[i][1] = 20;

                    QVAL[i][2] = 50; //Option 3 affect
                    QROUTE[i][2] = 17;
                    
                    break;
                case 20: // ENDING
                    QTEXT[i] = "You Beat your Friends in Mario Party! But you were playing Toad so the Sound of his voice made them lose it so they proceeded to sacrifice you to an Elder God";
                    QTEXT[i] = QTEXT[i] + "\n type 0 to Start Over";
                    QVAL[i][0] = 0;
                    QROUTE[i][0] = 0 ;

                    QTEXT[i] = QTEXT[i] + "\n type 1 to Stop Playing ";
                    QVAL[i][1] = 0;
                    QROUTE[i][1] = 33 ;

                    QTEXT[i] = QTEXT[i] + "\n type 2 to Retry the Situation";
                    QVAL[i][2] = 0;
                    QROUTE[i][2] = 19;
                    break;
                case 21: 
                QTEXT[i] = "You Crushed Your Friends in Mario Party! its getting late so you head home! what do you do when home?";
                QTEXT[i] = QTEXT[i] + "\n type 0 play league of legends till next morning";
                QTEXT[i] = QTEXT[i] + "\n type 1 to go to bed";
                
                QVAL[i][0] = -500000; //Option 1 affect
                QROUTE[i][0] = 16 ;

                QVAL[i][1] = 40; //Option 2 affect
                QROUTE[i][1] = 6;

                QVAL[i][2] = 0; //Option 3 affect
                
                    break;
                case 22: 
                    QTEXT[i] = "You and your friends headed to Boston Pizza to enjoy some 'Apple Juice' as you guys walk in and have a few a mysterious man known as BB approaches you and he says he knows a better spot! What do you do?";
                    QTEXT[i] = QTEXT[i] + "\n type 0 Follow BB's Advice and go with him";
                    QTEXT[i] = QTEXT[i] + "\n type 1 politley decline";
                    QTEXT[i] = QTEXT[i] + "\n type 2 Initiate the only boss fight in this project?";
                    
                    QVAL[i][0] = -20; //Option 1 affect
                    QROUTE[i][0] = 24 ;
    
                    QVAL[i][1] = 20; //Option 2 affect
                    QROUTE[i][1] = 23;
    
                    QVAL[i][2] = 50; //Option 3 affect
                    QROUTE[i][2] = 29;

                    break;
                case 23:
                    QTEXT[i] = "You and your friends had some good 'apple juice' time. You guys head back to your own homes. its night time how would you like to spend it ";
                    QTEXT[i] = QTEXT[i] + "\n type 0 play league of legends till next morning ";
                    QTEXT[i] = QTEXT[i] + "\n type 1 get to bed early to have a good night";
                    QTEXT[i] = QTEXT[i] + "\n type 2 watch a movie";

                    QVAL[i][0] = -500000; //Option 1 affect
                    QROUTE[i][0] = 16 ;

                    QVAL[i][1] = 40; //Option 2 affect
                    QROUTE[i][1] = 6;

                    QVAL[i][2] = 10; //Option 3 affect
                    QROUTE[i][2] = 7;
                    
                    break;
                case 24:
                    QTEXT[i] = "You and your friends go with BB to this secret place. you guys head inside adn immediatley BB is put in his place by some Mob members who he owes money to! What do you want to do?";
                    QTEXT[i] = QTEXT[i] + "\n type 0 Help BB";
                    QTEXT[i] = QTEXT[i] + "\n type 1 Run for your Life";
                    
                    QVAL[i][0] = 50; //Option 1 affect
                    QROUTE[i][0] = 25 ;

                    QVAL[i][1] = -50; //Option 2 affect
                    QROUTE[i][1] = 26;

                    QVAL[i][2] = 0; //Option 3 affect
                    
                    
                    break;
                case 25: // ENDING
                    QTEXT[i] = "You Chose to help BB Look at you being so kind Unfourtunatley kindness is not super effective against 4 Mobsters";
                    QTEXT[i] = QTEXT[i] + "\n type 0 to Start Over";
                    QVAL[i][0] = 0;
                    QROUTE[i][0] = 0 ;

                    QTEXT[i] = QTEXT[i] + "\n type 1 to Stop Playing ";
                    QVAL[i][1] = 0;
                    QROUTE[i][1] = 33 ;

                    QTEXT[i] = QTEXT[i] + "\n type 2 to Retry the Situation";
                    QVAL[i][2] = 0;
                    QROUTE[i][2] = 24;
                    break;
                case 26:
                    QTEXT[i] = "You and your friends Ran from the place unforuntatley one of the mobsters chase you ";
                    QTEXT[i] = QTEXT[i] + "\n type 0 Fight Back";
                    QTEXT[i] = QTEXT[i] + "\n type 1 Continue to run";
                    
                    QVAL[i][0] = 50; //Option 1 affect
                    QROUTE[i][0] = 27 ;

                    QVAL[i][1] = -100; //Option 2 affect
                    QROUTE[i][1] = 28;

                    QVAL[i][2] = 0; //Option 3 affect
                    
                    
                    break;
                case 27:
                    QTEXT[i] = "You and your friends decieded to fight back its one of him and 4 of you. You guys successfully fend him off and you guys decide to head home after this crazy adventure. What would you like to do?  ";
                    QTEXT[i] = QTEXT[i] + "\n type 0 play league of legends till next morning";
                    QTEXT[i] = QTEXT[i] + "\n type 1 to go to bed";
                
                    QVAL[i][0] = -500000; //Option 1 affect
                    QROUTE[i][0] = 16 ;

                    QVAL[i][1] = 40; //Option 2 affect
                    QROUTE[i][1] = 6;

                    QVAL[i][2] = 0; //Option 3 affect
                
                    
                    break;
                case 28: // ENDING
                    QTEXT[i] = "You Chose to continue running but there was a rock placed on the ground for the sole purpose of tripping someone and unfourtunatley that was you and your friends left you for the Mob";
                    
                    QTEXT[i] = QTEXT[i] + "\n type 0 to Start Over";
                    QVAL[i][0] = 0;
                    QROUTE[i][0] = 0 ;

                    QTEXT[i] = QTEXT[i] + "\n type 1 to Stop Playing ";
                    QVAL[i][1] = 0;
                    QROUTE[i][1] = 33 ;

                    QTEXT[i] = QTEXT[i] + "\n type 2 to Retry the Situation";
                    QVAL[i][2] = 0;
                    QROUTE[i][2] = 26;

                    break;
                case 29:
                    QTEXT[i] = "You decided to fight BB (for some reason) how would you like to attack  ";

                    QTEXT[i] = QTEXT[i] + "\n type 0 Punch";
                    QTEXT[i] = QTEXT[i] + "\n type 1 Kick";
                    QTEXT[i] = QTEXT[i] + "\n type 2 Lick?";

                    QVAL[i][0] = 50; //Option 1 affect
                    QROUTE[i][0] = 30 ;

                    QVAL[i][1] =50; //Option 2 affect
                    QROUTE[i][1] = 31;

                    QVAL[i][2] = -500000; //Option 3 affect
                    QROUTE[i][2] = 32;
                case 30: // ENDING
                    QTEXT[i] = " You went for a punch and Missed then BB got the Advantage GAME OVER";

                    QTEXT[i] = QTEXT[i] + "\n type 0 to Start Over";
                    QVAL[i][0] = 0;
                    QROUTE[i][0] = 0 ;

                    QTEXT[i] = QTEXT[i] + "\n type 1 to Stop Playing ";
                    QVAL[i][1] = 0;
                    QROUTE[i][1] = 33 ;

                    QTEXT[i] = QTEXT[i] + "\n type 2 to Retry the Situation";
                    QVAL[i][2] = 0;
                    QROUTE[i][2] = 29;
                    break;
                case 31: // ENDING
                    QTEXT[i] = "You went for a kick and you then got a cramp in you leg and you fell over then BB got the Advantage GAME OVER";

                    QTEXT[i] = QTEXT[i] + "\n type 0 to Start Over";
                    QVAL[i][0] = 0;
                    QROUTE[i][0] = 0 ;

                    QTEXT[i] = QTEXT[i] + "\n type 1 to Stop Playing ";
                    QVAL[i][1] = 0;
                    QROUTE[i][1] = 33 ;

                    QTEXT[i] = QTEXT[i] + "\n type 2 to Retry the Situation";
                    QVAL[i][2] = 0;
                    QROUTE[i][2] = 29;
                    break;
                case 32: // ENDING
                    QTEXT[i] = "You went for a Lick no you dont get to continue playing for making that decision not even a continue please close the final project and have a good reflection on yourself";
                    break;
                case 33: // ENDING
                    QTEXT[i] = "Thank You for Trying this Project to its fullest!";
                    break;
            }

        }
    }
}
