// You have been given a singly linked list of integers along with an integer 'N'. Write a function to append the last 'N' nodes towards the front of the singly linked list and returns the new head to the list.
// Input format :
// The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

// The first line of each test case or query contains the elements of the singly linked list separated by a single space. 

// The second line contains the integer value 'N'. It denotes the number of nodes to be moved from last to the front of the singly linked list.
// Remember/Consider :
// While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element.
// Output format :
// For each test case/query, print the resulting singly linked list of integers in a row, separated by a single space.

// Output for every test case will be printed in a seperate line.
// Constraints :
// 1 <= t <= 10^2
// 0 <= M <= 10^5
// 0 <= N < M
// Time Limit: 1sec

// Where 'M' is the size of the singly linked list.
// Sample Input 1 :
// 2
// 1 2 3 4 5 -1
// 3
// 10 20 30 40 50 60 -1
// 5
// Sample Output 1 :
// 3 4 5 1 2
// 20 30 40 50 60 10

public class Solution {
    
    public static int length(LinkedListNode<Integer> head){
	   
        int count=0;
        
        while(head != null) {
            
            count++;
            
            head = head.next;
        }
        
        return count;
	}

	public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
		//Your code goes here

        if(n > length(head))
            return null;
        
        if(n == 0)
            return head;
        
        LinkedListNode<Integer> temp = head;
		LinkedListNode<Integer> tail = head;
        
        for(int i=0; i<length(head)-1; i++) {
            
            if(i < length(head)-n-1)
	            temp = temp.next;
            
            tail = tail.next;
        }
        
        LinkedListNode<Integer> temp1 = temp.next;
        
        temp.next = null;
        tail.next = head;
        head = temp1;
        
        return head;        
	}

}
