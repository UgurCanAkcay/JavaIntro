package rpggamechapter2;
public class Kisi {

	private String ad;
	private int puan;
	
	public Kisi() {
		
	}
	public Kisi(String ad){
		this.ad = ad;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public int getPuan() {
		return puan;
	}
	public void setPuan(int puan) {
		this.puan = puan;
	}
	@Override
	public String toString() {
		return "Kisi [ad=" + ad + ", puan=" + puan + "]";
	}

	
}
