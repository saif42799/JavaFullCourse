import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class testText {

    public static void main(String[] args) throws FileNotFoundException {

        File textFile = new File("C:\\Users\\Saif4\\IdeaProjects\\OneLongMonth\\src\\monsters.txt");
        Scanner readFile = null;

        try {
            readFile = new Scanner(textFile);
        } catch (Exception e) {
            System.out.println("Invalid File");
            System.exit(0);
        }

        try
        {
            while (readFile.hasNext()) {
                String itemName = readFile.nextLine();
                String itemDescription = readFile.nextLine();

                String winMsg = readFile.nextLine();
                String loseMsg = readFile.nextLine();

                String room = readFile.nextLine();
                int roomID = Integer.parseInt(room);

                String hp = readFile.nextLine();
                int monHp = Integer.parseInt(hp);

                String dmg = readFile.nextLine();
                int monDmg = Integer.parseInt(dmg);


            }
        }
        catch (Exception e){

            //Error message for monster file
            System.out.println("Reading Monster File Error!");
            System.exit(0);

        }



    }
}
