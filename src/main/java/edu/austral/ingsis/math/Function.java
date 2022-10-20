package edu.austral.ingsis.math;

import java.util.Map;

public interface Function {
    double calculate();

    double calculateWithValue(Map<String, Double> values);
    String print();
    boolean isVariable();
}
