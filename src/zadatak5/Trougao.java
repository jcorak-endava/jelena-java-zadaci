package zadatak5;

public class Trougao extends GeometrijskaSlika {
	private double a;

	public Trougao() {

	}

	public Trougao(double a) {
		setA(a);
	}

	public Trougao(boolean fill, String boja, double a) {
		super(fill, boja);
		setA(a);
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	@Override
	public double izracunajPovrsinu() {
		return (Math.pow(a, 2) * Math.sqrt(3)) / 4.0;
	}

	@Override
	public double izracunajObim() {
		if (a <= 0)
			return Double.NaN;
		return 3 * a;
	}

	@Override
	public String toString() {		
		if (a <= 0)
			return "Trougao: Figura nije formirana zbog nepravilno unetih podataka.%n";	
		return String.format("Trougao: %s, stranica = %.2f, %n[obim = %.2f, povrsina = %.2f]%n", 
				super.toString(), a, izracunajObim(), izracunajPovrsinu());
	}

}
