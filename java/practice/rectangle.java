public class rectangle
{
public static void main(String[] args)
{
area area1=new area();
area1.length=10;
area1.breadth=20;
area1.ar();
area1.perimeter();
}
}
class area
{
int length;
int breadth;
void ar(){
System.out.print("area is "+length*breadth);
System.out.println();
}

void perimeter(){

System.out.print("perimeter is"+2*(length+breadth));
}
}
