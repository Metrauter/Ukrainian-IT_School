package classworks.lesson20;

import java.io.*;
import java.io.IOException;

public class FileWriterReaderDemo {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(
                new FileReader("src/classworks/lesson19/b.txt"));
             BufferedWriter bw = new BufferedWriter(
                     new FileWriter("src/classworks/lesson19/a.txt"))) {

            String s = "Привет мир!";
            while ((s = br.readLine()) != null) {
                bw.write(s);
                bw.newLine();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}