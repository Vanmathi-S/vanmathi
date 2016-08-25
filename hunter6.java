import java.io.*;
import java.util.*;
public class pro1
{
public static void main(String[] args)
{
int[] arr={1,5,6,8,9,0,5,1,3,56};
for(int i=0;i<arr.length;i++)
{
for(int j=i+1;j<arr.length;j++)
{
if(arr[i]==arr[j])
{
System.out.println(arr[i]);
break;
}
}
}
}
}
