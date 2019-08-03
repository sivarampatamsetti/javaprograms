import java.util.*;
public class token
{
public static void main(String[] args)
{
String s="he is go,od bo,y";
System.out.println(s);
StringTokenizer q=new StringTokenizer(s);
StringTokenizer q=new StringTokenizer("s",",");
StringBuffer e=new StringBuffer(s);
System.out.println(q.countTokens());
System.out.println(e.capacity());
System.out.println(s.length());

}
}