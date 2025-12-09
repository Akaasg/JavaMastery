//palindrome or not
import java.util.*;
public class palindrome
{
	public static void main(String[] args) {
		String ss="Akashhsa";
		String  s=ss.toLowerCase();
		boolean b=true;
		int left=0;
		int right=s.length()-1;
		while(left<right) {
			if(s.charAt(left) != s.charAt(right)) {
				b=false;
				break;
			}
			left++;
			right--;
		}
		if(b==true) {
			System.out.println("palindrome");
		}
		else {
			System.out.println(" Not palindrome");
		}
	}
}