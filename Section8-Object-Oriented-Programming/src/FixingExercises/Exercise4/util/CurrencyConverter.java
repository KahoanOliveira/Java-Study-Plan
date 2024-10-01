package FixingExercises.Exercise4.util;

public class CurrencyConverter {
    public static final double IOF = 0.06;

    public static double currencyCalculator(double dollarPrice, double dollarBought){
        return dollarBought * dollarPrice * (1.0 + IOF);
    }
}
