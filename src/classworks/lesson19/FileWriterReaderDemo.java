package classworks.lesson19;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderDemo {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("src/classworks/lesson19/a.txt");
             FileWriter fw = new FileWriter("src/classworks/lesson19/b.txt")) {

            char[] ch = new char[50];
            fr.read(ch);
            int size = fr.read(ch);
            for (int i = 0; i < size; i++) {
                fw.write(ch[i]);
            }

        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }
}