package testprograms;

public class SwapStringWithoutUsingThirdVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String name1="Amrish";
		String name2="Sukumaran";
		
		int length=name1.length();
		name1=name1+name2;
		
		name2=name1.substring(0,length);
		name1=name1.substring(length);
		
		System.out.println(name2);
		System.out.println(name1);

	}

}
