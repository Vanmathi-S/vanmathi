import java.io.*;
import java.util.*;
public class uniqueind
{
public static void main(String[] args)
{
int[] arr={-3,1,-1,3,4,5};
boolean flag=true;
for(int i=0;i<arr.length;i++)
{
if(arr[i]==i)
{
System.out.print(arr[i]+" ");
flag=false;
}
}
if(flag)
System.out.println("there are no number match with its index");
}
}
