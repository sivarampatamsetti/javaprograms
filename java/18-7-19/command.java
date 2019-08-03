public class command
{
public static void main(String[] args)
{
int c;
c=Integer.parseInt(args[0]);
for(int i=0;i<10;i++)
{
System.out.println(c*i);

}
if(args.length>0)
{
System.out.println("command line arguments are");
for(String val:args)
{
System.out.print(val);
}

}
else {
System.out.print("no command line argguments");
}
}
}