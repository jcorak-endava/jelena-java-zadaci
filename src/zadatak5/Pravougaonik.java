package zadatak5;

public class Pravougaonik extends Kvadrat {
	private double drugaStranica;

	public Pravougaonik() {
	}

	public Pravougaonik(double drugaStranica) {
		setDrugaStranica(drugaStranica);
	}

	public Pravougaonik(boolean fill, String boja, double stranica, double drugaStranica) {
		super(fill, boja, stranica);
		setDrugaStranica(drugaStranica);
	}

	public double getDrugaStranica() {
		return drugaStranica;
	}

	private void setDrugaStranica(double drugaStranica) {
		this.drugaStranica = drugaStranica;
	}

	@Override
	public double izracunajPovrsinu() {
		if (getStranica()<=0 || drugaStranica <= 0)
			return Double.NaN;
		return super.getStranica() * drugaStranica;
	}

	@Override
	public double izracunajObim() {
		if (getStranica()<=0 || drugaStranica <= 0)
			return Double.NaN;
			return 2 * (super.getStranica() + drugaStranica);
	}

	@Override
	public String toString() {
		if (drugaStranica <= 0)
			return "Figura nije formirana zbog nepravilno unetih podataka.";		
		return String.format("Pravougaonik: ispunjenost = %b, boja = %s, stranica1 = %.2f, stranica2 = %.2f, %n[obim = %.2f, povrsina = %.2f]%n", 
				isFill(), getBoja(), getStranica(), drugaStranica, izracunajObim(), izracunajPovrsinu());
	}

}
