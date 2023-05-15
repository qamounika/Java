package basics;

public class IfElseIf {

	public static void main(String args[])
	{
		int a= 20;
		int b= 30;
		if(a>b)
		{
			System.out.println("A is greater than B");
		}
		else if(b>a)
		{
			System.out.println("B is greater than A");
		}
		else
		{
			System.out.println("A is equal to B");
		}
	}
}