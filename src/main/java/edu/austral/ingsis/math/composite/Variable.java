package edu.austral.ingsis.math.composite;

import java.util.List;
import java.util.Map;

public class Variable implements Function {
    private final String word;

    public Variable(String word) {
        this.word = word;
    }

    @Override
    public double calculate() {
        return 0;
    }

    @Override
    public double calculateWithValue(Map<String, Double> values) {
        return values.get(this.word);
    }

    @Override
    public String print() {
        return this.word;
    }

    @Override
    public boolean isVariable() {
        return true;
    }

    @Override
    public void listVariables(List<String> variables) {
        if(!variables.contains(this.word)) variables.add(this.word);
    }
}
