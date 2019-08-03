class coprime 
{
public static void main(String[] args)
{
int a=4,b=5,c;
c=a%b;
while(c!=0)
{
a=b;
b=c;
c=a%b;
}
if(b==1)
{
System.out.print("coprimes");
}
}
}