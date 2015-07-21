package com.collections;

public class MyTree {

	public static void main(String[] args) {
		
		CustomTree  customTree = new CustomTree();
		customTree.add(5);
		customTree.add(4);
		customTree.add(6);
		customTree.add(2);
		customTree.add(7);
		customTree.display();
}


}
 

class Tree{
	
	int data;
	Tree left;
	Tree right;
	
	
}

  class CustomTree{
	
	Tree root;
	
	 void add(int data){
		 root=insert(root, data);
	 }
	
	 Tree insert(Tree tree, int data) {
		 
		 if(tree==null){
			 tree = new Tree();
			 tree.data=data;
			 
		 }
		 else if(data < tree.data){
			 tree.left =insert(tree.left, data);
		 }
		 else if(data > tree.data){
			 tree.right= insert(tree.right,data);
		 }
		return tree;
	 }
	 
	 void display(Tree tree){
		 
		 if(tree !=null){
			 System.out.print(tree.data + " ");
		 }
		 else {
			 return;
		 }
		 display(tree.left);
		 display(tree.right);
		 
		 
	 }
	 
	 void display(){
		 display(root);
	 }
	 
	
}


