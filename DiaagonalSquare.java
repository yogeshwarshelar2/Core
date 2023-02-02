package prepCall;

public class DiaagonalSquare {
	
	public static void main(String[] args) {
		
		
		int [][]arr= {{1,2,3},{4,5,6},{7,8,9}};
		
		int n=arr.length;
		int temp=0;
		
		         for(int i=n;i>=0;i--)
		         {
		        	 
		        	 for(int j=0;j<n;j++)
		        	 {
		        		  if(i==j)
		        		  {
		        			  temp=arr[i][j]*arr[i][j];
		        			  System.out.print(" "+temp);
		        		  }
		        		 
		        	 }
		        	 
		        	 System.out.println("");
		         }
		         
		         
	}

}
