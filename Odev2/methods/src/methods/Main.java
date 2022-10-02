package methods;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sayiBulmaca();
	}
	
	public static void sayiBulmaca() {
		// Sayı Bulma Algoritması
				int[] sayilar=new int[] {
					1,2,5,7,9,0	
				};
				int aranacak=6;
				boolean varMi=false;
				for (int sayi:sayilar) {
					if(sayi==aranacak) {
						varMi=true;
						break;
					}
				}
				if(varMi) {
					mesajVer("Sayı mevcuttur: "+aranacak);
					
				}else {
					mesajVer("Sayı mevcut Değildir: "+aranacak);
				}
	}
//Fonksiyon yazarak kendimizi tekrarlamadan kurtarımış oluyoruz.
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
}
