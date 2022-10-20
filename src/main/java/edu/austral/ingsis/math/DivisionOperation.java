package edu.austral.ingsis.math;

import java.util.Map;

public class DivisionOperation implements Function{
    private final Function f1;
    private final Function f2;

    public DivisionOperation(Function f1, Function f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public double calculate() {
        return f1.calculate()/ f2.calculate();
    }

    @Override
    public double calculateWithValue(Map<String, Double> values) {
        return f1.calculateWithValue(values)/ f2.calculateWithValue(values);

    }

    @Override
    public String print() {
        return f1.print() + " / " + f2.print();
    }

    @Override
    public boolean isVariable() {
        return false;
    }


}