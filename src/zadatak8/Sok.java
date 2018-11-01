package zadatak8;

import java.text.SimpleDateFormat;

public class Sok extends Proizvod {
	private String odCega;

	
	public Sok(String odCega, String ime, double cena, SimpleDateFormat rokTrajanja) {
		super(ime, cena, rokTrajanja);
		this.odCega = odCega;
	}

	@Override
	public double getCenaPlusPDV() {
		return cena * 1.2;
	}

	public String getOdCega() {
		return odCega;
	}

	public void setOdCega(String odCega) {
		this.odCega = odCega;
	}

	@Override
	public String toString() {
		return super.toString() + ", cena sa PDV-om: " + this.getCenaPlusPDV() + ", sok je od: " + odCega;
	}
}
