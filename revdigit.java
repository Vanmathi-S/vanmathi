import java.io.*;
import java.util.*;
public class revdigit
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String input=String.valueOf(n);
if(input.length()>1)
{
StringBuffer sb=new StringBuffer(input);
sb=sb.reverse();
n=Integer.parseInt(sb.toString());
}
System.out.println(n);
}
}
