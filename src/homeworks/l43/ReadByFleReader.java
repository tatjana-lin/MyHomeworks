package homeworks.l43;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;

public class ReadByFleReader {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("resources/ex2.txt")){
            BufferedReader br = new BufferedReader(fr);
            do {
                String line = br.readLine();
                if(line == null)
                    break;
                System.out.println(line);

            }while(true);
        } catch(IOException e){
            System.out.println("Something went wrong...");
        }
    }
}
