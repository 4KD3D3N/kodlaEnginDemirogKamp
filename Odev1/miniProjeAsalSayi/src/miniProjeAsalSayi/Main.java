package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		// Asal Sayı
		int number=25;
		int remainder=number % 2 ;
		boolean isPrime=true;
		
		if(number<2) {
			System.out.println("En Küçük Asal Sayı 2 dir 2 den daha küçük bir sayı girmeyiniz.");
			return;
			
		}
		
		
		//System.out.println(remainder);
		for(int i=2; i<number; i++) {
			if(number % 2==0) {
				isPrime=false;
			}
			
		}
		if(isPrime) {
			System.out.println("sayı asal iyi bir sayı tebrikler...");
			
		}else {
			System.out.println("Bu Sayı Asal Değildir.!");
		}
	}

}
