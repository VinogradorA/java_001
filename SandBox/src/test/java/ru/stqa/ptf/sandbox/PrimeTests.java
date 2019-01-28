package ru.stqa.ptf.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrimeTests {

    @Test
    public void testPrime () {
        Assert.assertTrue(Primes.isPrimeFast(Integer.MAX_VALUE ));
    }
    @Test (enabled = false)
    public void testLongPrime () {
        long n = Integer.MIN_VALUE;
        Assert.assertTrue(Primes.isPrime(n));
    }
    @Test
    public void testNonPrime () {
        Assert.assertFalse(Primes.isPrime(Integer.MAX_VALUE-2));
    }
}
