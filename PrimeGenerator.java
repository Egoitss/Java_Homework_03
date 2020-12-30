import java.util.Scanner;

public class PrimeGenerator {
	// Java Homevork 03 Tsk 02
	// Made by Arnis Auzâns

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pirmskaitïu ìenerâtors!!!");
		System.out.print("Ievadiet cik pirmskaitïus apjomâ lîdz 100 Jûs vçlaties ìenerçt: ");
		int count = sc.nextInt();
		sc.close();
		System.out.println();
		String primeNumbers = "";

		if (count > 100 || count < 1) {
			primeNumbers = "Jûs ievadîjât pârâk mazu vai pârâk lielu skaitli!!!";
		} else {
			int numbersFound = 0;
			for (int i = 0; numbersFound != count; i++) {

				int counter = 0;
				for (int num = i; num >= 1; num--) {
					if (i % num == 0) {
						counter++;
					}
				}

				if (counter == 2 || i == 1) {
					primeNumbers = primeNumbers + i + " ";
					numbersFound++;
				}
			}
		}
		System.out.print(primeNumbers);
	}
}