package com.company;

import com.company.Calculation.Calculator;
import com.company.InputOutput.Input;
import com.company.InputOutput.Output;

import java.util.ArrayList;

public class Program {
    Input input = new Input();
    Output output = new Output();
    Calculator calculator = new Calculator();

    public void start() {
        output.prompt(input);

        calculator.getResults(input.getInputs().get(0), input.getInputs().get(1));
        ArrayList<Double> res = calculator.getResults();

        output.result(res);
    }
}