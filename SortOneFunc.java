package numberchangeOneIteration;

import java.util.ArrayList;

public class SortOneFunc {
	static ArrayList<Integer> startList;
	static int[] startNumbers;
	static Integer average;

	public static void main(String[] args) {
		int[] startNumbers = { 10, 21, 36, 1, 40, 0, 59, 13, 60, 0, 77, 10 };
		ArrayList<Integer> startList = new ArrayList<Integer>();
		for (int i : startNumbers) {
			startList.add(i);
		}
		System.out.println("The start result is " + startList);

		// finding minimum, and then using a var for getting sum of numbers in array
		Integer a = new Integer(0);
		Integer min = startNumbers[0];
		for (int num : startNumbers) {
			if (min >= num)
				min = num;
			a = a + num;
		}
		Integer average = new Integer(a / startList.size());
		// replacing the last minimum value of the row with average
		startList.set((startList.lastIndexOf(min)), average);
		System.out.println("Result list is " + startList);

		System.out.println("The minimum of the row is " + min);
		System.out.println("The average of the row is " + average);
	}

}
