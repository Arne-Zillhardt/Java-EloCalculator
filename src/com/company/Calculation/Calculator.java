package com.company.Calculation;

import java.util.ArrayList;

public class Calculator {
    final double k = 30;
    ArrayList<Double> results = new ArrayList<>();

    public void getResults(double rating1, double rating2) {
        probebility(rating1, rating2);

        //0
        win(rating1, results.get(0)); //Chance of winning
        //1
        results.add(results.get(0) + rating1); //If win, new score
        //2
        results.set(2, results.get(1) - rating1); //If win, scorechange

        //3
        draw(rating1, results.get(0));
        //4
        results.add(results.get(3) + rating1);
        //5
        results.set(5, results.get(4) - rating1);
        String s = "Test" +
                    " dskfn";
        //6
        loose(rating1, results.get(0));
        //7
        results.add(results.get(6) + rating1);
        //8
        results.set(8, results.get(7) - rating1);
    }

    void probebility(double r1, double r2) {
        double p = (1.0/(1.0 + Math.pow(10, ((r2 - r1)/400.0))));

        results.add(p);
    }

    void win (double r1, double p) {
        double r = r1 + k * (1 - p);

        results.add(r);
    }

    void draw (double r1, double p) {
        double r = (int) (r1 + k * (0.5 - p));

        results.add(r);
    }

    void loose (double r1, double p) {
        double r = r1 + k * (-p);

        results.add(r);
    }

    public ArrayList<Double> getResults() {
        results.set(0, results.get(0) * 100);

        for (int i = 0; i < results.size(); i++) {
            double a = results.get(i);

            double b = Math.round(a);

            results.set(i, b);
        }

        return results;
    }
}
