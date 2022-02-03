package edu.neu.coe.mgen.info6205.junk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ComplexTest {

    @Test
    public void constructor() {
        Complex complex = new Complex(1, 0);
        assertNotNull(complex);
    }

    @Test
    public void mag() {
        assertEquals(1.0, new Complex(1, 0).mag(), 1E-7);
    }
}