package javaprograms;

    	public class ReverseAlphabets {
    	    public static void main(String[] args) {
    	        String str = "test12pop90java989pyt767";

    	        // Convert the string to a character array for easier manipulation
    	        char[] charArray = str.toCharArray();
    	        
    	        // StringBuilder to accumulate the result
    	        StringBuilder result = new StringBuilder();
    	        
    	        StringBuilder currentWord = new StringBuilder();
    	        
    	        // Traverse through the string to reverse the words
    	        for (int i = 0; i < charArray.length; i++) {
    	            char ch = charArray[i];
    	            
    	            // If the character is a letter, add it to the current word
    	            if (Character.isLetter(ch)) {
    	                currentWord.append(ch);
    	            } else {
    	                // If we hit a non-letter character, reverse the current word if it's not empty
    	                if (currentWord.length() > 0) {
    	                    result.append(currentWord.reverse());
    	                    currentWord.setLength(0); // Clear the current word
    	                }
    	                // Append the non-letter character as it is
    	                result.append(ch);
    	            }
    	        }
    	        
    	        // If the string ends with a word, reverse and append it
    	        if (currentWord.length() > 0) {
    	            result.append(currentWord.reverse());
    	        }
    	        
    	        // Convert the StringBuilder back to a string and print the result
    	        String output = result.toString();
    	        System.out.println("Output: " + output);
    	    }
    	
   
    
}
        
        
        
        
        
        
        
        
