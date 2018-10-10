//среднее значение массива
package first2;
import java.util.Random;
public class Exc6 {
	public static void main(String args[]) {
		Random rand = new Random();
		int mas[] = new int[10];
		double x = 0;
		int i = 0;
		
		for ( i = 0; i < 10; i++) {
			mas[i] = rand.nextInt(20);
			System.out.println(mas[i]);
		}
	
		System.out.println(" ");
	   for(  i = 0; i < 10; i++) 
		   x = x + mas[i];
		   System.out.println(x/10);
	   
	
	
	
	
	
	
	
	
	
	}

}
