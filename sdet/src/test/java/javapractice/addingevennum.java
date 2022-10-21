package javapractice;

public class addingevennum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=4321;
		int sum=0;
		int rem=0;
		
		while(i!=0)	//(t)
		{
			rem=i%10; //rem=4321%10=1
			if(rem%2==0)	
			{
				sum=sum+rem;
			}
			i=i/10;
		}
		System.out.println(sum);
	}

}
