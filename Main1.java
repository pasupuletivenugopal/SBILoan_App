interface Demo
{
	void test();
}
class Sample implements Demo
{
	public void test()
	{
		System.out.println("hey venu venu wait for a mintute");
	}
}
class Help
{
	public static Demo helpMethod()
	{ 
	Demo aa1=new Sample();
	aa1.test();
		return aa1;
	}
}
class Main1
{
	public static void main(String[] args)
	{ 
		Help.helpMethod();
	}

}

