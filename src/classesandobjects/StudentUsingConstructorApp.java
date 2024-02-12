package classesandobjects;

public class StudentUsingConstructorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentUsingConstructor s1=new StudentUsingConstructor("Rani",44,59.0F,"Female");
		  s1.Study();
		  //creating anonymous objects
		  new StudentUsingConstructor("Rahul",45,65.4F,"Male").Percentage();
		

	}

}
