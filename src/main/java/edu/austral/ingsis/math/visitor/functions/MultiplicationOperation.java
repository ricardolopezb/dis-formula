package edu.austral.ingsis.math.visitor.functions;

import edu.austral.ingsis.math.visitor.visitors.Visitor;

public class MultiplicationOperation implements Function{
    private final Function f1;
    private final Function f2;


    public MultiplicationOperation(Function f1, Function f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    public Function getF1() {
        return f1;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visitMultiplication(this);
    }

    public Function getF2() {
        return f2;
    }
}
