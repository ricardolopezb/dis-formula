package edu.austral.ingsis.math.composite;

import java.util.List;
import java.util.Map;

public class Value implements Function{
    private final double value;

    public Value(double value) {
        this.value = value;
    }

    @Override
    public double calculate() {
        return this.value;
    }

    @Override
    public double calculateWithValue(Map<String, Double> values) {
        return this.value;
    }

    @Override
    public String print() {
        return String.valueOf((int)this.value);
    }

    @Override
    public boolean isVariable() {
        return false;
    }

    @Override
    public void listVariables(List<String> variables) {

    }
}
