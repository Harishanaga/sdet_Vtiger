package generalUtilities;

import java.util.Random;


public class JavaUtility {
	public static int generateRannum() {
		Random r =new Random();
		int ranNum = r.nextInt(1000);
		System.out.println();
		return ranNum;
	}	
		
}
	
