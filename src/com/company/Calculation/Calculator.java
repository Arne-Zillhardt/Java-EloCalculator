package com.company.Calculation;

import java.util.ArrayList;

public class Calculator {
    final double k = 30;
    ArrayList<Double> results = new ArrayList<>();

    public void getResults(double rating1, double rating2) {
        //0
        probebility(rating1, rating2); //Chance of winning

        //1
        win(rating1, results.get(0)); //If win, new score
        //2
        results.add(results.get(1) - rating1); //If win, scorechange

        //3
        draw(rating1, results.get(0)); //If draw, new score
        //4
        results.add(results.get(3) - rating1); //If draw, scorechange

        //5
        loose(rating1, results.get(0)); //If loose, new score
        //6
        results.add(results.get(5) - rating1); //If loose, scorechange
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
