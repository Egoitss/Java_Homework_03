import java.util.Scanner;

public class SortArray {
	//Java Homework 03 Task 01
	//Made By Arnis Auz�ns 

	public static void main(String[] args) {
		// ievad�t mas�vu no 20 - 40
		Scanner sc = new Scanner(System.in);
		System.out.print("Ievadiet mas�va garumu, no 20-40: ");
		int arrayLenght = sc.nextInt();
		sc.close();

		int[] array = new int[arrayLenght];
		// programma izveido int mas�vu ar ar izm�ru ko sa��ma no lietot�ja
		for (int i = 0; i < array.length; i++) {
			// mas�vs tiek aizpild�ts ar gad�juma skait�iem robe��s no 10-99
			array[i] = (int) (Math.random() * 89 + 10);
			// uz ekr�na tiek izvad�ti visi skait�i, atdal�ti ar komatu un atstarpi
			if (i == 0) {
				System.out.print("{ " + array[i]);

			} else {
				System.out.print(", " + array[i]);
			}
		}
		System.out.print(" }");
		System.out.println();
		// tiek veikta mas�v� eso�o elementu k�rto�ana augo�� sec�b� (neveidot jaunu
		// mas�vu)
		for (int i = 1; i < array.length; i++) {
			for (int j = i; j > 0; j--) {
				if (array[j] < array[j - 1]) {
					int element = array[j];
					array[j] = array[j - 1];
					array[j - 1] = element;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				System.out.print("{ " + array[i]);

			} else {
				System.out.print(", " + array[i]);
			}
		}
		System.out.print(" }");
	}
}