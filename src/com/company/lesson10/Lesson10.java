package com.company.lesson10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Lesson10 {
    public Properties readPropFile() {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(new File("src\\com\\company\\example.properties").getAbsolutePath()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

    public List<String> readFileAsList() {
        List<String> list = new ArrayList<>();
        File file = new File("src\\com\\company\\example.properties");
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(file);
            BufferedReader br = new BufferedReader(new InputStreamReader(fileInputStream));
            String line;
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public void writeToFile(List<String> list) {
        FileWriter fileWriter = null;
        File file = new File("src\\com\\company\\example.properties");
        try {
            fileWriter = new FileWriter(file);
            fileWriter.append("123");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
