package edu.austral.ingsis.math.visitor.functions;

import edu.austral.ingsis.math.visitor.visitors.Visitor;

public class AssociationOperation implements Function{
    private final Function f1;

    public AssociationOperation(Function f1) {
        this.f1 = f1;
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visitAssociation(this);
    }

    public Function getF1() {
        return f1;
    }
}
