package edu.austral.ingsis.math.visitor.functions;

import edu.austral.ingsis.math.visitor.visitors.Visitor;

public class DivisionOperation implements Function{
    private final Function f1;
    private final Function f2;

    public DivisionOperation(Function f1, Function f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visitDivision(this);
    }

    public Function getF1() {
        return f1;
    }

    public Function getF2() {
        return f2;
    }
}
