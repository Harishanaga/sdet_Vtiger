package javapractice;

public class MovingofArrayNum {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		int key=3;
		for(int i=0;i<key;i++)
		{
			int temp=arr[0];
			for(int j=1;j<arr.length;j++)
			{
				arr[j-1]=arr[j];
			}
			arr[arr.length-1]=temp;
			
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
