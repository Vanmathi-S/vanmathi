import java.io.*;
import java.util.*;
public class primecount
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int input1=sc.nextInt();
int input2=sc.nextInt();
int count=0;
if(input1>=0 && input1<=input2 && input2<=32000)
{
for(int i=input1;i<=input2;i++)
{
boolean flag=false;
for(int j=2;j<i;i++)
{
if(i%j!=0)
flag=true;
else
{
flag=false;
break;
}
}
if(flag)
count++;
}
System.out.println(count);
}
else
System.out.println("boundary condition exceeds");
}
}
