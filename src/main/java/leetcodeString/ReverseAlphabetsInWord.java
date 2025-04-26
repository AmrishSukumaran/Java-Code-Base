package leetcodeString;

public class ReverseAlphabetsInWord {

	public static void main(String[] args) {
		String str = "test12pop90java989pyt767";

		StringBuffer currentWord = new StringBuffer();
		StringBuffer result = new StringBuffer();

		char[] charArray = str.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			char ch = charArray[i];

			if (Character.isAlphabetic(ch)) {

				currentWord.append(ch);

			}
			
			
			if(Character.isDigit(ch)) {
				if(currentWord.length()>0) {
					result=result.append(currentWord.reverse());
					currentWord.setLength(0);
					
					
				}
				//else if(ch==charArray[i-1]) {
					//result.append(ch);
				//}
				else 
				{
					result.append(ch);
				}
				
				
				
			}

		}
		
		String output=result.toString();
		System.out.println(output);

	}

}
