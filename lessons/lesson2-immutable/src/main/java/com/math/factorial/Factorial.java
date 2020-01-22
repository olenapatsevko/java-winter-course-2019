package com.math.factorial;

import java.math.BigInteger;

public class Factorial {

    public BigInteger factorialNumber(BigInteger a) {
        if (a.signum() == 0 || a.signum() == -1) {
            return BigInteger.ONE;
        } else {
            return a.multiply(factorialNumber(a.add(BigInteger.ONE.negate())));
        }

    }
}
