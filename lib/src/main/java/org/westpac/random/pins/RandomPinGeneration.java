package org.westpac.random.pins;
import java.util.Set;


public interface RandomPinGeneration {

    Set<Integer> generateBatchOfUniqueRandomPins();

    Set<Integer> generateBatchOfUniqueRandomPins(final int minVal, final int maxVal, final int noOfPins) throws IllegalArgumentException;
}
