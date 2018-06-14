/**
 * Fibonacci Sequence
 * <pre>
 * <b>History:</b>
 *    2018.06.11, 0.1, KIM TAE HO
 * </pre>
 *
 * @author 　KIM TAE HO
 * @version 0.1, 2018.06.11 
 * @see    None
 */
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;
 
public class Fibonacci {

    private static Map<Integer, BigInteger> cacheOfSum = new HashMap<>();
	public static void main(String[] args) 
	{

		int needNumber = 8181; 
		
		cacheOfSum.put(1, BigInteger.valueOf(needNumber));
		
        System.out.println(getFibonacci(needNumber));

	}

    /**
     * (Fibonacci Logic)
     * @param sequenceNumber Atom of fibonacci more then 0    
     * @return  Sum Number with preview Number
     */

	Private static BigInteger getFibonacci(int sequenceNumber) 
	{

	    if (cacheOfSum.containsKey(sequenceNumber))
	    {
	        return cacheOfSum.get(sequenceNumber);
	    }

        return recursiveCachedSum(sequenceNumber);
	}
	
    /**
     * Cached Value Of specipied serquence Number that fibonacci
     * @param sequenceNumber of using memoization
     * @return  Sum Number with preview Number
     */
	private static BigInteger recursiveCachedSum(int sequenceNumber) 
	{
	    BigInteger calcSum = getFibonacci(sequenceNumber - 2).add(getFibonacci(sequenceNumber - 1));
	    cacheOfSum.put(sequenceNumber, calcSum);
	    
	    return calcSum;
	}
}
