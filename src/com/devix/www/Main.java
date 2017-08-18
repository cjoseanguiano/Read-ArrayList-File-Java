package com.devix.www;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
//        BufferedReader reader = new BufferedReader(new FileReader("C:\\file.txt"));
//        BufferedReader reader = new BufferedReader(new FileReader("/Users/carlosjoseanguiano/Documents/Impose/template"));
        BufferedReader reader = new BufferedReader(new FileReader("/User/carlosjoseanguiano"));

        while (true) {
            String line = reader.readLine();
            if (line == null) {
                break;
            }
            list.add(line);
        }
        reader.close();

        System.out.println("Lines  " + list.size());

        for (String line : list) {
            System.out.println(line);
        }
    }
}
