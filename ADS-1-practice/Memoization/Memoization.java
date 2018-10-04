import java.util.*;
import java.math.BigInteger;
/**
 * Memoization nth fibonacci number.
 */
public final class Memoization{
	/**
	 * Constructs the object.
	 */
	Memoization(){
		//unused constructor.
	}

	/**
	 * Converts the Integer into BigInteger.
	 *
	 * @param      i     integer.
	 *
	 * @return     BigInteger.
	 */
	public static BigInteger valueOf(int i){
		return BigInteger.valueOf(i);
	}

	/**
	 * Checks if the number is present in the Hashmap.
	 *
	 * @param      j     { key }
	 * @param      h     { Hashmap }
	 *
	 * @return     { value of key }
	 */
	public static BigInteger checkHash(int j, HashMap<Integer, BigInteger> h){
		if(!(h.containsKey(j))){
			BigInteger ans = checkHash(j-1, h).add(checkHash(j-2, h));
			h.put(j, ans);
		} 
		return (BigInteger)(h.get(j));
	}

	/**
	 * Main Method.
	 *
	 * @param      args  The arguments
	 */
	public static void main(String[] args) { 
		HashMap<Integer, BigInteger> hello = new HashMap<>();
		hello.put(0,valueOf(0));
		hello.put(1,valueOf(1));
		hello.put(2,valueOf(1));
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value : ");
		int num = sc.nextInt();
		long startTime = System.nanoTime();
		System.out.println(checkHash(num, hello));
		double seconds = (double)(System.nanoTime() - startTime)/1000000000.0;
		System.out.println("Time : "+seconds);
	} 
}