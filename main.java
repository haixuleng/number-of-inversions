package numberOfInversions;

import java.io.FileNotFoundException;

public class main {
	public static void main(String[] args) throws FileNotFoundException {
		
		loadText test = new loadText("data/IntegerArray.txt");
		//loadText test = new loadText("data/test4.txt");
		System.out.println("Data input size: " + test.length);
		int[] data = test.get();
		System.out.println("First integer: " + data[0]);
		System.out.println("Last integer: " + data[test.length - 1]);
		countInversion t = new countInversion();
		sortCountType result = t.sortCount(data);
		System.out.println("Result: " + result.count);
	}
}
