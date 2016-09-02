import java.io.*;
import java.util.*;
public class player148
{
  public static void main(String[] args)
  {
    	Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int n1=sc.nextInt();
    int[] a=new int[n];
    List<Object> list=new ArrayList<Object>();
    for(int i=0;i<n;i++)
    {
    a[i]=sc.nextInt();
    }
    for(int i=0;i<n;i=i+n1)
    {
    List<Integer> list1=new ArrayList<Integer>();
    for(int j=i;j<i+n1;j++)
    list1.add(a[j]);
    Collections.reverse(list1);
    Object[] arr=list1.toArray();
    for(int k=0;k<arr.length;k++)
    list.add(arr[k]);
    }
    System.out.println(list);
  }
}
