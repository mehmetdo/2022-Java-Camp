package recapDemo;

public class main {
	public static void main(String[] args) {
		//En büyük sayıyı bulma
		
		int sayi1 = 24;
		int sayi2 = 25;
		int sayi3 = 2;
		int enBuyuk = sayi1;
		
		if(enBuyuk<sayi2) {
			enBuyuk = sayi2;
		}
		
		if(enBuyuk<sayi3) {
			enBuyuk = sayi3;
		}
		System.out.println("En buyuk = "+enBuyuk);
	}

}
