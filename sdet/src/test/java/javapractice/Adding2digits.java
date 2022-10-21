package javapractice;

public class Adding2digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=321;
		int sum=0;
		int rem=0;
		
		while(i!=0)
		{
			rem=i%10;
			sum=sum+rem;
			i=i/10;
		}
		System.out.println(sum);
	}	

}
