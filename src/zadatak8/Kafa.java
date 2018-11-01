package zadatak8;

import java.text.SimpleDateFormat;

public class Kafa extends Proizvod {
	private boolean samlevena; // ako nije samlevena onda je u zrnu
	

	public Kafa(boolean samlevena, String ime, double cena, SimpleDateFormat rokTrajanja) {
		super(ime, cena, rokTrajanja);
		this.samlevena = samlevena;
	}

	@Override
	public double getCenaPlusPDV() {
		return cena * 1.08;
	}

	public boolean isSamlevena() {
		return samlevena;
	}

	public void setSamlevena(boolean samlevena) {
		this.samlevena = samlevena;
	}

	@Override
	public String toString() {
		if (samlevena) {
			return super.toString() + ", cena sa PDV-om: " + this.getCenaPlusPDV() + ", samlevena";
		} else {
			return super.toString() + ", cena sa PDV-om: " + this.getCenaPlusPDV() + ", u zrnu";
		}
	}

}
