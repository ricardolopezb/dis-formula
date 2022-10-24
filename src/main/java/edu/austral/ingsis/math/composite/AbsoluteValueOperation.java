package edu.austral.ingsis.math.composite;

import java.util.List;
import java.util.Map;

public class AbsoluteValueOperation implements Function{
    private final Function f1;

    public AbsoluteValueOperation(Function f1) {
        this.f1 = f1;
    }

    @Override
    public double calculate() {
        return Math.abs(f1.calculate());
    }

    @Override
    public double calculateWithValue(Map<String, Double> values) {
        return Math.abs(f1.calculateWithValue(values));
    }

    @Override
    public String print() {
        return "|"+f1.print()+"|";
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
