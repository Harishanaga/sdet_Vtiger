package javapractice;

public class SecondMinWOBS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {21,6,58,12,32};
		int fmin=a[0];
		int smin=a[0];
		for(int i=0;i<5;i++)
		{
			if(a[i]<fmin)
			{
				smin=fmin;
				fmin=a[i];
				
			}
			else if(a[i]<smin)
			{
				smin=a[i];
				
			}
		}System.out.println(smin);
		
	}

}
