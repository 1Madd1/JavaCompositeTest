import org.example.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CompositeTest {

    @Test
    public void testConstant() {
        double testValue = 3.0;
        Expression e = new Constant(testValue);
        assertEquals(testValue, e.getValue(), 0.0);
    }

    @Test
    public void testAdder() {
        double testValueA = 2.0;
        double testValueB = 4.0;
        Expression left = new Constant(testValueA);
        Expression right = new Constant(testValueB);
        Expression e = new Adder(left, right);
        assertEquals((testValueA+testValueB), e.getValue(), 0.0);
    }

    @Test
    public void testSubtracter() {
        double testValueA = 2.0;
        double testValueB = 4.0;
        Expression left = new Constant(testValueA);
        Expression right = new Constant(testValueB);
        Expression e = new Subtracter(left, right);
        assertEquals((testValueA-testValueB), e.getValue(), 0.0);
    }

    @Test
    public void testDivider() {
        double testValueA = 2.0;
        double testValueB = 4.0;
        Expression left = new Constant(testValueA);
        Expression right = new Constant(testValueB);
        Expression e = new Divider(left, right);
        assertEquals((testValueA/testValueB), e.getValue(), 0.0);
    }

    @Test
    public void testMultiplier() {
        double testValueA = 2.0;
        double testValueB = 4.0;
        Expression left = new Constant(testValueA);
        Expression right = new Constant(testValueB);
        Expression e = new Multiplier(left, right);
        assertEquals((testValueA*testValueB), e.getValue(), 0.0);
    }

}
