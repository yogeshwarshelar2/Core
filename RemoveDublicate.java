package prepCall;

public class RemoveDublicate {

	
	public static void main(String[] args) {
		
		
		int [] arr= {1,2,2,3,4,5,5,6,1};
		
		int l=arr.length;
		
		       for(int i=0;i<l;i++)
		       {
		    	   for(int j=0;j<=i;j++)
		    	   {
		    		   if( arr[i]==arr[j] && (i!=j))
		    		   {
		    			   System.out.print(" "+arr[i]);
		    			   break;
		    		   }
		           }
		       }
	}
}
