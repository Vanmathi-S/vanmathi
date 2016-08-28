import java.io.*;
import java.util.*;
public class coinpossible
{
  public static void main(Stirng[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    ArrayList<Integer> al=new ArrayList<Integer>();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
    a[i]=sc.nextInt();
    al.add(a[i]);
    }
    Collections.sort(al);Collections.reverse(al);
    int sum=sc.nextInt();
    int i=0;
    int poss=0;
    while(sum>=0)
    {
    if(sum/al.get(i)>0)
    {
    poss+=sum/al.get(i);
    sum=sum-al.get(i);
    }
    else if(sum>0)
    i++;
    else if(sum==0)
    break;
    }
   System.out.println(poss);
  }
}
