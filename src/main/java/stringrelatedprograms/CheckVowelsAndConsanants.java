package stringrelatedprograms;

public class CheckVowelsAndConsanants {

	public static void main(String[] args) {
	
		
		String str="AEIOUHJKLL";
		StringBuffer vowels=new StringBuffer();
		StringBuffer consanants=new StringBuffer();
		
		
	for(int i=0;i<str.length();i++) {
		str=str.toLowerCase();
		
		if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
			vowels.append(str.charAt(i));
			
			
		}
		else {
			consanants.append(str.charAt(i));
		}
		
	}
	
	System.out.println(vowels.length());
	System.out.println(consanants.length());
		
		
		
		
		

	}

}
