package edu.austral.ingsis.math.composite;

import java.util.List;
import java.util.Map;

public class SubstractionOperation implements Function {
    private final Function f1;
    private final Function f2;

    public SubstractionOperation(Function f1, Function f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public double calculate() {
        return f1.calculate() - f2.calculate();
    }

    @Override
    public double calculateWithValue(Map<String, Double> values) {
        return f1.calculateWithValue(values) - f2.calculateWithValue(values);

    }

    @Override
    public String print() {
        return f1.print() + " - " + f2.print();
    }

    @Override
    public boolean isVariable() {
        return false;
    }

    @Override
    public void listVariables(List<String> variables) {
        f1.listVariables(variables);
        f2.listVariables(variables);
    }
}
