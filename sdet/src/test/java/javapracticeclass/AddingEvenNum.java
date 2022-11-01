package javapracticeclass;

public class AddingEvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=7556;
		int sum=0;int rem=0;
		while(num!=0)
		{
			rem=num%10;
			if(rem%2==0)
			{
				sum=sum+rem;
				
			}
			num=num/10;
			
		}
		System.out.println(sum);
	}

}
