package javapracticeclass;

public class SumandAvgArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,5,7,6,6};
		int sum=0;
		int avg=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
		avg=sum/2;
		System.out.println(avg);
	}

}
