package javapractice;

public class MissingNumArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,5,1,6,7};
		boolean status=true;
		for(int i=1;i<10;i++) //i=1,1<10(t)//i=2,2<10(t)
		{
			for(int j=0;j<arr.length;j++) //j=0;0<9(t) //j=1;1<9(t) //j=2;2<9(t) //j=3;3<9(t)//j=0
			{
				if(i==arr[j])	//if(1==0) ie if(1==2)(f) //if(1==5)(f) //if(1==2)(f) //if(1==1)(t)
				{
					status=false; //1=false
					break;
				}
			}
			if(status==true)
			{
				System.out.println(i+" "); 
			}
			
				else
				{
					status=true;
				}
			}
			
		}
		
		
	}


