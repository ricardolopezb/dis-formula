package edu.austral.ingsis.math.visitor.visitors;


import edu.austral.ingsis.math.visitor.functions.*;

public interface Visitor<T> {

    T visitAbsolute(AbsoluteValueOperation op);
    T visitAssociation(AssociationOperation op);
    T visitDivision(DivisionOperation op);
    T visitMultiplication(MultiplicationOperation op);
    T visitPower(PowerOperation op);
    T visitSquareRoot(SquareRootOperation op);
    T visitSubstraction(SubstractionOperation op);
    T visitSum(SumOperation op);
    T visitValue(Value value);
    T visitVariable(Variable variable);




}
