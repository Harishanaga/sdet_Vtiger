package javapractice;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=313;
		int sum=0;
		int rem=0;
		int temp=num;
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println("it is a palindrome");
		}
		else
		{
			System.out.println("it is not a palindrome");
		}
	}

}
