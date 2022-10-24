package edu.austral.ingsis.math.visitor.visitors;

import edu.austral.ingsis.math.visitor.functions.*;

public class PrintVisitor implements Visitor<String>{
    @Override
    public String visitAbsolute(AbsoluteValueOperation op) {
        return "|" + op.getF1().accept(this) + "|";
    }

    @Override
    public String visitAssociation(AssociationOperation op) {
        return "("+ op.getF1().accept(this) + ")";
    }

    @Override
    public String visitDivision(DivisionOperation op) {
        return op.getF1().accept(this) + " / " + op.getF2().accept(this);
    }

    @Override
    public String visitMultiplication(MultiplicationOperation op) {
        return op.getF1().accept(this) + " * " + op.getF2().accept(this);
    }

    @Override
    public String visitPower(PowerOperation op) {
        return op.getF1().accept(this) + " ^ " + op.getF2().accept(this);
    }

    @Override
    public String visitSquareRoot(SquareRootOperation op) {
        return "sqrt("+op.getF1().accept(this) + ")";
    }

    @Override
    public String visitSubstraction(SubstractionOperation op) {
        return op.getF1().accept(this) + " - " + op.getF2().accept(this);
    }

    @Override
    public String visitSum(SumOperation op) {
        return op.getF1().accept(this) + " + " + op.getF2().accept(this);
    }

    @Override
    public String visitValue(Value value) {
        if(value.getValue() % 1 == 0) return String.valueOf((int) value.getValue());
        return String.valueOf(value.getValue());
    }

    @Override
    public String visitVariable(Variable variable) {
        return variable.getVariable();
    }
}
