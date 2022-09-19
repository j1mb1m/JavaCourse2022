package by.itacademy.hw12.task3;

import java.io.*;

public class FileHandler {

    public void writeFile(String fileName, byte[] bytes) {
        try (OutputStream outputStream = new FileOutputStream(fileName)) {
            outputStream.write(bytes);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public byte[] readFile(String fileName) {
        byte[] bytes = new byte[0];
        try (InputStream fileReader = new FileInputStream(fileName);
             BufferedInputStream bufferedReader = new BufferedInputStream(fileReader)) {

            bytes = bufferedReader.readAllBytes();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return bytes;
    }


}
