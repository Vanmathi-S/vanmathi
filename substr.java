import java.io.*;
import java.util.*;
public class substr
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
String s2=sc.nextLine();
if(s1.length()<s2.length())
{
if(s2.contains(s1))
System.out.println(true);
else
System.out.println(false);
}
else
System.out.println(false);
}
}
