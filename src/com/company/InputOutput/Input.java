package com.company.InputOutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Input {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<Double> input = new ArrayList<>();

    public void getInput() {
        try {
            String s = reader.readLine();

            double in = 0;
            try {
                in = Double.parseDouble(s);
            } catch (Exception e) {
                System.out.println("Please enter a number!");
                getInput();
            }

            input.add(in);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Double> getInputs(){
        return input;
    }
}
