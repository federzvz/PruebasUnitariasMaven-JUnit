package co.com.sofka.app.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.InvalidParameterException;

public class BasicCalculator {
    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public Long sum(Long number1, Long number2){
        logger.info( "adding {} + {}", number1, number2);
        if(number1==null || number2==null){
            throw new InvalidParameterException("Number params can't be null");
        }
        return number1 + number2;
    }

    public Long subtract(Long number1, Long number2){
        logger.info( "subtracting {} - {}", number1, number2);
        if(number1==null || number2==null){
            throw new InvalidParameterException("Number params can't be null");
        }
        return number1 - number2;
    }

    public Long multiply(Long number1, Long number2){
        logger.info( "multiplying {} * {}", number1, number2);
        if(number1==null || number2==null){
            throw new InvalidParameterException("Number params can't be null");
        }
        return number1 * number2;
    }

    public Long divide(Long number1, Long number2){
        logger.info( "dividing {} / {}", number1, number2);
        if(number1==null || number2==null){
            throw new InvalidParameterException("Number params can't be null");
        }
        if(number2 == 0)
            throw new InvalidParameterException("It's impossible to divide by zero.");
        return number1 / number2;
    }
}
