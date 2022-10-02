package classesWithAttributes;

public class ProductManager {
	//JDBC
	public void Add(Product product) {
		System.out.println("Ürün Eklendi: "+product.name);
	}
	// SOLID PRENSİBİ BİR CLASS BİR İŞ YAPAR.
	// single responsibility principle: tek sorumluluk ilkesi
	// BİR FONKSİYON SADECE BİR İŞ YAPAR
	// BİR IF BLOGĞU SADECE BİR İŞ YAPAR...

}
