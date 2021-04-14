
package translateq2;
public class TranslateQ2 {

	public static void main(String[] args) {
		
		translateError translateError = new translateError();
		
		String deger1 = "100.0";
		String deger2 = "100000000000000";
		String deger3 = "100";
		
		translateError.donusumTest(deger1);
		translateError.donusumTest(deger2);
		translateError.donusumTest(deger3);
		
	}
	
}