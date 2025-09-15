
//maximum sum using slinding window protocol fixed length
import java.util.*;

class maximumsum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int k = 3;/// fixed size
        int sum = 0;
        for (int i = 0; i < k; i++) {// calculate first sum
            sum += arr[i];
        }
        int maxsum = sum;// initializing first sum as maxsum
        for (int i = k; i < n; i++) {// going onto further sum
            sum -= arr[i - k];// removing last element
            sum += arr[i];// adding a new element
            maxsum = Math.max(maxsum, sum);
        }
        System.out.println(maxsum);
    }
}