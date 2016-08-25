import java.io.*;
import java.util.*;
public class hunter1
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String str[]=new String[n];
Map<String,Integer> map=new LinkedHashMap<String,Integer>();
for(int i=0;i<n;i++)
str[i]=sc.nextLine();
for(String i:str)
{
  if(map.containsKey(i))
  map.put(i,map.get(i)+1);
  else
  map.put(i,1);
}
Set<String> set=mapkeySet();
for(String i:set)
{
  if(map.get(i)>1)
  System.out.print(i+" ");
}
}
}
