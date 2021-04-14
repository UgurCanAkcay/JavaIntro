package homework4q3;
public class Profesor extends Kisi {
private int maas;
	
	public Profesor() {
	}
	public Profesor(int maas) {
		this.maas = maas;
	}
	public Profesor(String adi, String telefonu, String email, int maas) {
		super(adi, telefonu, email);
		this.maas = maas;
	}
	public int getMaas() {
		return maas;
	}
	public void setMaas(int maas) {
		this.maas = maas;
	}
	@Override
	public String toString() {
		return "Profesor [maas=" + maas + ", getAdi()=" + getAdi() + ", getTelefonu()=" + getTelefonu()
				+ ", getEmail()=" + getEmail() + "]";
	}
	
	
}