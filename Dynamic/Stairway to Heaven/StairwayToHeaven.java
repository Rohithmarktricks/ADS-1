/**
 *--------------------------------------------------------------------------------------|
 * We are given n number of staircase to reach heaven.								    |
 * Each time we can only take one or two steps.											|
 * So if there are two steps to reach heaven, then there are two ways of reaching it.	|
 * 1. 2 steps at a time.																|
 * 2. 1 step at a time for 2 times.														|
 * -------------------------------------------------------------------------------------|
 * @author : Rohith.
 */
import java.util.Scanner;
import java.math.BigInteger;
/**
 * Class for stairway to heaven.
 */
public class StairwayToHeaven {
	/**
	 * Constructs the object.
	 */
	private  StairwayToHeaven() {
		//unused
	}
	/**
	 * Number of ways.
	 *
	 * @param      steps  The steps
	 *
	 * @return     { number of ways }
	 */
	private BigInteger numOfWays(Integer steps) {
		BigInteger[] ways = new BigInteger[steps + 1];
		int init = 1;
		ways[0] = BigInteger.valueOf(init); //if there are no steps => we have already reached heaven.
		ways[1] = BigInteger.valueOf(init); // if there is only 1 step to reach heaven.
		for (int i = 2; i <= steps; i++) {
			ways[i] = ways[i - 1].add(ways[i - 2]);
		}
		return ways[steps];
	}




	/**
	 * Main method.
	 *
	 * @param      args  The arguments
	 */
	public static void main(final String[] args) {
		StairwayToHeaven way = new StairwayToHeaven();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of steps : ");
		int steps = scan.nextInt();
		//Integer steps = 2;
		System.out.println("Total number of ways for" + steps + " are : " + way.numOfWays(steps));
		// while (true) {
		// 	steps++;
		// }
	}
}