package javaprograms;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=1;
		int flag=0;
		if(num==0||num==1) {
			flag=1;
			
		}
		
	for(int i=2;i<=num/2;i++) {
		if(num%i==0) {
			flag=1;
			break;
		}
	}
	if(flag==0) {
		System.out.println("prime");
	}else {
		System.out.println("not prime");
	}

	}

}
