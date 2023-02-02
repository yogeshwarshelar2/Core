package prepCall;

public class GCClass {

	public static void main(String[] args) {
		
		
		GCClass  gcClass=new GCClass();
		
		gcClass=null;
		//  System.gc();
		
		Runtime.getRuntime().gc();
		
	 System.out.println("Main method is done");
		  
		  	
		
	}
	
	@Override
	protected void finalize() throws Throwable {
		
		System.out.println("Fianlizes method is done");
	}
}
