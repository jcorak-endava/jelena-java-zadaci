package zadatak8;

import java.text.SimpleDateFormat;

public abstract class Proizvod {
	protected String ime;
	protected double cena;
	protected SimpleDateFormat rokTrajanja;


	public Proizvod(String ime, double cena, SimpleDateFormat rokTrajanja) {
		if (cena <= 0 ) {
			throw new IllegalArgumentException("Cena proizvoda mora biti pozitivna.");
		} else {
			this.cena = cena;
		}
		this.ime = ime;		
		this.rokTrajanja = rokTrajanja;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		if (cena <= 0 ) {
			throw new IllegalArgumentException("Cena proizvoda mora biti pozitivna.");
		} else {
			this.cena = cena;
		}
	}

	public SimpleDateFormat getRokTrajanja() {
		return rokTrajanja;
	}

	public void setRokTrajanja(SimpleDateFormat rokTrajanja) {
		this.rokTrajanja = rokTrajanja;
	}

	public abstract double getCenaPlusPDV();

	@Override
	public String toString() {
		return ime + ", rok trajanja: " + rokTrajanja.toPattern() + ", cena: " + cena;
	}

}
