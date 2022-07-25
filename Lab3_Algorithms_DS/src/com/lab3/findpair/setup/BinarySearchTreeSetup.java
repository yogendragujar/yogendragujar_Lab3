package com.lab3.findpair.setup;

import java.util.HashSet;


public class BinarySearchTreeSetup {
	public static class Node{
		int nodedata;
		Node left,right;
	}	
		static Node newNode(int nodeData) {
			Node temp = new Node();
			temp.nodedata = nodeData;
			temp.left= null;
			temp.right = null;
			return temp;
			
		}
		
		public Node insert(Node root, int key) {
			if(root == null) {
				return newNode(key);
			}
			
			if(key<root.nodedata) {
				root.left = insert(root.left,key);
			}else {
				root.right = insert(root.right,key);
			}
			
			return root;
		}
		
		public boolean findPairUtil(Node root, int sum, HashSet<Integer> set) {
			if(root == null) {
				return false;
			}
			if(findPairUtil(root.left,sum,set)) {
				return true;
			}
			
			if(set.contains(sum - root.nodedata)) {
				System.out.println("Pair is found ("+ (sum-root.nodedata)+","+root.nodedata+")");
				return true;
			}else {
				set.add(root.nodedata);
				return findPairUtil(root.right, sum, set);
				
			}
			
		}
		
		public void findPairWithGivenSum(Node root, int sum) {
			HashSet<Integer> set = new HashSet<Integer>();
			if(!findPairUtil(root,sum,set)) {
				System.out.println("Pair do not exist");
			}
		}
}
