package edu.austral.ingsis.math;

import java.util.List;
import java.util.Map;

public class SquareRootOperation implements Function{
    private final Function f1;

    public SquareRootOperation(Function f1) {
        this.f1 = f1;
    }


    @Override
    public double calculate() {
        return Math.sqrt(f1.calculate());
    }

    @Override
    public double calculateWithValue(Map<String, Double> values) {
        return Math.sqrt(f1.calculateWithValue(values));
    }

    @Override
    public String print() {
        return "sqrt(" + f1.print() + ")";
    }

    @Override
    public boolean isVariable() {
        return false;
    }

    @Override
    public void listVariables(List<String> variables) {
        f1.listVariables(variables);
    }
}
