package testprograms;



public class ReverseFirstLastString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sentence="Love my Country india";
		
		String[] strArr=sentence.split("\\s");
		
		String rev1=reverse(strArr[0]);
		String rev2=reverse(strArr[strArr.length-1]);
		
		
		String output=(sentence.replaceFirst(strArr[0], rev1)).replaceFirst(strArr[strArr.length-1], rev2);
		
		
		System.out.println(output);
		
		
			
		
		
		
		
		
		
}
	public static String reverse(String rev) {
		String reverse="";
		for(int i=rev.length()-1;i>=0;i--) {
			reverse=reverse+rev.charAt(i);
			
		}
		return reverse;
	}
}