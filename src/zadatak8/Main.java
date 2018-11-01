package zadatak8;

import java.text.SimpleDateFormat;

public class Main {

	
	public static void ubaciProizvode(Firma f) throws IllegalArgumentException {

		Mlecni jogurt = new Mlecni("kozji", "jogurt", 180.59, new SimpleDateFormat("01-11-2018"));
		Mlecni sir = new Mlecni("ovciji", "sir", 480.99, new SimpleDateFormat("15-06-2019"));
		Kafa nes = new Kafa(true, "Nescafe", 780.89, new SimpleDateFormat("20-06-2019"));
		Kafa minas = new Kafa(false, "Minas", 360.19, new SimpleDateFormat("02-12-2018"));
		Sok next = new Sok("visnje", "Next visnja", 149.99, new SimpleDateFormat("15-09-2019"));
		Sok takovo = new Sok("grejpfruta", "Takovo grejpfrut", 126.49, new SimpleDateFormat("12-11-2019"));
		Meso but = new Meso("svinjski", "but", 380.69, new SimpleDateFormat("28-10-2017"));
		Meso prsut = new Meso("govedji", "prsut", 2500.0, new SimpleDateFormat("25-04-2019"));
		f.dodajProizvod(jogurt, sir, nes, minas, next, takovo, but, prsut);
	}

	
	public static void main(String[] args) {
		
		try {
			Firma firma1 = new Firma(12345.67);
			Firma firma2 = new Firma(101.55);
			ubaciProizvode(firma1);
			System.out.println("Proizvodi u listi firme1 pre porudzbine: ");
			firma1.stampajListu();
			System.out.println("Kapital firme1 pre porudzbine: " + firma1.getKapital());
			firma1.porudzbina();
			System.out.println();
			System.out.println("Proizvodi u listi firme1 posle porudzbine: ");
			firma1.stampajListu();
			System.out.println("Kapital firme1 posle porudzbine: " + firma1.getKapital());
			System.out.println();
			System.out.println("          * * * * * * *          ");
			System.out.println();
			ubaciProizvode(firma2);
			System.out.println("Proizvodi u listi firme2 pre porudzbine: ");
			firma2.stampajListu();
			System.out.println("Kapital firme2 pre porudzbine: " + firma2.getKapital());
			firma2.porudzbina();
			System.out.println();
			System.out.println("Proizvodi u listi firme2 posle porudzbine: ");
			firma2.stampajListu();
			System.out.println("Kapital firme2 posle porudzbine: " + firma2.getKapital());
		} catch (IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
