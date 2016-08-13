import java.io.*;
import java.util.*;
public class count
{
public static coid main(String[] args)
{
Scanner sc=new Scanner(System.in);
String input=sc.nextLine();
String l="";
String n="";
int nn=0;
String out="";
for(int i=0;i<input.length();i++)
{
if(Character.isAlphabetic(input.charAt(i)))
{
l=input.charAt(i);
}
if(Character.isDigit(input.charAt(i)))
{
n=n+input.charAt(i)+"";
}
for(int j=0;j<n;j++)
System.out.println(l);
}
}
