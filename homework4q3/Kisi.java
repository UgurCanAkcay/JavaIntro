package homework4q3;
public class Kisi {

 private String adi;
	private String telefonu;
	private String email;
	public Kisi() {
	}

	public Kisi(String adi, String telefonu, String email) {
		this.adi = adi;
		this.telefonu = telefonu;
		this.email = email;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getTelefonu() {
		return telefonu;
	}

	public void setTelefonu(String telefonu) {
		this.telefonu = telefonu;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Kisi [adi=" + adi + ", telefonu=" + telefonu + ", email=" + email + "]";
	}

	public boolean yemekAl() {
		return true;
	}
	
	
}