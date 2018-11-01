package zadatak5;

public class Kvadrat extends GeometrijskaSlika {

	private double stranica;

	public Kvadrat() {
	}

	public Kvadrat(double stranica) {
		setStranica(stranica);
	}

	public Kvadrat(boolean fill, String boja, double stranica) {
		super(fill, boja);
		setStranica(stranica);
	}

	public double getStranica() {
		return stranica;
	}

	public void setStranica(double stranica) {
		this.stranica = stranica;
	}

	@Override
	public double izracunajPovrsinu() {
		if (stranica <= 0)
			return Double.NaN;
		return stranica * stranica;
	}

	@Override
	public double izracunajObim() {
		if (stranica <= 0)
			return Double.NaN;
		return 4 * stranica;
	}

	@Override
	public String toString() {
		if (stranica <= 0)
			return "Kvadrat: Figura nije formirana zbog nepravilno unetih podataka.%n";		
		return String.format("Kvadrat: %s, stranica = %.2f, %n[obim = %.2f, povrsina = %.2f]%n", 
				super.toString(), stranica, izracunajObim(), izracunajPovrsinu());
	}
}
