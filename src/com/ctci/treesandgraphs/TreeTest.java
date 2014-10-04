/**
 * 
 */
package com.ctci.treesandgraphs;

/**
 * @author Dany
 *
 */
public class TreeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode root=new TreeNode(15);
		root.insert(root, 6);
		root.insert(root, 9);
		root.insert(root, 18);
		root.inOrderTraversal(root);

	}

}
