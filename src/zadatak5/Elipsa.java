package zadatak5;

public class Elipsa extends Krug {

	private double malaPoluosa;

	public Elipsa() {
	}

	public Elipsa(double malaPoluosa) {
		setMalaPoluosa(malaPoluosa);
	}

	public Elipsa(double poluprecnik, double malaPoluosa) {
		super(poluprecnik);
		setMalaPoluosa(malaPoluosa);
	}

	public double getMalaPoluosa() {
		return malaPoluosa;
	}

	public void setMalaPoluosa(double malaPoluosa) {
		this.malaPoluosa = malaPoluosa;
	}

	@Override
	public double izracunajPovrsinu() {
		if (getPoluprecnik() <=0 || malaPoluosa <= 0)
			return Double.NaN;
		return super.getPoluprecnik() * Math.PI * malaPoluosa;
	}

	@Override
	public double izracunajObim() {
		if (getPoluprecnik() <=0 || malaPoluosa <= 0)
			return Double.NaN;
		return ((super.getPoluprecnik() * Math.PI * (9 - Math.sqrt(35))) / 2.0); // aπ(9-√35)/2
	}

	@Override
	public String toString() {
		if (getPoluprecnik() <=0 || malaPoluosa <= 0)
			return String.format("Elipsa: Figura nije formirana zbog nepravilno unetih podataka.%n");		
		return String.format("Elipsa: ispunjenost = %b, boja = %s, poluosa1 = %.2f, poluosa2 = %.2f, %n[obim = %.2f, povrsina = %.2f]%n", 
				isFill(), getBoja(), getPoluprecnik(), malaPoluosa, izracunajObim(), izracunajPovrsinu());
	}
}
