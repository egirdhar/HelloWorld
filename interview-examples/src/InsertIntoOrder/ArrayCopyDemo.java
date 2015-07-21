package InsertIntoOrder;

import java.util.ArrayList;

class ArrayCopyDemo {
    public static void main(String[] args) {
/*        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
			    'i', 'n', 'a', 't', 'e', 'd','n','m','r' };
        char[] copyTo = new char[7];

        System.arraycopy(copyFrom, 2, copyFrom, 9, 7);
        System.out.println(new String(copyFrom));
    }*/
    	
    int arr [] = new int [5];
    arr[0]=1;
    arr[1]=2;
    arr[2]=4;
    arr[3]=5;
    
    for(int s : arr){
    	System.out.print(s + " ");
    }
    System.out.println();
    int arr2[] = new int[5];
    arr2[2]=3;
    System.arraycopy(arr, 2, arr2, 3, 2);
    System.arraycopy(arr, 0, arr2, 0, 2);
    for(int s : arr2){
    	System.out.print(s + " ");
    	ArrayList<E>
    }
    
}
}