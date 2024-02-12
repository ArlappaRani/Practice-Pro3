package classesandobjects;

public class SwapWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=9;
		int b=8;
		System.out.println("Before swap"+a+" "+b+" ");
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swap"+a+" "+b+" ");
	}

}
