package loopDemo;

public class main {
	public static void main(String[] args) {
		//For
		//i=i+1 ile i++ aynıdır
		
		for(int i=2;i<10;i+=2) {
			System.out.println(i);
			
		}
		System.out.println("For Dongusu Bitti");
		
		int i=1;
		//While
		while(i<10) {
			System.out.println(i);
			i++;
			
		}
		System.out.println("While dongusu bitti");
		
		//Do-While
		int j=100;
		do{
			System.out.println();
			j+=2;
		} while(j<10);
		System.out.println("Do-While Dongusu Bitti");
			
	}

}
