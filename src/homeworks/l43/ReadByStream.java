package homeworks.l43;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadByStream {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("resources/ex1.txt")){
do{//чтение по 1 байту за итерацию
    int i = fis.read();
    if(i==-1)
        break;

    System.out.print((char)i); //i приводим к char

}while(true);

        }catch(IOException e){
            System.out.println("Something went wrong...");
        }
    }
}
