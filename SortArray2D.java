
import java.util.Random;
import java.util.Scanner;

public class SortArray2D {
	// Java Homevork 03 Task 03
	// Made by Arnis Auzâns

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Sorting two dimennsional arrays!!!");
		System.out.print("Enter arrays 1st dimmension size 10 - 20: ");
		int array1stDsize = sc.nextInt();
		System.out.println();
		sc.close();

		if (array1stDsize > 20 || array1stDsize < 10) {
			System.out.println("The number you enteraed is too big or too small!!!");
		} else {

			int[][] array = new int[array1stDsize][];
			Random random = new Random();
			for (int i = 0; i < array.length; i++) {
				array[i] = new int[random.nextInt(31) + 10];
				for (int j = 0; j < array[i].length; j++) {
					int input = new Random().nextInt(900) + 100;
					array[i][j] = input;
				}
			}
			System.out.println("Array element output: ");
			arrayOutput(array);
			// array element sorting from biggest to smallest
			for (int k = 0; k < array.length; k++) {
				for (int i = 1; i < array[k].length; i++) {
					for (int j = i; j > 0; j--) {
						if (array[k][j] > array[k][j - 1]) {
							int element = array[k][j];
							array[k][j] = array[k][j - 1];
							array[k][j - 1] = element;

						}
					}
				}
			}
			System.out.println();
			System.out.println("Descending Array element output: ");
			arrayOutput(array);

			System.out.println();
			System.out.println("Average value output by array: ");
			float[] arrayAverage = new float[array1stDsize];

			for (int i = 0; i < array.length; i = i + 1) {
				float sum = 0;
				for (int j = 0; j < array[i].length; j = j + 1) {
					sum = sum + array[i][j];
				}
				float average = (float) (Math.round((sum / array[i].length) * 100.0) / 100.0);
				System.out.println(i + ". array average value: " + average);
				arrayAverage[i] = average;
			}
			// array lines sorting from by average value increasing
			for (int i = 0; i < arrayAverage.length; i = i + 1) {
				for (int j = i; j > 0; j--) {
					if (arrayAverage[j] < arrayAverage[j - 1]) {
						float tmpor = arrayAverage[j];
						arrayAverage[j] = arrayAverage[j - 1];
						arrayAverage[j - 1] = tmpor;

						int[] tmp = array[j];
						array[j] = array[j - 1];
						array[j - 1] = tmp;
					}
				}
			}
			// System.out.println();
			// System.out.print("Array from average values sorted: ");
			// System.out.println(Arrays.toString(arrayAverage));
			System.out.println();
			System.out.println("Incerasing Array line output: ");
			arrayOutput(array);
			System.out.println();
			System.out.print("Most valuest array is array: ");
			double max = 100;
			int row = 0;
			for (int i = 0; i < arrayAverage.length; i++) {

				if (max < arrayAverage[i]) {
					max = arrayAverage[i];
					row = i;

				}
			}
			for (int j = 0; j < array[row].length; j = j + 1) {
				System.out.print(" " + array[row][j]);
			}
		}
	}

	public static int[][] arrayOutput(int[][] array) {
		for (int i = 0; i < array.length; i = i + 1) {
			for (int j = 0; j < array[i].length; j = j + 1) {
				if (j == 0) {
					System.out.print("{ " + array[i][j]);
				} else {

					System.out.print(", " + array[i][j]);
				}
			}
			System.out.print(" }");
			System.out.println();

		}
		return array;
	}
}
