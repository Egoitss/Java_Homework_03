import java.util.Scanner;

public class PrimeGenerator {
	// Java Homevork 03 Tsk 02
	// Made by Arnis Auz�ns

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pirmskait�u �ener�tors!!!");
		System.out.print("Ievadiet cik pirmskait�us apjom� l�dz 100 J�s v�laties �ener�t: ");
		int count = sc.nextInt();
		sc.close();
		System.out.println();
		String primeNumbers = "";

		if (count > 100 || count < 1) {
			primeNumbers = "J�s ievad�j�t p�r�k mazu vai p�r�k lielu skaitli!!!";
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