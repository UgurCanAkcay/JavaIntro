package translateq2;

public class translateError {

	public void translate() {
	}
	public void donusumTest(String test) {
		try {
			 Integer.valueOf(test);

		} catch (NumberFormatException e) {
			if(test.length()>10) {
				System.err.println("Donusturulmek istenen sayi cok buyuk");
			}
			else {
			System.err.println("Donusturulmek istenen sayi aslında floating point sayi");
		}
	}
}
}