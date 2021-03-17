
public class Program1 {
	public static void printArray(int[] array) {
		for(int k=0;k<array.length-1;k++) {
			System.out.println(array[k]+" ");
		}
	}
		public static void main(String[] args) {
			
		int[] ia= {1,2,3,4,5,6,7,8};
		int evenSize=0;
		int oddSize=0;
		for(int i=0;i<ia.length-1;i++) {
			if(ia[i]/2==0) 
				evenSize++;
			
				else
					oddSize++;
					
				}
		int[] even=new int[evenSize];
		int[] odd=new int[oddSize];
		int j=0,k=0;
		for(int i=0;i<ia.length-1;i++) {
			if(ia[i]/2==0) 
				even[j++]=ia[i];
			else
				odd[k++]=ia[i];
			}
		System.out.println(" ");
		printArray(even);
		System.out.println(" ");
		printArray(odd);
		}
		
		
		
	}

	



