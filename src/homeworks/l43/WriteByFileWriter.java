package homeworks.l43;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteByFileWriter {
    public static void main(String[] args) {
        try(FileWriter fw = new FileWriter("resources/ex2.txt")){
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Hello, World!");
            bw.newLine();
            bw.write("I'm Tatjana.");
            bw.newLine();
            bw.write("Bye-bye!");
            bw.flush();
            System.out.println("I have just written a message.");
        }catch (IOException e){
            System.out.println("Something went wrong...");
        }
    }
}
