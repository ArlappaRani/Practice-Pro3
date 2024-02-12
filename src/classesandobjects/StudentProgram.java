package classesandobjects;

public class StudentProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating a object 
		Student s1=new Student();
		//assigning the values
		s1.name="Rani";
		s1.id=402;
		s1.percentage=75.5F;
		s1.gender="Female";
		s1.Study();
		//we have to create anonymous object at once in program

		new Student().play();
		

	}

}
