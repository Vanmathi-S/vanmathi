import java.io.*;
import java.util.*;
public class longpre
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String[] str=new String[100];
String first="";
String other="";
for(int i=0;i<n;i++)
{
str[i]=sc.next();
}
if(str.length>0)
first=str[0];
else if(str.length.equals(""))
System.out.println("empty string");
for(int i=0;i<str.length;i++)
{
other=a[i];
for(j=0;j<Math.min(first.length(),a[i].length());j++)
{
if(first.charAt(j)!=other.charAt(j))
break;
}
first=a[i].subString(0,j);
}
System.out.println(first);
}
}
