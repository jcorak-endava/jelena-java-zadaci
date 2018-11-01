package zadatak5;

public class NejednakostranicniTrougao extends Trougao {
	private double b, c;

	public NejednakostranicniTrougao() {
	}

	public NejednakostranicniTrougao(double a, double b, double c) {
		super(a);
		setBiC(b, c);
	}

	public NejednakostranicniTrougao(boolean fill, String boja, double a, double b, double c) {
		super(fill, boja, a);
		setBiC(b, c);
	}

	private void setBiC(double b, double c) {
		this.b = b;
		this.c = c;
	}

	@Override
	public double izracunajPovrsinu() {
		if (getA() <=0 || b <= 0 || c <= 0) {
			return Double.NaN;
		} else {
			double s = izracunajObim() / 2.0;
			return Math.sqrt(s * (s - getA()) * (s - b) * (s - c));
		}
	}

	@Override
	public double izracunajObim() {
		if (getA() <=0 || b <= 0 || c <= 0)
			return Double.NaN;
		return getA() + b + c;
	}

	@Override
	public String toString() {
		if (getA() <=0 || b <= 0 || c <= 0)
			return "Nejednakostranicni trougao: Figura nije formirana zbog nepravilno unetih podataka.";
		return String.format("Nejednakostranicni trougao: ispunjenost = %b, boja = %s, stranica1 = %.2f, stranica2 = %.2f, stranica3 = %.2f, %n[obim = %.2f, povrsina = %.2f]%n", 
				isFill(), getBoja(), getA(), b, c, izracunajObim(), izracunajPovrsinu());
	}

}
