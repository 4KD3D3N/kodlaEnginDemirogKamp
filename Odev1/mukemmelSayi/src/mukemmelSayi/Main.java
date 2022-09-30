package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		// Mükemmel sayı kendisi hariç bölenlerinin toplamı kendisine eşit ise bu sayı mükemmel sayıdır.
		//mesala 6 > 1+2+3 =6
		int number=5;
		int total=0;
		for (int i=1;i<number;i++) {
			if(number % i==0) {
				total=total+i;
			}
		}
		if (total==number) {
			System.out.println("Mükemmel Sayıdır.");
		
		}else {
			System.out.println("Mükemmel sayı DEĞİLDİR!");
		}

	}

}
