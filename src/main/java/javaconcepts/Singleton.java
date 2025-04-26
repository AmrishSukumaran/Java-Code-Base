package javaconcepts;

public class Singleton {
	
	//Singleton class has only one object or instance of class which returns the one object instance of the class at a time

//	Steps to design:
//		1.declare a private constructor
//		2.create a public static method which returns the object of the single ton class
	
	private static Singleton instance=null;
	public String str;
	
	
	private Singleton() {
		str="Hey my name is Amrish";
	}
	
	
	public static Singleton getInstance() {
		if(instance==null) {
         instance=new Singleton();
         		
		}
		return instance;
		
	}

	
	

	public static void main(String[] args) {
		Singleton x=Singleton.getInstance();
	System.out.println(x.str.toUpperCase()); 
	
		
		
		

	}

}
