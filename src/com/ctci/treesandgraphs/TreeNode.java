package com.ctci.treesandgraphs;






public class TreeNode {

	public TreeNode left;
	public TreeNode right;
	public int data;
	public TreeNode(int data)
	{
		this.data=data;
	}
	
	public void insert(TreeNode root, int data)
	{
		TreeNode newNode=new TreeNode(data);
		if(root==null)
			return;
		if(root.left==null&&data<root.data)
			root.left=newNode;
		if(root.right==null&&data>root.data)
			root.right=newNode;
		if(data<root.data)
			insert(root.left, data);
		if(data>root.data)
			insert(root.right, data);
	}
	
	public void inOrderTraversal(TreeNode root)
	{
		if(root==null)
			return;
		inOrderTraversal(root.left);
		System.out.println("Node value : "+root.data);
		inOrderTraversal(root.right);
	}
	{
		
	}

}
