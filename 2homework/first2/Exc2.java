package first2;
import java.util.Random;
public class Exc2 {

	public static void main(String[] args) {
		Random rand = new Random();
		int a = rand.nextInt(10);
		 int s = 0; 
		 System.out.println(a);
		for (int i = 1; i <= a; i++)
		{  int b = a % i;
		if ( b == 0 )
			s++; 
		}
		
		if (s == 2)
			 System.out.println("Число  является простым");
		else System.out.println("Число не является простым");
		}

	}