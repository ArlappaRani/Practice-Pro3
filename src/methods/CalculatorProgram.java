package methods;
import java.util.Scanner;
public class CalculatorProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=scan.nextInt();
		System.out.println("Enter the second number");
		int b=scan.nextInt();
        int Add	=add(a,b);
		System.out.println("Addition result is"+Add);  
		int Sub	=sub(a,b);
		System.out.println("subtraction result is"+Sub);  
		int Mul	=mul(a,b);
		System.out.println("multiplication result is"+Mul);  
		int Div=div(a,b);
		System.out.println("Division result is"+Div);  
	}
	public static int add(int a,int b)
	{
		return a+b;
	}
	public static int sub(int a,int b)
	{
		return a-b;
	} 
	public static int mul(int a,int b)
	{
		return a*b;
	}
	public static int div(int a,int b)
	{
		return a/b;
	}
}
