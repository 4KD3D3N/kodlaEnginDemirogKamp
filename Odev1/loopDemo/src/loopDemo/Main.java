package loopDemo;

public class Main {

	public static void main(String[] args) {
		// Loop : döngüler 
		for(int i=1; i<10;i++) {
			System.out.println("İ nin değeri : "+i);
			
		}
		System.out.println("Döngü Bitti");
		for(int i=1; i<10;i+=2) {
			System.out.println("İ nin değeri : "+i);
			
		}
		System.out.println("Döngü Bitti");
		for(int i=0; i<10;i+=2) {
			System.out.println("İ nin değeri : "+i);
			
		}
		System.out.println("Döngü Bitti");
	
	
	// While Döngüsü
		int i=1;
	 while(i<10) {
		
		 System.out.println(i);
		 i++;
		 }
	 System.out.println("While Döngüsü Bitti");
	 int j=1;
	 do {
		 System.out.println(j);
		 j+=2;
		 
	 }while(i<10);
	 System.out.println(" Do while döngüsü sonlanmıştır.");
	 // GÖrüldüğü üzere do while döngüsü en az birkez mutlaka döngüye girer...
	}
}
