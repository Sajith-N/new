import java.util.Scanner;


public class LeastDigits {
	public static void main(String[] args) {
  System.out.println("enter the no to split");
  Scanner in=new Scanner(System.in);
  int a=in.nextInt();
  System.out.println("Say how many digits to split");
  int s=in.nextInt();
  int t=0,r=0;
  int[] arr=new int[10];
  while(a!=0)
  {
	  t=a%10;
	  arr[r]=t;
	  r++;
	  a=a/10;
	  
  }
  int k=r;
  for(int p=0;p<k-1;p++)
  {
	  if(arr[p]>arr[p+1])
	  {
		  int tmp;
		  tmp=arr[p];
		  arr[p+1]=arr[p];
		  arr[p]=tmp;
	  }
  }
  System.out.println("leat digit after splitting  is");
  for(int i=0;i<k-2;i++)
  {
	  System.out.print(+arr[i]);
  }
	
	}}
