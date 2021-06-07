package org.westpac.random.pins;
import java.util.Set;

/**
 * Generates a batch of random unique numbers
 *
 * @version 0.1.0
 */
public interface RandomPinGeneration {

    /**
     * Returns a set of 1000 4-digit unique random numbers between 1000 to 9999 (1000 and 9999 inclusive).
     *
     * @return a set of 1000 unique 4-digit numbers of datatype Integer
     */
    Set<Integer> generateBatchOfUniqueRandomPins();

    /**
     * Returns a set of unique random numbers based on the values supplied in the parameters.
     *
     * <p>
     * For Example, if minVal is 100 and maxVal is 200 and noOfPins is 50,
     * this method will return 50 3-digit unique pins between 100 and 200 (100 and 200 are inclusive).
     *
     * @param minVal   the minimum range of the number to generate. Must be non-negative and less than maxVal param
     * @param maxVal   the maximum range of the number to generate. Must be non-negative and greater than minVal Param
     * @param noOfPins the total number of pins in the set. Must be greater than 0 and less than or equals to the difference of maxVal and minVal
     * @return Returns a set of unique random numbers of type Integer based on the values supplied in the parameters
     * @throws IllegalArgumentException when any of the parameter conditions are violated
     */
    Set<Integer> generateBatchOfUniqueRandomPins(final int minVal, final int maxVal, final int noOfPins) throws IllegalArgumentException;

}
