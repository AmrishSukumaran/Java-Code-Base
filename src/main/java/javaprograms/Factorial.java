package javaprograms;

public class Factorial {
	
	
	public static int fact(int num) {
		int fact=1;
		if(num==0) {
			return fact;
		}else {
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		
			
		}
		}
		//System.out.print(fact);
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int output=fact(3);
		System.out.print(output);

	}

}
