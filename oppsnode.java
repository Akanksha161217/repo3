import java.util.*;
class Node
{
	int data;
	Node left;
	Node right;

	Node(int data)
	{
		this.data=data;
	}
	void inorder(Node root)
	{
		if(root==null)
		return;
		else
		{
			inorder(root.left);
			System.out.print(root.data+"==>");
			inorder(root.right);
		}
	}
	void preorder(Node root)
	{
		if(root==null)
		return;
		else
		{
		System.out.print(root.data+"==>");
		preorder(root.left);	
		preorder(root.right);	
		}
	}
	void postorder(Node root)
	{
		if(root==null)
		return;
		else
		{
			postorder(root.left);	
			postorder(root.right);
			System.out.print(root.data+"==>");
		}
	}
}
class Test
{
	public static void main(String args[])
	{
		Node root=new Node(10);

		root.left=new Node(20);

		root.right=new Node(30);

		root.left.left=new Node(40);

		root.left.right=new Node(50);	

		root.right.left=new Node(60);

		root.right.right=new Node(70);

		root.inorder(root);
		System.out.println(" ");
		root.preorder(root);
		System.out.println(" ");
		root.postorder(root);

	}
	
}	
	
		