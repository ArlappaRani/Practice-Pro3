package staticandnonstatic;

public class CallNonStaticmethod {

	public static void main(String[] args) {
	
			// TODO Auto-generated method stub
			//calling non static method so we create object
       CallNonStaticmethod c1=new CallNonStaticmethod();
       c1.learnPython();
		}
		public  void learnPython()
		{
			System.out.println("Learning python");
		}


	}


