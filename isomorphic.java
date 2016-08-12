import java.io.*;
import java.util.*;
public class isomorphic
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String ss=sc.nextLine();
String o="";
String c="";
boolean flag=true;
if(s.length()==ss.length())
{
for(int i=0;i<s.length();i++)
{
if(Character.isAlphabetic(s.charAt(i))&&Character.isAlphabetic(ss.charAt(i)))
{
o=s.replace(s.charAt(i),ss.charAt(i));
s=o;
}
else
{
flag=false;
break;
}
}
if(flag)
{
if(o.equals(ss))
System.out.println("true");
else
System.out.println("false");
}
else
System.out.println("false");
}
}
}
