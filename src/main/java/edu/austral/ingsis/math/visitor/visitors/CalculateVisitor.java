package edu.austral.ingsis.math.visitor.visitors;

import edu.austral.ingsis.math.visitor.functions.*;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

public class CalculateVisitor implements Visitor<Double>{
    private final Map<String, Double> variableValues;

    public CalculateVisitor() {
        this.variableValues = Collections.emptyMap();
    }

    public CalculateVisitor(Map<String, Double> variableValues) {
        this.variableValues = variableValues;
    }

    @Override
    public Double visitAbsolute(AbsoluteValueOperation op) {
        return Math.abs(op.getF1().accept(this));
    }

    @Override
    public Double visitAssociation(AssociationOperation op) {
        return op.getF1().accept(this);
    }

    @Override
    public Double visitDivision(DivisionOperation op) {
        return op.getF1().accept(this) / op.getF2().accept(this);
    }

    @Override
    public Double visitMultiplication(MultiplicationOperation op) {
        return op.getF1().accept(this) * op.getF2().accept(this);
    }

    @Override
    public Double visitPower(PowerOperation op) {
        return Math.pow(op.getF1().accept(this), op.getF2().accept(this));
    }

    @Override
    public Double visitSquareRoot(SquareRootOperation op) {
        return Math.sqrt(op.getF1().accept(this) );
    }

    @Override
    public Double visitSubstraction(SubstractionOperation op) {
        return op.getF1().accept(this) - op.getF2().accept(this);
    }

    @Override
    public Double visitSum(SumOperation op) {
        return op.getF1().accept(this) + op.getF2().accept(this);
    }

    @Override
    public Double visitValue(Value value) {
        return value.getValue();
    }

    @Override
    public Double visitVariable(Variable variable) {
        Double varValue = variableValues.get(variable.getVariable());
        return varValue != null ? varValue : 0.0;
    }
}
