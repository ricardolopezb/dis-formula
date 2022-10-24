package edu.austral.ingsis.math.composite;

import java.util.List;
import java.util.Map;

public class AssociationOperation implements Function{
    private final Function f1;

    public AssociationOperation(Function f1) {
        this.f1 = f1;
    }

    @Override
    public double calculate() {
        return f1.calculate();
    }

    @Override
    public double calculateWithValue(Map<String, Double> values) {
        return f1.calculateWithValue(values);
    }

    @Override
    public String print() {
        return "(" + f1.print() + ")";
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
