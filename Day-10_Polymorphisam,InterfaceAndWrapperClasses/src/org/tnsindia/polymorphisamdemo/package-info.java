class Test
{
	static int a;
	static
	{
		a=4;
		System.out.println("insude static blockn");
		System.out.println("a="+a);
	}
	Test()
	{
		System.out.println("ninside constructorn");
		a=10;
	}
	public static void main(string[] args)
	{
		Test obj=new Test();
		obj.func();
	}
}
