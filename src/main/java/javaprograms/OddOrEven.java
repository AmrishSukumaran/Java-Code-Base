package javaprograms;
import java .util.*;
public class OddOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int N=20;
		
		if(N%2==0){
		    System.out.println("Not Weird");
		    
		}
		else if((N%2==0) && (N>=2 && N<=5)){
		    System.out.println("Not Weird");
		}
		else if((N%2==0) && (N>=6 && N<=20)){
		    System.out.println("Weird");
		}else if((N%2==0) && (N>20)){
		    System.out.println("Not Weird");
		    
		}

		else{
		    System.out.println("Weird");
		}
		
		
		
		
		
		

	}

}
