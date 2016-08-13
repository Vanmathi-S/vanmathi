import java.io.*;
import java.util.*;
public class shortestpath
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the no.of elements");
int n=sc.nextInt();
String[] arr=new String[n];
for(int i=0;i<n;i++)
arr[i]=sc.nextInt();
System.out.println("enter  start");
int start=sc.nextInt();
System.out.println("enter end);
int end=sc.nextInt();
int mindis=Integer.MAX_VALUE;
int index=-1;
for(int i=0;i<arr.length;i++)
{
if(arr[i]==start||arr[i]==end)
{
if(index==-1)
{
index=i;
}
else
{
if(arr[i]!=arr[index])
{
int min=i-index;
if(min<mindis)
mindis=min;
}
index=i;
}
}
}
System.out.println(mindis);
}
}
