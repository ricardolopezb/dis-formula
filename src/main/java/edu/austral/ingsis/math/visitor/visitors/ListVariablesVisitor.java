package edu.austral.ingsis.math.visitor.visitors;

import edu.austral.ingsis.math.visitor.functions.*;

import java.util.ArrayList;

import java.util.List;

public class ListVariablesVisitor implements Visitor<List<String>>{
    @Override
    public List<String> visitAbsolute(AbsoluteValueOperation op) {
        return op.getF1().accept(this);
    }

    @Override
    public List<String> visitAssociation(AssociationOperation op) {
        return op.getF1().accept(this);

    }

    @Override
    public List<String> visitDivision(DivisionOperation op) {
        return mergeLists(op.getF1().accept(this), op.getF2().accept(this));
    }

    @Override
    public List<String> visitMultiplication(MultiplicationOperation op) {
        return mergeLists(op.getF1().accept(this), op.getF2().accept(this));
    }

    @Override
    public List<String> visitPower(PowerOperation op) {
        return mergeLists(op.getF1().accept(this), op.getF2().accept(this));
    }

    @Override
    public List<String> visitSquareRoot(SquareRootOperation op) {
        return op.getF1().accept(this);
    }

    @Override
    public List<String> visitSubstraction(SubstractionOperation op) {
        return mergeLists(op.getF1().accept(this), op.getF2().accept(this));
    }

    @Override
    public List<String> visitSum(SumOperation op) {
        return mergeLists(op.getF1().accept(this), op.getF2().accept(this));
    }

    @Override
    public List<String> visitValue(Value value) {
        return new ArrayList<>();
    }

    @Override
    public List<String> visitVariable(Variable variable) {
        List<String> list = new ArrayList<>(1);
        list.add(variable.getVariable());
        return list;
    }

    private List<String> mergeLists(List<String> list1, List<String> list2){
        for (String s : list2) {
            if (!list1.contains(s)) list1.add(s);
        }
        return list1;
    }
}
