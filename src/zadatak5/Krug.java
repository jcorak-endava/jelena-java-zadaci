package zadatak5;

public class Krug extends GeometrijskaSlika {

	private double poluprecnik;

	/**
	 * Konstruktor.
	 * Podrazumevana vrednost poluprecnika je 0.
	 * Preporuceno je da se setuje poluprecnik {@link #setPoluprecnik(double)} u suprotnom
	 * nece biti moguce izracunati povrsinu i obim.
	 *
	 */
	public Krug() {
	}

	/**
	 * Konstruktor.
	 * Potrebno je uneti broj veci od nule. U suprotnom nece biti moguce izracunati povrsinu i obim.
	 *
	 * @param poluprecnik Poluprecnik kruga.
	 */
	public Krug(double poluprecnik) {
		setPoluprecnik(poluprecnik);
	}

	/**
	 *
	 * @param fill Ispunjenost kruga.
	 * @param boja Boja kruga.
	 * @param poluprecnik Poluprecnik kruga.
	 */
	public Krug(boolean fill, String boja, double poluprecnik) {
		super(fill, boja);
		setPoluprecnik(poluprecnik);
	}

	/**
	 * Vraca poluprecnik kruga.
	 * 
	 * @return double kao vrednost poluprecnika.
	 */
	public double getPoluprecnik() {
		return poluprecnik;
	}

	/**
	 * Setuje poluprecnik. Morat se uneti broj veci od nule. U suprotnom nece biti moguce izracunati povrsinu i obim.
	 *
	 * @param poluprecnik Poluprecnik kruga.
	 */
	public void setPoluprecnik(double poluprecnik) {
		this.poluprecnik = poluprecnik;
	}

	/**
	 * Vraca povrsinu kruga. Ako poluprecnik nije pozitivan realan broj, vraca NaN.
	 * 
	 * @return double kao vrednost povrsine.
	 */
	@Override
	public double izracunajPovrsinu() {
		if (poluprecnik <= 0)
			return Double.NaN;
		return Math.pow(poluprecnik, 2) * Math.PI;
	}

	/**
	 * Vraca obim kruga. Ako poluprecnik nije pozitivan realan broj, vraca NaN.
	 * 
	 * @return double kao vrednost obima.
	 */
	@Override
	public double izracunajObim() {
		if (poluprecnik <= 0)
			return Double.NaN;
		return 2 * poluprecnik * Math.PI;
	}

	
	/**
	 * Ispisuje obim i povrsinu kruga. Ukoliko poluprecnik nije pozitivan, dobija se poruka da krug nije formiran.
	 * 
	 * @return double kao vrednost obima.
	 */
	@Override
	public String toString() {
		if (poluprecnik <= 0)
			return String.format("Krug: Figura nije formirana zbog nepravilno unetih podataka.%n");
		return String.format("Krug: %s, poluprecnik = %.2f, %n[obim = %.2f, povrsina = %.2f]%n", 
				super.toString(), poluprecnik, izracunajObim(), izracunajPovrsinu());
	}
}
