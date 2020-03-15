package numberOfInversions;

public class test {
	public test(){
		int[] input = new int[4];
		input[0] = 4;
		input[1] = 3;
		input[2] = 2;
		input[3] = 1;
		countInversion t = new countInversion();
		sortCountType result = t.sortCount(input);
		System.out.println("Result: " + result.count);
		for(int i = 0; i < input.length; i++) {
			System.out.println("Array: " + result.array[i]);
		}
	}
	
}
