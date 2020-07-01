import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		int[] a=new int[n];
		int[] temp=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		int j=0;
		for(int i=n-1;i>=0;i--) {
			temp[j++]=a[i];
		}
		for(int i=0;i<n;i++) {
			a[i]=temp[i];
		}
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
