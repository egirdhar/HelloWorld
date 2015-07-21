package InsertIntoOrder;

public class Demo {

	public static void main(String[] args) {
		int a [] = new int [5];
		
		a[0]=2;
		a[1]=5;
		a[2]=7;
		a[3]=9;
		
		int x =6;
		int pos=0;
		/*	for(int i=0;i<5 && a[i]<=x;i++){
			pos=i;
		}
		
		System.arraycopy(a, pos-1, a, pos, 5-pos-1);
		for(int j : a){
			System.out.print(j + " ");
		}*/
		
	/*	while(pos<5 && a[pos]<=x){
			++pos;
		}
		System.arraycopy(a, pos, a, pos+1, 5-pos);
		a[pos]=x;
		for(int j : a){
			System.out.print(j + " ");
		}*/;
//		insert(a, 5, 6);
		
	 int b [] = new int [5];
	 b[0]=0;
	 b[1]=1;
	 b[2]=3;
	 b[3]=4;

	 for( int s : b )
		 System.out.print( s + " ");
	 System.arraycopy(b, 2, a, 3, 2);
	 System.out.println();
	 b[2]=2;
	 for( int s : b )
		 System.out.print( s + " ");
	
	 
	}
	
	
		static void insert(int[] a, int n, int x) {
			  // preconditions: a[0] <= ... <= a[n-1], and n < a.length;
			  // postconditions: a[0] <= ... <= a[n], and x is among them;
			  int i = 0;
			  while (i < n && a[i] <= x) {
			    ++i;
			  }
			  System.arraycopy(a, i, a, i+1, n-i);  // copies a[i..n) into
	       a[i]=x;
	       
	       for(int j : a){
				System.out.print(j + " ");
			}
		}
	}
	

