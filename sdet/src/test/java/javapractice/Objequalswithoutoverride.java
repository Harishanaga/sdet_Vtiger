package javapractice;

public class Objequalswithoutoverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Objequalswithoutoverride obj=new Objequalswithoutoverride();
		Objequalswithoutoverride obj2=new Objequalswithoutoverride();
		System.out.println(obj);
		System.out.println(obj2);
		System.out.println(obj.equals(obj2));
		obj=obj2;
		System.out.println(obj.equals(obj2));
	}

}
