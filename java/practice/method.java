public class method
{
public static void main(String[] args)
{

person person3=new person();
person person2=new person();
person person1=new person();
person3.name="warren";
person2.name="walton";
person1.name="hari";
person2.age=72;
person3.age=75;
person1.age=18;
person1.hello();
person1.warning();
System.out.println();
person2.hello();
person2.warning();
System.out.println();
person3.hello();
person3.warning();
}

}
class person
{
String name;
int age;
void hello()
{
System.out.println("hello!,my name is "+name+  "  and my age is "+age );
System.out.println();
}
void warning()
{
System.out.print(":-) mind  u r business fu***!  "+"\t");
}
}