package org.example;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.*;
public class Calculator {

    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public Calculator() {
        logger.info("Calculator Initialised");
    }

    public Double squareRoot(double x){
        Double result = 0.0;
        try
        {
            if(x < 0)
            {
                result = null;
                throw new Exception("The input for square root cannot be negative");
            }
            else
            {
                result = Math.sqrt(x);

            }
        } catch (Exception e) {
            logger.error(e);
        }


        return result;
    }

    public Double factorial(double x)
    {
        Double result = 0.0;
        try
        {
            if(x < 0)
            {
                result = null;
                throw new Exception("The input for square root cannot be negative");
            }
            else
            {
                result = 1.0;
                for(int i = 2;i <= x;i++)
                {
                    result = result*i;
                }

            }
        } catch (Exception e) {
            logger.error(e);
        }


        return result;
    }

    public Double logarithm(double x)
    {
        Double result = 0.0;
        try
        {
            if(x < 0)
            {
                result = null;
                throw new Exception("The input for Logarithm cannot be negative");
            } else if (x == 0) {
                result = null;
                throw new Exception("The input for Logarithm cannot be 0");
            } else
            {
                result = Math.log(x);

            }
        } catch (Exception e) {
            logger.error(e);
        }

        return result;
    }

    public Double power(double x, double y)
    {
        return Math.pow(x, y);
    }
}
