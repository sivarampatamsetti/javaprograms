public class object4
{
public static void main(String[] args)
{
int area;
rectangle rect=new rectangle();
rect.length=10;
rect.breadth=20;
System.out.println(rect.length);
System.out.println(rect.breadth);
area=rect.length*rect.breadth;
System.out.println(area);

}
}
class rectangle
{
int length;
int breadth;
}
