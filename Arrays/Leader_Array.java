import java.util.Scanner;

public class Leader_Array {

	void printLeader(int arr[],int n) {
		int max_from_right=arr[n-1];
		System.out.print(max_from_right+" ");
		for(int i=0;i<n;i++) {
			if(max_from_right<arr[i]) {
				max_from_right=arr[i];
				System.out.printn(max_from_right+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		int n=in.nextInt();
		int res=0;
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();
		}
		Leader_Array lead=new Leader_Array();
		lead.printLeader(arr, n);
	}

}
