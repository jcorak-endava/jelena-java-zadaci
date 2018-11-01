package zadatak8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Firma {
	private List<Proizvod> listaProizvoda = new ArrayList<>();
	private double kapital;

	public Firma(double kapital) {
		if (kapital <= 0 )
			throw new IllegalArgumentException("Firma mora biti solventna, ne moze imati negativan kapital.");
		this.kapital = kapital;
	}

	public void dodajProizvod(Proizvod... p) {
		listaProizvoda.addAll(Arrays.asList(p));
	}

	public void stampajListu() {
		System.out.println("------------------------PROIZVODI------------------------");

		for (Proizvod p : listaProizvoda) {
			System.out.println(p);
		}

		System.out.println("---------------------------------------------------------");
	}

	public void porudzbina() {

		double ukupnaCenaProizvoda = 0;

		for (Proizvod p : listaProizvoda) {
			ukupnaCenaProizvoda += p.getCenaPlusPDV();
		}

		System.out.println("Iznos porudzbine: " + ukupnaCenaProizvoda);

		if (ukupnaCenaProizvoda <= this.kapital) {
			System.out.println("Porudzbina je uspesna!");
			listaProizvoda.clear();
			this.kapital -= ukupnaCenaProizvoda;			
		} else {
			System.out.println("Nemate dovoljno sredstava na racunu za ovu porudzbinu.");			
		}
	}

	public List<Proizvod> getListaProizvoda() {
		return listaProizvoda;
	}

	public void setListaProizvoda(List<Proizvod> listaProizvoda) {
		this.listaProizvoda = listaProizvoda;
	}

	public double getKapital() {
		return kapital;
	}

	public void setKapital(double kapital) {
		this.kapital = kapital;
	}
}
