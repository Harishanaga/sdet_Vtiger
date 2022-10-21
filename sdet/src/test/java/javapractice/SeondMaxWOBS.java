package javapractice;

public class SeondMaxWOBS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {21,6,58,12,32};
		int fmax=a[0];
		int smax=a[0];
		for(int i=0;i<5;i++)
		{
			if(a[i]>fmax)
			{
				smax=fmax;
				fmax=a[i];
				
			}
			else if(a[i]>smax)
			{
				smax=a[i];
				
			}
		}
		System.out.println(smax);
	}

}
