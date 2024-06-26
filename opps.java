class Student
{
	void dispaly()
	{
		System.out.println("This is ordinary method");
	}
	Student()
	{
		System.out.println("Constructor Method called...");
	}
}
class Test
{
	public static void main(String args[])
	{
		new Student();
	}
}

