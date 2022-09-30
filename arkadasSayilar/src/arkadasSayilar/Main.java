package arkadasSayilar;

public class Main {

	public static void main(String[] args) {
		// Arkadaş Sayılar kendileri hariç pozitif bölenleri toplamları birbirine eşit olmalı en küçük arkadaş sayı 220 ile 284 dür bu ikisi arkadaş sayıdır.
		int sayi =220;
		int sayi2=284;
		int toplam1=0;
		int toplam2=0;
		for(int i=1;i<sayi;i++) {
			if(sayi%i==0) {
				toplam1=toplam1+i;
				
			}
		}
		for(int i=1;i<sayi2;i++) {
			if(sayi2 % i==0) {
				toplam2=toplam2+i;
				
			}
		}
		
		if(sayi==toplam2 && sayi2==toplam1) {
			System.out.println("Arkdaş Sayı Tebrikler");
			
		}else {
			System.out.println("Üzgünüz Arkadaş sayı değildir.");
		}
	}

}
