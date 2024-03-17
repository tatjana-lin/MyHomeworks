package homeworks.l43;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteByStream {
    //записать в файл “Hello world, I’m тут ваше имя” (если его нет, он будет создан)
    // напишите чтение файла используя Scanner, BufferedReader, FileReader, FileInputStream
    //напишите чтение файла используя BufferedWriter, FileWriter, FileOutputStream
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("resources/ex1.txt")
        ){
            // FileOutputStream используется для записи байтов в файл.
            // Мы преобразуем строку в массив байтов и записываем его
            // в файл с помощью метода write().
            String text = "Hello world, I'm Tatjana!";
            // Преобразуем строку в массив байтов
            byte[] bytes = text.getBytes();
            // Записываем байты в файл
            fos.write(bytes);
            fos.flush();
            System.out.println("I have just written a message.");

        } catch(IOException e){
            System.out.println("Something went wrong...");
        }
    }
}
