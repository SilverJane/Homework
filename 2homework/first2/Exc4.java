package first2;

//import java.util.Arrays;
import java.util.Random;
class Exc4 {
	   public static void main (String args[]) {
		   Random rand = new Random();
		   int arr[] = new int[10];
		   int max = 0;
		   int min = 0;
		   for( int i = 0; i < 10; i++) {
			   arr[i] = rand.nextInt(10);
			   System.out.println(arr[i]);
		   }
	     // maximum 
		   
//		   int max = arr[0];
//		   for( int i = 0; i < arr.length; i++) {
//			   if(max < arr[i])
//				   max = arr[i];
//		   }
//	     System.out.println("Максимальное значение " + max);      
//	           
	   for(int i = 0; i < arr.length; i++) {
		   max = Math.max(max, arr[i]);
	   }
		   
	System.out.println("Max: " + max);
	
	     for (int i = 0; i < arr.length; i++) {
	    	 min = Math.min(min, arr[i]);
	     }
	System.out.println("Min: " + min);
	   
	   
	   
	   }
}