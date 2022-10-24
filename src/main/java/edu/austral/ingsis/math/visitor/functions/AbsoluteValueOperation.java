package edu.austral.ingsis.math.visitor.functions;

import edu.austral.ingsis.math.visitor.visitors.Visitor;

public class AbsoluteValueOperation implements Function{
    private final Function f1;

    public AbsoluteValueOperation(Function f1) {
        this.f1 = f1;
    }

    public Function getF1() {
        return f1;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visitAbsolute(this);
    }
}
