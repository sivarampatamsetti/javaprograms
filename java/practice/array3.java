public class array3
{
public static void main(String[] args)
{
int a[]={1,2,3,4,5};
int sum=0;
System.out.println("array values are"+a[0]  +"," +   a[1]+ ","  +a[2]+ ","+a[3]+","+a[4]);
for(int s:a)
{
System.out.println("array elements are  "+s);
}
for(int x:a)
{
System.out.println("array elements are  "+x);
sum=sum+x;
}
System.out.println(sum);
}
}