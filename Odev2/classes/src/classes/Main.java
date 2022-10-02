package classes;

public class Main {

	public static void main(String[] args) {
		// reference type
		CustomerManager customerManager=new CustomerManager();
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		//value Type
		int sayi1=10;
		int sayi2=20;
		sayi2=sayi1;
		sayi1=30;
		System.out.println(sayi2);
		
		//reference type dır. :D
		int[] sayilar1=new int [] {1,2,3};
		int[] sayilar2=new int [] {4,5,6};
		sayilar2=sayilar1;
		sayilar1[0]=10;
		System.out.println(sayilar2[0]);
		// burada değer 10 çıkar çünkü referans type tır.  yani referanslı olduğundan sayilar1 in değeri sonradan 10 olsa yada başka birşey olsa sayilar2 ninde değeri o olur.
		// ama value type olan ifadeler öyle değildir. sadece değeri tutar referans tutmaz. bunu öğrendim.
	}
}
