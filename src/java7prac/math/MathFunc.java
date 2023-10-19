package java7prac.math;

public class MathFunc implements MathCalculable {
    @Override
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    @Override
    public double complexAbsolute(double real, double imaginary) {
        return Math.sqrt(real * real + imaginary * imaginary);
    }
}