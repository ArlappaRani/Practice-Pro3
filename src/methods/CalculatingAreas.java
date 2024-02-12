package methods;
import java.util.Scanner;
public class CalculatingAreas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the side value");
		int Side=scan.nextInt();
		int squareArea=CalcArea(Side);//calling method
		System.out.println(squareArea);
		System.out.println("Enter the length value");
		int Length=scan.nextInt();
		System.out.println("Enter  the breadth value");
		int breadth=scan.nextInt();
		int rectArea=CalcArea(Length,breadth);
		System.out.println(rectArea);
		System.out.println("Enter the radius value");
		float radius=scan.nextFloat();
		float CircleArea=CalcArea(radius);
		System.out.println(CircleArea);

	}
	public static int CalcArea(int Side )
	{
		return Side*Side;
	}
	public static float CalcArea(float radius )
	{
		return 3.14F*radius*radius;
	}
	public static int CalcArea(int Length,int breadth )
	{
		return Length*breadth;
	}
	

}
