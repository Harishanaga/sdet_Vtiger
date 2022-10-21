package javapractice;

public class SumandAvgArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,5,9,13,15};
		float avg=0;
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
		avg=sum/a.length;
		System.out.println(avg);
			
	}

}
