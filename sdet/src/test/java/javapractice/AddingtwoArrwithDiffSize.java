package javapractice;

public class AddingtwoArrwithDiffSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,11,12};
		int b[]= {6,7,8,9,5};
		int length=a.length;
		
		if(a.length<b.length)
		{
			length=b.length;
		}
		
			for(int i=0;i<length;i++)
			{
				try {
					System.out.println(a[i]+b[i]);
			}
		
		catch(Exception ref)
		{
			if(a.length>b.length)
			{
				System.out.println(a[i]);
			}
			else
			{
				System.out.println(b[i]);
			}
		}
			}
			}
}
