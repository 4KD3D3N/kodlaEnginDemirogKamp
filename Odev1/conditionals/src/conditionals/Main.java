package conditionals;

public class Main {

	public static void main(String[] args) {
		// Ders 8 Kontrol Yapıları İF Blokları
		
		int sayi=14;
		if(sayi<20) {
			System.out.println("Sayi 20 den Küçüktür.");
		}
		if(sayi<15) {
			System.out.println("Sayi 15 den Küçüktür.");
		}
	
		int sayi2=20;
		if(sayi2<20) {
			System.out.println("Sayı 20 Den küçüktür.");
		}else{
			System.out.println("Sayı 20 Den Küçük değildir.");
			
		}
		
		int sayi3=20;
		if(sayi3<20) {
			System.out.println("Sayı 20 Den küçüktür.");
		}else if(sayi3==20){
			System.out.println("Sayı 20 ye eşittir.");
			
		}else{
			System.out.println("Sayı 20 den Büyüktür.");
		}
	}

}
