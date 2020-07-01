/*
 * Who has the majority? 
We hope you are familiar with using counter variables. Counting allows us to find how may times a certain element appears in an array or list.

You are given an array arr[] of size N. You are also given two elements x and y. Now, you need to tell which element (x or y) appears most in the array. In other words, return the element, x or y, that has higher frequency in the array. If both elements have the same frequency, then just return the smaller element.

NOTE :  We need to return the elements, not their counts.

Input Format:
The first line of input contains T denoting the number of testcases. T testcases follow. Each testcase contains 3 lines of input. The first line contains size of array denoted by n. The second line contains the elements of the array separated by spaces. The third line contains two integers x and y separated by a space.

Output Format:
For each testcase, in a newline, print the element with highest occurrence in the array. If occurrences are same, then print the smaller element.

Your Task:
Since, this is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function majorityWins() that takes array, n, x, y as parameters and return the element with highest frequency.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).

Constraints:
1 <= T <= 100
1 <= n <= 103
0 <= arri , x , y <= 108

Examples:
Input:
2
11
1 1 2 2 3 3 4 4 4 4 5
4 5
8
1 2 3 4 5 6 7 8
1 7

Output:
4
1

Explanation:
Testcase 1: n=11; elements = {1,1,2,2,3,3,4,4,4,4,5}; x=4; y=5
x frequency in arr is = 4 times
y frequency in arr is = 1 times
x has higher frequency, so we print 4.

Testcase 2: n=8; elements = {1,2,3,4,5,6,7,8}
 */
import java.util.Scanner;

public class Majority_Wins {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();
		}
		int x=in.nextInt();
		int y=in.nextInt();
		int count_x=0;
		int count_y=0;
		int res=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==x) {
				count_x++;
			}
			if(arr[i]==y) {
				count_y++;
			}
		}
		System.out.print("count x"+count_x);
		System.out.print("count y"+count_y);
		if(count_x>count_y) {
			res=x;
		}else if(count_y>count_x) {
			res=y;
		}
		else if(count_x==count_y) {
			if(x<y) {
				res=x;
			}else {
				res=y;
			}
		}
		System.out.println("result "+res);
	}
}
