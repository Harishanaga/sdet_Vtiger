package javapractice;

public class ObjClass {

	int age;
	String name;
	
	public ObjClass(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
	
	@Override
		public String toString()
		{
			return "Obj[age=" +age+ ",name="+ name +"]";
		}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ObjClass obj=new ObjClass(12,"harisha");
		System.out.println(obj.toString());
	}

}
