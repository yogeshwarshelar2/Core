package prepCall;

public class ArrayDublicate {
	
	public static void main(String[] args) {
		
		
		int [] arr= {1,1,2,3,4,5,6,7,8,9,9};
		
		
		System.out.println("Dublicates elements are:");
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=i+1;j<arr.length;j++)
			{
				
				if(arr[i]==arr[j])
				{
					System.out.print(" "+arr[j]);
					System.out.print(",");
				}
			}
		}
		
		
		
	}

}
/*
 * You have an integer array like - int arr[]={1,2,3,4............100}; 1
 * element is duplicate. find that duplicate value?
 */