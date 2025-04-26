package javaprograms;


import java.util.*;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String regexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@" 
		        + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
		String email1="amrishs94@gmail.com";
		boolean matches = email1.matches(regexPattern);
		
		System.out.println(matches);

		
		
		
		
}

}