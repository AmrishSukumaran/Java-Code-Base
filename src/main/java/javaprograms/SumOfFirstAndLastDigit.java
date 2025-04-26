package javaprograms;

public class SumOfFirstAndLastDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=123;
		
		String value=String.valueOf(i);
		
		
		
	int x=Character.getNumericValue(value.charAt(0))+Character.getNumericValue(value.charAt(value.length()-1));
	
	System.out.println(x);
	

	}

}
