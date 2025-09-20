import java.util.*;

class nuarray {
    int prefix[];

    public nuarray(int arr[]) {
        int n = arr.length;
        prefix = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + arr[i];
        }
    }

    public void sum(int x, int y) {
        System.out.println(prefix[y + 1] - prefix[x]);
    }
}

class prefixsum {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Enter x and y");
        int x = s.nextInt();
        int y = s.nextInt();
        nuarray obj = new nuarray(arr);
        obj.sum(x, y);

    }
}
