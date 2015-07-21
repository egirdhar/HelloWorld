package InsertIntoOrder;

public class ReverseWords {

	public static void main(String[] args) {
		
	 String s = "Little I know about                     you";
	 String []ss= s.split("(\\s+)");
	 for(int i=ss.length-1;i>=0;i--) {
		 System.out.println(ss[i]); 
	 }
		 
	}
}
