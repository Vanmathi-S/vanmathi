import java.util.*;
import java.io.*;
public class reverse
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
StringBuffer sb=new StringBuffer(s);
if(s!=""&&s!=null)
System.out.println(sb.reverse());
else
System.out.println("empty");
}
}
