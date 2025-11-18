import java.util.*;

public class stringbuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Akash");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.charAt(2));
        System.out.println(sb.append(" ichigo"));
        System.out.println(sb.reverse());
        System.out.println(sb.replace(2, 5, "aza"));

    }
}
