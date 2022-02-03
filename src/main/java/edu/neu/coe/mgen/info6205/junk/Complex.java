package edu.neu.coe.mgen.info6205.junk;

import java.util.Objects;

public class Complex {
    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double mag() {
        return Math.sqrt(real * real + imag * imag);
    }

    public Complex conjugate() {
        return new Complex(real, -imag);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Complex)) return false;
        Complex complex = (Complex) o;
        return Double.compare(complex.real, real) == 0 && Double.compare(complex.imag, imag) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(real, imag);
    }

    private final double real;
    private final double imag;
}
