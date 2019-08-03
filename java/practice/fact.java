public class fact
{
public static void main(String[] args)
{
Scanner q=new Scanner(System.in);
int i =q.nextINT();
int f;
f=fact(i);
System.out.print(i);
}
}
class rec
{
static int fact(int f)
{
if(f==0)
{
return 1;
}
else
{
return  (f*fact(f-1));
}
}
}

