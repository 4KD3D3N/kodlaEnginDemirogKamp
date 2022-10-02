package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product =new Product();
		product.id=1;
		product.name="Laptop";
		product.description="Asus Laptop";
		product.price=5000;
		product.stockAmount=3;
	
		ProductManager productManager=new ProductManager();
		productManager.Add(product);
	}

}
