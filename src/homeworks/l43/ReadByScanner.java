package homeworks.l43;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadByScanner {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("resources/ex1.txt")){
            Scanner scanner = new Scanner(fis);
            while(scanner.hasNext()){
                String line = scanner.nextLine();
                System.out.println(line);
            }
        }catch(IOException e){
            System.out.println("Something went wrong...");
        }
    }
}
