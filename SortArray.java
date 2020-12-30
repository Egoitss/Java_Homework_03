import java.util.Scanner;

public class SortArray {
	//Java Homework 03 Task 01
	//Made By Arnis Auzâns 

	public static void main(String[] args) {
		// ievadît masîvu no 20 - 40
		Scanner sc = new Scanner(System.in);
		System.out.print("Ievadiet masîva garumu, no 20-40: ");
		int arrayLenght = sc.nextInt();
		sc.close();

		int[] array = new int[arrayLenght];
		// programma izveido int masîvu ar ar izmçru ko saòçma no lietotâja
		for (int i = 0; i < array.length; i++) {
			// masîvs tiek aizpildîts ar gadîjuma skaitïiem robeþâs no 10-99
			array[i] = (int) (Math.random() * 89 + 10);
			// uz ekrâna tiek izvadîti visi skaitïi, atdalîti ar komatu un atstarpi
			if (i == 0) {
				System.out.print("{ " + array[i]);

			} else {
				System.out.print(", " + array[i]);
			}
		}
		System.out.print(" }");
		System.out.println();
		// tiek veikta masîvâ esoðo elementu kârtoðana augoðâ secîbâ (neveidot jaunu
		// masîvu)
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