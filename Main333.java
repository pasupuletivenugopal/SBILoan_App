abstract class A
{
	abstract void test();
}  
class B extends A
{
	public void test()
	{
		System.out.println("goodgood");
	}
}
class Gopi
{
	//public  A method()
	public static A method()
	{
		A s1=new B();
		s1.test();
		return s1;

	}

}
class Main333
{
	public static void main(String[] args)
	{
		//A g1 = new Gopi().method();
		//g1.test();
		//Gopi s2= new Gopi();
		//A s3= s2.method();
		//s3.test();
		Gopi.method();
	}
}
	
