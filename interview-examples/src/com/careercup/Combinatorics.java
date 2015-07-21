package com.careercup;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Combinatorics {

	public static void main(String[] args) {
		int A [] = {1,1,1,2,3};
		List<List<Integer>> result =new Combinatorics().findAllCombinations(A);
		for(List<Integer> comb : result){
			System.out.print( comb + " ");
		}
	}
	
	private static class Node{
		int lastIndex = 0;
		List<Integer> currentList;
		public Node(int lastIndex, List<Integer> list) {
			this.lastIndex = lastIndex;
			this.currentList = list;
		}
		public Node(Node n) {
			this.lastIndex = n.lastIndex;
			this.currentList = new ArrayList<Integer>(n.currentList);
		}
	}
	public List<List<Integer> > findAllCombinations(int [] input) {
		List<List<Integer>> resultList = new ArrayList<List<Integer>>();
		LinkedList<Node> queue = new LinkedList<Node>();
		int n = input.length;
		ArrayList<Integer> temp = new ArrayList<Integer>();
		temp.add(input[0]);
		queue.add(new Node(0, temp));
		// add all different integers to the queue once.
		for(int i=1;i<n;++i) {
			if(input[i-1] == input[i]) continue;
			temp = new ArrayList<Integer>();
			temp.add(input[i]);
			queue.add(new Node(i, temp));
		}
		// do bfs until we have no elements
		while(!queue.isEmpty()) {
			Node node = queue.remove();
			if(node.lastIndex+1 < n) {
				Node newNode = new Node(node);
				newNode.lastIndex = node.lastIndex+1;
				newNode.currentList.add(input[node.lastIndex+1]);
				queue.add(newNode);
			}
			for(int i=node.lastIndex+2;i<n;++i) {
				if(input[i-1] == input[i]) continue;
				// create a copy and add extra integer
				Node newNode = new Node(node);
				newNode.lastIndex = i;
				newNode.currentList.add(input[i]);
				queue.add(newNode);
			}
			resultList.add(node.currentList);
			//break;
		}
		return resultList;
	}
}