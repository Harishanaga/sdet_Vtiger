package javapractice;

public class DuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,15,19,10,13,13,15};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[j]);
					break;
				}
			
			}
		}
	}

}
