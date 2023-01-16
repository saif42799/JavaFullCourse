package Audio;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class testMain {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        System.out.println("  -----------------------------");
        System.out.println("/                               \\");
        System.out.println("|      Tower of Champions       |");
        System.out.println("|                               |    ");
        System.out.println("|          New Game (1)         |    ");
        System.out.println("|          Continue (2)         |    ");
        System.out.println("|          Setting  (3)         |    ");
        System.out.println("|            Exit   (4)         |    ");
        System.out.println("\\                               /");
        System.out.println("  -----------------------------");

        Scanner input = new Scanner(System.in);
        System.out.print("> ");
        int command = input.nextInt();

        if (command == 1) {
            //continues to game
        }
        else if(command == 2){
            //idk
        }
        else if(command == 3){

            int temp = 0;

            do{

                System.out.println("  -----------------------------");
                System.out.println("          Commands  (1)             ");
                System.out.println("            Audio   (2)             ");
                System.out.println("          Main menu (3)             ");
                System.out.println("  -----------------------------");

                Scanner input2 = new Scanner(System.in);
                System.out.print("> ");
                int commandSettings = input.nextInt();

                if (commandSettings == 1) {


                }
                else if(commandSettings == 2) {

                    Scanner scanner = new Scanner(System.in);
                    File file = new File("src/Audio/Phantogram.wav");
                    AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
                    Clip clip = AudioSystem.getClip();
                    clip.open(audioStream);

                    clip.start();
                    String response = scanner.next();

                }
                else if(commandSettings == 3){

                    temp = 3;
                }

            }while(temp != 3);



        }
        else if(command == 4){
            System.out.println();

            System.out.println("Game Ended, GoodBye!");
            System.exit(0);
        }





    }



}
