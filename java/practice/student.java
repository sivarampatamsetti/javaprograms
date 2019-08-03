public class student
{
public static void main(String[] args)                                                                       
{
details details1=new details();
//details details2=new details();
details1.name="sivaram";
details1.id=18;
details1.ar();
details.ar1();

}
}
class details
{
int a=10;
String name;                                                                                                        
int id;
void ar(){
System.out.print("details are "+name +"," +id);
System.out.println();
}
void ar1(int x)
{
a=x;
System.out.print(a);
}

/*void perimeter(){

System.out.print("perimeter is"+2*(length+breadth));
}*/
}
