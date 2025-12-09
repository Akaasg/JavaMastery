// Second largest in an array
import java.util.*;
class Secondlargest
{
	static void sorting(int arr[]) {
		Arrays.sort(arr);
		int size=arr.length;
		System.out.println(arr[size-2]);
	}
	static void withoutsorting(int arr[]) {
		int max = Integer.MIN_VALUE;
		int secondmax = Integer.MIN_VALUE;
		for(int q :arr) {
			if(q>max) {
				secondmax=max;
				max=q;
			}
			else if(q>secondmax && q != max) {
				secondmax=q;
			}
		}
		System.out.println(secondmax);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int arr[]= {12, 35, 1, 10, 34, 1,35};
		System.out.println("Click 1 for using Sorting");
		System.out.println("Click 2 for without using sorting");
		System.out.println("Enter Your Choice :");
		int n=s.nextInt();
		Secondlargest obj=new Secondlargest();
		if(n==1) {
			obj.sorting(arr);
		}
		else {
			obj.withoutsorting(arr);
		}
	}
}