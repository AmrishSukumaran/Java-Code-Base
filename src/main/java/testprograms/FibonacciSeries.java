package testprograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		int c;
		
		
		
		System.out.println(a);
		
		for(int i=2;i<=100;++i) {
			
			
			c=a+b;
			
			System.out.println(c);
			a=b;
			b=c;
			
			
			
		}
		
		

	}

}
