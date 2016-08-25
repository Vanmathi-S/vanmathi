import java.io.*;
import java.util.*;
public class deletekdigit
{
public static void main (String[] args)
{
int num=24536;
int k=3;
if(num>0&&k>0)
{
String s =Integer.toString(num);
int[] ar=new int[s.length()];
for(int i=0;i<s.length();i++)
ar[i]=s.charAt(i)-'0';
Arrays.sort(ar);
for(int j=0;j<s.length()-k;j++)
System.out.println(ar[j]);
}
else
System.out.println("incorrect data");
}
}
