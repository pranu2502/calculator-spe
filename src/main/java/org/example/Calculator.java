package org.example;

public class Calculator {

    public Calculator() {
    }

    public double squareRoot(double x){
        return Math.sqrt(x);
    }

    public double factorial(double x)
    {
        if(x == 0)
            return 1;
        return x*factorial(x-1);
    }

    public double logarithm(double x)
    {
        return Math.log(x);
    }

    public double power(double x, double y)
    {
        return Math.pow(x, y);
    }
}
