import java.util.ArrayList;
import java.util.List;


 class CustomQueue<T> {

	private int iPos;
	private int dPos;
	private List<T> elements;
	private int size;
	
	public CustomQueue(int size) {
		elements=new ArrayList<T>(size);
		this.size =size;
	}
	
	public void put (T newEle){
		System.out.println("--" +iPos);
		if(elements.size()>0 && iPos==dPos){
			System.out.println("Queue is full");
			return;
		}	
		System.out.println("adding ");
		elements.add(iPos , newEle);
		if(iPos == size-1){
			iPos=0;
		}
		else
			iPos++;
		
	}
	
	public T get(){
	
		if(elements.size() <=0){
			return null;
		}
		T elementToReturn=elements.get(dPos);
		if(dPos == size)
		dPos=0;
		else
		dPos++;
		return elementToReturn;
	}	
}
 
 
 
 public class ImplementQueue{ 
	 
	 public static void main(String[] args) {
		
		 CustomQueue<Integer> customQueue = new CustomQueue<Integer>(3);
	//	 System.out.println(customQueue.get());
		 customQueue.put(4);
		 customQueue.put(5);
		 customQueue.put(3);
		 customQueue.put(2);
		
		 System.out.println(customQueue.get());
		 customQueue.put(2);
		 
		 System.out.println(customQueue.get());
		 System.out.println(customQueue.get());
		 System.out.println(customQueue.get());
		 System.out.println(customQueue.get());
		 
	}
 }
