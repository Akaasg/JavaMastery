import java.util.*;
public class Stringreverse
{
	public static void main(String[] args) {
		String s="Hello";
		String rs="";
		for(int i=s.length()-1; i>=0; i--) {
			rs=rs+s.charAt(i);
		}

		System.out.println(rs);
	}
}



--------------------------------------------------------------------------------
char arr[]=s.toCharArray();
int start=0;
int end=arr.length-1;
while(start<end) {
	char temp=arr[start];
	arr[start]=arr[end];
	arr[end]=temp;
	start++;
	end--;
}
String ss=new String(arr);
System.out.println(ss);
}
}
