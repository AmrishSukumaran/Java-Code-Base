package javaprograms;

public class SecondLargestAndSmallestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	int a[]= {8,6,9,5,2,1};
	int total=a.length;
	
	
		

	
	int max=a[0];
	
	for(int i=0;i<total;i++) {
		
		for(int j=i+1;j<total;j++) {
			
			if(a[i]>a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
			}
			
			
		}
		
		
	}
	
	System.out.println(a[total-2]);
	
		
	}
	
	
	

}
