package com.lab3.findpair.main;

import com.lab3.findpair.setup.BinarySearchTreeSetup;
import com.lab3.findpair.setup.BinarySearchTreeSetup.Node;

public class BinarySearchTreeFindPairDriver {

	public static void main(String[] args) {
		BinarySearchTreeSetup fp = new BinarySearchTreeSetup();
		Node root = null;
		root = fp.insert(root,40);
		root = fp.insert(root,20);
		root = fp.insert(root,60);
		root = fp.insert(root,10);
		root = fp.insert(root,30);
		root = fp.insert(root,50);
		root = fp.insert(root,70);
		
		int sum = 130;
		fp.findPairWithGivenSum(root,sum);
	}

}
