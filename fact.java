import java.io.*;
import java.util.*;
public class fact
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int f=1;
if(n>=0)
{
for(int i=1;i<=n;i++)
f*=i;
System.out.println(f);
}
else
System.out.println(0);
}
}
