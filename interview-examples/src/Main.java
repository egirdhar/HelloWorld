import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class Main {

	public static void main(String[] args) {
 
	char c []	 = new char [3];
	c[0]='a';
	c[1]='b';
	c[2]='c';
	
	
	char c1[]	 = new char [3];
	c1[0]='d';
	c1[1]='e';
	c1[2]='f';
	
	
	char c2[]	 = new char [3];
	c2[0]='g';
	c2[1]='h';
	c2[2]='i';

	List<String> list = new ArrayList<String>();
	list.add(new String(new char[]{c[0]}));
	list.add(new String(new char[]{c[1]}));
	list.add(new String(new char[]{c[2]}));
      
    list= add(list, c1);
    list= add(list, c2);
    System.out.println(list);

	}
	
  public static List<String> add(List<String> list, char[] c) {
	  
	  List<String> returnedList= new ArrayList<String>();
	  for(String s : list){
		  for(int j=0;j<c.length;j++){
			  String s2=s.concat(new String(new char[]{c[j]} ));
			  returnedList.add(s2);
		  }
	  }
	  
	  return returnedList;
	  
  }
}


