package javapracticeclass;

public class Duplicatesinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,4,6,4,2};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j]) 
				{
					System.out.println("Duplicates in an array are : "+ a[j]);
					
				}
			}
		}
	}

}
