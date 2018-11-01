package zadatak7;

public class Student {

	private String ime;
	private String prezime;
	private Integer brojPoena;
	private Integer ocena;

	public Student() {

	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public Integer getBrojPoena() {
		return brojPoena;
	}

	public void setBrojPoena(Integer brojPoena) {
		this.brojPoena = brojPoena;
	}

	public Integer getOcena() {
		return ocena;
	}

	public void setOcena(Integer ocena) {
		this.ocena = ocena;
	}	

	@Override
	public String toString() {
		return String.format("%s %s %d %d %n", getIme(), getPrezime(), getBrojPoena(), getOcena());
	}

}
