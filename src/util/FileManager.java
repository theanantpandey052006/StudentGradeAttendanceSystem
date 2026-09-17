package util;

import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

    public static void save(String data) {

        try {

            FileWriter writer =
                    new FileWriter("student_data.txt");

            writer.write(data);
            writer.close();

            System.out.println(
                    "Data saved successfully.");

        } catch (IOException e) {

            System.out.println(
                    "Error while saving data.");
        }
    }
}