package testprograms;

public class StringReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name ="Amrish";
		String reverse="";
		
		for(int i=name.length()-1;i>=0;i--) {
			reverse=reverse+name.charAt(i);
			
		}
		System.out.println(reverse);

	}

}
