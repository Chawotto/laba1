package test.java.demo.parallel;

import demo.parallel.Complex;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ComplexTest {

    @Test
    public void testPlus() {
        Complex a = new Complex(1, 2);
        Complex b = new Complex(3, 4);
        a.plus(b);
        assertEquals(4.0, a.getRe(), 0.001);
        assertEquals(6.0, a.getIm(), 0.001);
    }

    @Test
    public void testTimes() {
        Complex a = new Complex(1, 2);
        Complex b = new Complex(3, 4);
        a.times(b);
        assertEquals(-5.0, a.getRe(), 0.001);
        assertEquals(10.0, a.getIm(), 0.001);
    }

    @Test
    public void testMinus() {
        Complex a = new Complex(5, 6);
        Complex b = new Complex(3, 4);
        a.minus(b);
        assertEquals(2.0, a.getRe(), 0.001);
        assertEquals(2.0, a.getIm(), 0.001);
    }

    @Test
    public void testDivide() {
        Complex a = new Complex(1, 2);
        Complex b = new Complex(3, 4);
        a.divide(b);
        assertEquals(0.44, a.getRe(), 0.01);
        assertEquals(0.08, a.getIm(), 0.01);
    }

    @Test
    public void testDivideByZero() {
        Complex a = new Complex(1, 2);
        Complex b = new Complex(0, 0);
        assertThrows(ArithmeticException.class, () -> a.divide(b));
    }

    @Test
    public void testLengthSQ() {
        Complex a = new Complex(3, 4);
        assertEquals(25.0, a.lengthSQ(), 0.001);
    }
}