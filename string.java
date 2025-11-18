public class string {
    public static void main(String[] args) {
        String s = "Akash";
        String s1 = "Akash";
        String s2 = new String("Akash");
        s = s + " ichigo";
        String s3 = "Akash ichigo";
        System.out.println(s == s1);
        System.out.println(s == s2);
        System.out.println(s.equals(s2));
        System.out.println(s);
        System.out.println(s == s3);
        System.out.println(s.equals(s3));
    }

}
