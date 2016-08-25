import java.io.*;
import java.util.*;
public class hunter4
{
public static void main(String[] args)
{
int[] n={1,2,6,9,9,1,3,2,6};
Map<Integer,Integer> map=new LinkedHashMap<Integer,Integer>();
for(int in:n)
{
if(map.containsKey(in))
map.put(in,map.get(in)+1);
else
map.put(in,1);
}
Set<Integer> set=map.keySet();
for(int s:set)
{
if(map.get(s)==1)
System.out.println(s);
}
}
}
