import java.util.Scanner;


public class ReversingString {

	public static void main(String[] args) {
		System.out.println("enter the string to reverse");
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
StringBuffer sb=new StringBuffer(str);
		sb.reverse();
		System.out.println(sb);

	}

}
