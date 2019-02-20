import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String s = "aadddgghhhha";
	    char ch[] = s.toCharArray();
	    String str = "";
	    for (int i = 0; i < ch.length - 1; i++) {
	        if (ch[i] != ch[i + 1]) {
	            str += ch[i];
	        }
	    }
	    str += ch[ch.length - 1];
	    System.out.println(str);
	}
}