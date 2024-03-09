package edu.ntudp.fit.samoilenko.laba4;

import com.google.gson.Gson;
import edu.ntudp.fit.samoilenko.laba4.model.University;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JsonManager {

    public void writeToJson(Object o, String filePath) {
        Gson gson = new Gson();
        String json = gson.toJson(o);

        try {
            FileWriter writer = new FileWriter(filePath);
            writer.write(json);
            writer.close();

            System.out.println("Successful write to file");
        } catch (IOException e) {
            System.out.println("There was an error");
            e.printStackTrace();
        }
    }

    public Object readFromJson(String filePath) {
        Gson gson = new Gson();

        try {
            return gson.fromJson(new FileReader(filePath), University.class);
        } catch (FileNotFoundException e) {
            System.out.println("Error");
            e.printStackTrace();
        }

        return null;
    }
}
