import java.util.Scanner;
public class Security {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the string to be encrypted:");
		String as=obj.nextLine();
		obj.close();
		String[] w=as.split(" ");
		for(int kz=0;kz<w.length;kz++)
		{
		char[] ch=w[kz].toCharArray();
		int len=ch.length;
		char k=ch[len-1];
		char p;
		char[] ge=new char[len];
		int code;
		int r;
		int count=0;
		do
		{
		if(k>96 && k<123)
		for(char c='a';c<=k;c++)
		{
			count++;
		}
		else if(k>64 && k<91)
		{
			for(char c='A';c<=k;c++)
		{
			count++;
		}
			}
		else {
			len=len-1;
			k=ch[len];
			continue;
		}
		}while(count!=0);
		for(int i=0;i<len-1;i++)
		{
	if(ch[i]>96 && ch[i]<123)
	{
		code=ch[i]-count;
		if(code>96)
		{
			p=(char)code;
		}
		else
		{
			r=code-96;
			code=122+r;
			p=(char)code;
		}
		ge[i]=p;
		System.out.print(ge[i]);
	}
	else
	{
		code=ch[i]-count;
		if(code>64)
		{
			p=(char)code;
		}
		else
		{
			r=code-64;
			code=90+r;
			p=(char)code;
		}
		ge[i]=p;
		System.out.print(ge[i]);
	}
		}
		System.out.print(k+" ");
		}
}

}
