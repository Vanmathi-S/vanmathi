import java.io.*;
import java.util.*;
public class hunter1
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] num=new int[100];
Set<Integer> set=new LinkedHashSet<Integer>();
for(int i=0;i<n;i++)
{
num[i]=sc.nextInt();
set.add(num[i]);
}
System.out.println(set);
}
}
