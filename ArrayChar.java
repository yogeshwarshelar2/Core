package prepCall;

public class ArrayChar {
	public static void main(String[] args) {
		
		
		

		String [] str= {"i'm"," ","programer"};
		
		String str1="";
		
		StringBuffer stringBuffer=new StringBuffer();
		
		  for(int i=0;i<str.length;i++)
		  {
			stringBuffer.append(str[i]); 
		  }
		  
		  str1=stringBuffer.toString();

		 System.out.println(stringBuffer);
	}
}
