package FileClasses;
import java.io.File;

public class Main {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\Saif4\\IdeaProjects\\OneLongMonth\\src\\FileClasses\\secret_message.txt");

        if (file.exists()){
            System.out.println("That file exists");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
//            file.delete();

        }
        else {
            System.out.println("That file does not exists");
        }
    }
}
