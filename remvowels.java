import java.io.*;
import java.util.*;
public class remvowels
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String input=sc.nextline();
String[] vowels={"a","e","i","o","u"};
StringBuffer sb=new StringBuffer(input);
if(input!=null || input!="")
sb=sb.reverse();
else
sb="0";
System.out.println(sb);
for(int i=0;i<sb.length();i++)
{
if(sb.toString().contains(vowels.charAt(i)))
sb.deletecharAt(i);
else
System.out.println("no vowels");
}
System.out.println(sb);
}
}
