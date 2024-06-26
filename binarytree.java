import java.util.*;
class Node
{
	int data;
	Node left;
	Node right;
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
		Node root=new Node();
		root.data=10;

		root.left=new Node();
		root.left.data=20;

		root.right=new Node();
		root.right.data=30;

		root.left.left=new Node();
		root.left.left.data=40;

		root.left.right=new Node();	
		root.left.right.data=50;

		root.right.left=new Node();
		root.right.left.data=60;

		root.right.right=new Node();
		root. right.right.data=70;

		root.inorder(root);
		System.out.println(" ");
		root.preorder(root);
		System.out.println(" ");
		root.postorder(root);

	}
	
}	
	
		