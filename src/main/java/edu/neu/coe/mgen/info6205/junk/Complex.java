package edu.neu.coe.mgen.info6205.junk;

public class Complex {
    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double mag() {
        return Math.sqrt(real * real + imag * imag);
    }

    private final double real;
    private final double imag;
}
