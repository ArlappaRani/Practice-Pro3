package classesandobjects;

public class StudentUsingConstructor {
	//writing data members
	String name;
	int id;
	float Percentage;
	String gender;

	//creating constructor
	/*constructor name is same as class name,not have return type,
	it is non static method ,initialize the data members and creates 
	objects*/

	public StudentUsingConstructor(String name,int id,float Percentage
			,String gender)
	{
		this.name=name;
		this.id=id;
		this.Percentage=Percentage;
		this.gender=gender;
	}
	
	
	
	//writing a data functions 
	void Study()
	{
		System.out.println(name+"is studying b.Tech" );
	}
	void Percentage()
	{
		System.out.println(name+" is having percentage is"+Percentage);
	}

}
