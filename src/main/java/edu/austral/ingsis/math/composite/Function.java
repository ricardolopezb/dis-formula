package edu.austral.ingsis.math.composite;

import java.util.List;
import java.util.Map;

public interface Function {
    double calculate();

    double calculateWithValue(Map<String, Double> values);
    String print();
    boolean isVariable();
    void listVariables(List<String> variables);
}
