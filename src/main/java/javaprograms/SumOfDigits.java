package javaprograms;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0,digits,num=1024;
		
		while(num>0) {
			digits=num%10;
			sum=sum+digits;
			num=num/10;
		}

		
	System.out.println(sum);
	}

}
