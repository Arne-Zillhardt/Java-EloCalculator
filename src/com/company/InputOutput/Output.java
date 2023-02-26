package com.company.InputOutput;

import java.util.ArrayList;

public class Output {
    public void prompt(Input in) {
        System.out.print("Please enter your rating: ");
        in.getInput();

        System.out.print("Please enter your opponents rating: ");
        in.getInput();
    }

    public void result(ArrayList<Double> res) {
        System.out.println("You win by a " + res.get(0) + "% chance");

        System.out.println("If you win, you gain "  + res.get(2) + " points and your rating would be "  + res.get(1));

        if (res.get(4) > 0) {
            System.out.println("If you draw, you gain "  + res.get(4) + " points and your rating would be "  + res.get(3));
        } else if (res.get(4) == 0) {
            System.out.println("If you draw, your rating stays the same and would be " + res.get(3));
        } else {
            System.out.println("If you draw, you loose "  + res.get(4) + " points and your rating would be " + res.get(3));
        }

        if (res.get(6) == 0) {
            System.out.println("If you loose, your rating stays the same and would be "  + res.get(5));
        } else {
            System.out.println("If you loose, you loose "  + res.get(6) + "points and your rating would be "  + res.get(5));
        }
    }
}