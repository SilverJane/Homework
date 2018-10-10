package first2;
import java.util.Random;
public class Exc3 {
	public static void main(String args[]) {
		  Random rand = new Random();
		  int x = rand.nextInt(10);
		  int y = 0;
		  
		  for(int i = 0; i < (x*3); i++) {
			  if(i%3 == 0)
				  y = y+i;
		  }
		  System.out.println("Ñóììà " + y);
		  
		

	}

}
