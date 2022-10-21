package javapracticeclass;

public class AddingSdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=469;
		int rem=0;int sum=0;
		
		while(a!=0)
		{
			rem=a%10;
			sum=sum+rem;
			a=a/10;
		}
		System.out.println(sum);
	}

}
