public class prime{
public static void main(String args[]	)
{
int i=1,j=1,c=0,n=0;
while(n<25)
{
while(j<=i)
{
if(i%j==0)
{
c++;
j++;
}
if(c==2)
{
System.out.print("i");
n++;
}
i++;
}
}
}
}


