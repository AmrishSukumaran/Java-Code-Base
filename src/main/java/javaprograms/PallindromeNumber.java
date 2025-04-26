package javaprograms;

public class PallindromeNumber {

	
	
	public boolean pallindrome(int x) {
		int temp,sum=0,reminder;
		
		
		if((x<0) || ((x!=0) && x%10==0)) {
			return false;
		}
		temp=x;
		while(x>0) {
			reminder=x%10;
			sum=(sum*10)+reminder;
			x=x/10;
			
		}
		if(temp!=x) {
			
		return true;
		}
		else {
			return false;
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PallindromeNumber p=new PallindromeNumber();
		
		boolean status=p.pallindrome(121);
		
		System.out.println(status);
		

	}

}
