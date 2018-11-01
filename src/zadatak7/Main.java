package zadatak7;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	static Scanner sc = new Scanner(System.in);

	private static String unesiTekst(String naziv) {
		while (true) {
			System.out.printf("Unesi %s: %n", naziv);			
			String unos = sc.nextLine();
			if (unos.matches("^[\\-' \\s]?[A-Z][a-zA-Z -']+")) {
				return unos;
			} else {
				System.out.printf(
						"%s se mora sastojati samo od slova i mora poceti velikim slovom. Pokusajte ponovo.%n", naziv);
			}
		}
	}

	private static int unesiBroj() {
		while (true) {
			System.out.print("Unesite broj poena (0-100): ");
			String unos = sc.nextLine();
			try {
				int poeni = Integer.parseInt(unos);
				if (poeni >= 0 && poeni <= 100) {
					return poeni;
				} else {
					System.out.println("Morate uneti broj od 0 do 100. Pokusajte ponovo.");
				}

			} catch (Exception ex) {
				System.out.println("Morate uneti broj od 0 do 100. Pokusajte ponovo.");
			}
		}
	}

	private static Student unosStudenta() {

		Student student = new Student();

		student.setIme(unesiTekst("Ime"));
		student.setPrezime(unesiTekst("Prezime"));

		int poeni = unesiBroj();
		student.setBrojPoena(poeni);

		if (poeni > 90) {
			student.setOcena(10);
		} else if (poeni > 80) {
			student.setOcena(9);
		} else if (poeni > 70) {
			student.setOcena(8);
		} else if (poeni > 60) {
			student.setOcena(7);
		} else if (poeni > 50) {
			student.setOcena(6);
		} else {
			student.setOcena(5);
		}

		return student;
	}

	private static Set<Student> dodajStudentaUSet() {

		Student student;
		Set<Student> setStudenata = new TreeSet<>(
				(Student s1, Student s2) -> Integer.compare(s2.getBrojPoena(), s1.getBrojPoena()));

		String unos;
		do {
			student = unosStudenta();
			setStudenata.add(student);
			System.out.print("Ukucajte bilo sta za unos novog studenta, a 0 za kraj unosa: ");
			unos = sc.nextLine();
		} while (!unos.equals("0"));

		return setStudenata;
	}

	private static void upisiStudenteUFajl(Set<Student> studenti) {

		try {
			File file = new File("src/zadatak7/ocene.txt");
			Datoteka datoteka = new Datoteka(file);
			datoteka.writeToFile(studenti);
		} catch (IOException ex) {
			System.out.print("Doslo je do greske u datoteci!");
		}
	}

	public static void main(String[] args) {
		System.out.println("---UNOS STUDENATA---");
		upisiStudenteUFajl(dodajStudentaUSet());
		System.out.print("Prijatan dan Vam zelimo!");
		sc.close();
	}

}