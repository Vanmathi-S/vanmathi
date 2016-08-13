import java.io.*;
import java.util.*;
public class shortestpath
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
int start=sc.nextInt();
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
