package edu.austral.ingsis.math;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class ListVariablesTest {

    /**
     * Case 1 + 6
     */
    @Test
    public void shouldListVariablesFunction1() {
        final List<String> result = new ArrayList<>();
        final Function f = new SumOperation(new Value(1),new Value(6));
        f.listVariables(result);

        assertThat(result, empty());
    }

    /**
     * Case 12 / div
     */
    @Test
    public void shouldListVariablesFunction2() {
        final List<String> result = new ArrayList<>();
        final Function f = new DivisionOperation(new Value(12), new Variable("div"));
        f.listVariables(result);
        assertThat(result, containsInAnyOrder("div"));
    }

    @Test
    public void shouldListVariablesFunction15() {
        final List<String> result = new ArrayList<>();
        final Function f = new DivisionOperation(new SumOperation(new Variable("div"), new Variable("xd")), new Variable("div"));
        f.listVariables(result);
        for (String s : result) {
            System.out.println("an item: " + s);
        }
        assertThat(result, containsInAnyOrder("div", "xd"));
    }

    /**
     * Case (9 / x) * y
     */
    @Test
    public void shouldListVariablesFunction3() {
        final List<String> result = new ArrayList<>();
        final Function f = new MultiplicationOperation(new DivisionOperation(new Value(9), new Variable("x")),new Variable("y"));
        f.listVariables(result);

        assertThat(result, containsInAnyOrder("x", "y"));
    }

    /**
     * Case (27 / a) ^ b
     */
    @Test
    public void shouldListVariablesFunction4() {
        final List<String> result = new ArrayList<>();
        final Function f = new PowerOperation(new DivisionOperation(new Value(27), new Variable("a")), new Variable("b"));
        f.listVariables(result);
        assertThat(result, containsInAnyOrder("a", "b"));
    }

    /**
     * Case z ^ (1/2)
     */
    @Test
    public void shouldListVariablesFunction5() {
        final List<String> result = new ArrayList<>();
        final Function f = new PowerOperation(new Variable("z"), new DivisionOperation(new Value(1), new Value(2)));
        f.listVariables(result);

        assertThat(result, containsInAnyOrder("z"));
    }

    /**
     * Case |value| - 8
     */
    @Test
    public void shouldListVariablesFunction6() {
        final List<String> result = new ArrayList<>();
        final Function f = new SubstractionOperation(new ModuloOperation(new Variable("value")), new Value(8));
        f.listVariables(result);
        assertThat(result, containsInAnyOrder("value"));
    }

    /**
     * Case |value| - 8
     */
    @Test
    public void shouldListVariablesFunction7() {
        final List<String> result = new ArrayList<>();
        final Function f = new SubstractionOperation(new ModuloOperation(new Variable("value")), new Value(8));
        f.listVariables(result);

        assertThat(result, containsInAnyOrder("value"));
    }

    /**
     * Case (5 - i) * 8
     */
    @Test
    public void shouldListVariablesFunction8() {
        final List<String> result = new ArrayList<>();
        final Function f = new MultiplicationOperation(new SubstractionOperation(new Value(5), new Variable("i")), new Value(8));
        f.listVariables(result);
        assertThat(result, containsInAnyOrder("i"));
    }
}
