package zadatak8;

import java.text.SimpleDateFormat;

public class Meso extends Proizvod {
	private String kojaZivotinja;

	
	public Meso(String kojaZivotinja, String ime, double cena, SimpleDateFormat rokTrajanja) {
		super(ime, cena, rokTrajanja);
		this.kojaZivotinja = kojaZivotinja;
	}

	@Override
	public double getCenaPlusPDV() {
		return cena * 1.08;
	}

	public String getKojaZivotinja() {
		return kojaZivotinja;
	}

	public void setKojaZivotinja(String kojaZivotinja) {
		this.kojaZivotinja = kojaZivotinja;
	}

	@Override
	public String toString() {
		return super.toString() + ", cena sa PDV-om: " + this.getCenaPlusPDV() + ", " + kojaZivotinja;
	}
}
