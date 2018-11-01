package zadatak8;

import java.text.SimpleDateFormat;

public class Mlecni extends Proizvod {
	private String poreklo;

	
	public Mlecni(String poreklo, String ime, double cena, SimpleDateFormat rokTrajanja) {
		super(ime, cena, rokTrajanja);
		this.poreklo = poreklo;
	}

	@Override
	public double getCenaPlusPDV() {
		return cena * 1.2;
	}

	public String getPoreklo() {
		return poreklo;
	}

	public void setPoreklo(String poreklo) {
		this.poreklo = poreklo;
	}

	@Override
	public String toString() {
		return super.toString() + ", cena sa PDV-om: " + this.getCenaPlusPDV() + ", poreklo: " + poreklo;
	}
}
