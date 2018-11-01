package zadatak5;

public abstract class GeometrijskaSlika {

	private boolean fill;
	private String boja;

	public GeometrijskaSlika() {
	}

	public GeometrijskaSlika(boolean fill, String boja) {
		this.fill = fill;
		this.boja = boja;
	}

	public GeometrijskaSlika(String boja) {
		this.boja = boja;
	}

	public boolean isFill() {
		return fill;
	}

	public void setFill(boolean fill) {
		this.fill = fill;
	}

	public String getBoja() {
		return boja;
	}

	public void setBoja(String boja) {
		this.boja = boja;
	}

	public abstract double izracunajPovrsinu();

	public abstract double izracunajObim();

	@Override
	public String toString() {
		return String.format("ispunjenost = %b, boja = %s", fill, boja);
	}
	
	
	
}
