package testprograms;

public class StringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Amrish";
		
		char[] charArray = name.toCharArray();
		
		int count=0;
		for(char eachChar:charArray) {
			
			++count;
			
		}
		System.out.println(count);
		
		
	}
}
