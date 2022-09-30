package dataTypes;

public class Main {

	public static void main(String[] args) {
		// Ders 7 Temel Veri Tipleri
     
		int sayi=13;
		sayi="Antalya";
		// bu bir hata. şu var ki int değere diğer tipler diğer tiplere de başka tip tanımlı değerler girilemezmiş. bunu öğrendim. örneğin :
		byte sayiKucuk=127;
		byte sayiKucukEksi=-128;
		// fakat int değeri girilmez yani
		byte sayi2=13;
		sayi2=129; // Olamaz. Zaten Kızdı hatalı satır olduğunu gösteren kırmızı var.
		long buyukSayi1=9999999999;// Burada Bir sorum var ne den bir 9 daha koyunca kızıyor hata satırı çıkıyor anlamadım
		// Halbuki long buna yetmiyor mu kapasite olarak sonuçta enbüyük integer değer değilmi bu soruyu discortta soracağım.
		//Not olarak buraya da yazmak istedim... :D
		
		double ondalikliSayiBuyuk=1991919199.11111;
		float  ondaklikliSayiKucuk=1991919199.11111; // Kızması normal :D kapasite meselesi
		
		// Buradan da görüldüğü gibi float ve double ondalıklı tip değişkenler için kullanılan veri tipleridir.
		// fakat float küçük kapasitesi olan double ise büyük kapasitesine sahip olan veri tipidir.
		
		char tekKarakter="a"; // kızdı tekrar deniyorum.
		char tekKarakter2='A'; // Kızmadı demekki tek tırnak kullanılması gerekiyor.
		
		// Char veri tipi ise tek karakter kontrolü yapılması istenildiğinde evet için e ye hayır için h ye bas misal gibi bellekte yer tutmayan
		// ve zamanı kısaltan hız ve performans bakımından kolay bir tip için kullanılması uygun olan bir karakterlik veri tipidir.
		
		String diziKarakter="Fatih Ödevini Hakkı ile Yapıyor.";
		// burada da görüldüğü gibi diziKarakter değikeninde bir cümle ve karakter topluluğu dizi haline gelmiş karakterleri işte String tip ile tanımladık.
		
		// String tip : bu bir karakter kümesidir dizi şeklindedir. bunu öğrendim. sağolun tekrardan.
		
		boolean dogrumu= true; // Kontroller için kullanılır ya doğrudur. yani true yada yanlıştır. yani false;
		
		
		
	}

}
