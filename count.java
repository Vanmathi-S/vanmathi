import java.io.*;
import java.util.*;
public class count
{
public static coid main(String[] args)
{
Scanner sc=new Scanner(System.in);
String input=sc.nextLine();
int len=input.length();
int a=0;
String sum="";
char out="";
for(int i=0;i<len;i++)
{
  if(Character.isAlphabetic(input.charAt(i)))
  out=input.charAt(i);
  char c=input.charAt(i);
 else if(Character.isDigit(c))
  {
    sum=sum+c;
  }
  else
  {
    if(!sum.equals("")
  {
    for(int j=0;j<sum;j++)
    System.out.println(out);
  }
  }
}

}
}
