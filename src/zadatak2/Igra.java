package zadatak2;

import java.util.Random;
import java.util.Scanner;

public class Igra {

	static Scanner sc = new Scanner(System.in);
	
	private static int provera(int broj, int pokusaj) {

		if (pokusaj == broj) {
			System.out.println("Cestitamo! Pogodili ste zamisljeni broj " + broj + "!!!");
			return 0;
		} else if (Math.abs(broj - pokusaj) <= 5) {
			System.out.println("Blizu ste, razlika izmedju Vaseg i zamisljenog broja je 5 ili manje."
					+ " Zamisljeni broj je: " + broj + "!");
			return 1;
		} else {
			System.out.println("Promasaj. Pokusajte ponovo!");
			return 2;
		}
	}

	private static void igraj() {
		Random randomGenerator = new Random();
		int broj = randomGenerator.nextInt(50) + 1;
		int rezultat = 2;

		while (rezultat == 2) {

			System.out.println("Pogodite zamisljeni broj od 1 do 50: ");
			String unos = sc.next();

			try {

				int pokusaj = Integer.parseInt(unos);
				if (pokusaj >= 1 && pokusaj <= 50) {
					rezultat = provera(broj, pokusaj);					
				} else {
					System.out.println("Morate uneti broj od 1 do 50. Pokusajte ponovo.");					
				}

			} catch (Exception ex) {
				System.out.println("Morate uneti broj od 1 do 50. Pokusajte ponovo.");
			}

		}
	}

	public static void main(String[] args) {

		String odgovor;	

		do {

			igraj();

			System.out.println("Da li zelite novu igru? (unesite d/D za DA, bilo sta za izlaz iz igre) : ");
			odgovor = sc.next();

		} while (odgovor.equalsIgnoreCase("D"));
		
		System.out.println("Zelimo vam prijatan dan!");
		sc.close();
	}
}
