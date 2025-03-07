//Finding Maximum Difference in an Array
import java.util.*;
class Difference {
	private int[] elements;
	public int maximumDifference;
	Difference(int[] k) {
		this.elements = k.clone();
	}
	public void computeDifference() {
		Arrays.sort(elements);
		int m = elements.length;
		maximumDifference = elements[m - 1] - elements[0];
	}
}
class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of Array:");
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter element "+i+":");
			a[i] = sc.nextInt();
		}
		sc.close();
		Difference difference = new Difference(a);
		difference.computeDifference();
		System.out.print("The MaximumDifference is:"
		                 +difference.maximumDifference);
	}
}
