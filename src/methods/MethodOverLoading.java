package methods;

public class MethodOverLoading {
	public static void Shoping()
	{
		System.out.println("For buying black jeans bill is 500rs ");
	}
	public static void Shoping(int quantity)
	{
		System.out.println("For buying 2 black jeans bill is"+(quantity*500)+"rs");
	}
	public static void Shoping(String Type,int quantity)
	{
		System.out.println("For buying "+Type+"of 2 dresses bill is"+(quantity*2)+"rs");

	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shoping();
		Shoping(2);
		Shoping("Kurtas",600);
		

	}

}
