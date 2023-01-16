package FileClasses.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        try {
            FileWriter writer = new FileWriter("src/FileClasses/FileWriter/poem.txt");
            writer.write("Roses are red \nViolets are blue \nBooty booty booty \nRockin everywhere");
            writer.close();
            writer.append("\nA poem by Bro");
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }

}
