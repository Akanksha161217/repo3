import java.util.*;

class Test {
    public static void main(String args[]) {
        int[] arr = new int[5];
        int i, n = 5, el;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the element to search:");
        el = sc.nextInt();
        
        System.out.println("Enter " + n + " elements:");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        for (i = 0; i < n; i++)
	 {
            if (el == arr[i]) 
	    {
                System.out.println("Position: " + (i + 1)); 
                break;
            }
        }
        
        if (i == n)
	 { 
            System.out.println("Element not Found");
        }
    }
}
