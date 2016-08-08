import java.util.Scanner;


public class PanagramChecker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the string you want to check");
Scanner in=new Scanner(System.in);
String str=in.nextLine();
String c="";
for(int i=0;i<26;i++)
{
	if((str.contains("A")||str.contains("a")) &&(str.contains("B")||str.contains("b")) && (str.contains("C")||str.contains("c"))&& (str.contains("D")||str.contains("d")) && (str.contains("E")||str.contains("e"))&& (str.contains("F")||str.contains("f")) && (str.contains("G")||str.contains("g")) && (str.contains("H")||str.contains("h"))&&(str.contains("I")||str.contains("i")) && (str.contains("J")||str.contains("j")) && (str.contains("K")||str.contains("k")) && (str.contains("L")||str.contains("l"))&& (str.contains("M")||str.contains("m")) && (str.contains("N")||str.contains("n")) && (str.contains("O")||str.contains("o")) && (str.contains("P")||str.contains("p"))&& (str.contains("Q")||str.contains("q"))&&(str.contains("R")||str.contains("r"))&&(str.contains("S")||str.contains("s"))&&(str.contains("T")||str.contains("t"))&&(str.contains("U")||str.contains("u"))&&(str.contains("V")||str.contains("v"))&& (str.contains("W")||str.contains("w"))&&(str.contains("X")||str.contains("x"))&&(str.contains("Y")||str.contains("y"))&&(str.contains("Z")||str.contains("z")))
	{
		System.out.println("it is a panagram");
		break;
	}
	else
	{
		System.out.println("it is not a panagram");
		break;
	}
}
	}

}
