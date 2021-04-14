package homework4q3;
public class Ogrenci extends Kisi {

   private String ogrenciNo;
	private String not;
	
	public Ogrenci() {
	}

	public Ogrenci(String ogrenciNo, String not) {
		this.ogrenciNo = ogrenciNo;
		this.not = not;
	}

	public Ogrenci(String adi, String telefonu, String email, String ogrenciNo, String not) {
		super(adi, telefonu, email);
		this.ogrenciNo = ogrenciNo;
		this.not = not;
	}

	public String getOgrenciNo() {
		return ogrenciNo;
	}

	public void setOgrenciNo(String ogrenciNo) {
		this.ogrenciNo = ogrenciNo;
	}

	public String getNot() {
		return not;
	}
	public void setNot(String not) {
		this.not = not;
	}
	@Override
	public String toString() {
		return "Ogrenci [ogrenciNo=" + ogrenciNo + ", not=" + not + ", Adi()=" + getAdi() + ", Telefonu()="
				+ getTelefonu() + ", Email()=" + getEmail() + "]";
	}
	public boolean kayitliMi() {
		
		return true;
	}
	
}