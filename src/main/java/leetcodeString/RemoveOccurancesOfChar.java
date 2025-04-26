package leetcodeString;

public class RemoveOccurancesOfChar {
	
	
	public static StringBuffer removeChar(String str,char ch) {
		
		
		StringBuffer output=new StringBuffer();
		for(int i=0;i<str.length();i++) {
			char eachChar=str.charAt(i);
			
			if(eachChar!=ch) {
				output=output.append(eachChar);
			}
			
		}
		return output;
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer op=removeChar("Amrish",'A');
		System.out.println(op.toString());
		
		

	}

}
