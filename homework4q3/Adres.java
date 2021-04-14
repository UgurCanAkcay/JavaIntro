package homework4q3;
import java.util.ArrayList;

public class Adres {

	private String cadde;
	private String sehir;
	private String postaKodu;
	private ArrayList<Kisi> kisi;
	
	public Adres() {
	
	}

	public Adres(String cadde, String sehir, String postaKodu, ArrayList<Kisi> kisi) {
		super();
		this.cadde = cadde;
		this.sehir = sehir;
		this.postaKodu = postaKodu;
		this.kisi = kisi;
	}

	public String getCadde() {
		return cadde;
	}

	public void setCadde(String cadde) {
		this.cadde = cadde;
	}
	public String getSehir() {
		return sehir;
	}
	public void setSehir(String sehir) {
		this.sehir = sehir;
	}
	public String getPostaKodu() {
		return postaKodu;
	}
	public void setPostaKodu(String postaKodu) {
		this.postaKodu = postaKodu;
	}
	public ArrayList<Kisi> getKisi() {
		return kisi;
	}
	public void setKisi(ArrayList<Kisi> kisi) {
		this.kisi = kisi;
	}
	@Override
	public String toString() {
		return "Adres [cadde=" + cadde + ", sehir=" + sehir + ", postaKodu=" + postaKodu + ", kisi=" + kisi
				+ ", getKisi()=" + getKisi() + "]";
	}
	public void ekranaYaz() {
		
		System.out.println("Ekrana yazıldı.");
	}
}
