public class sort
{
public static void main(String[] args)
{
int ar[]={4,56,45,78,31,45};
int i,j,min,s,t;
for(i=0;i<ar.length;i++)
{
min=1000000;
for(j=i;j<ar.length;j++)
{
if(ar[j]<min)
{
min=ar[j];
s=j;
}
}
t=ar[i];
ar[i]=ar[s];
ar[s]=t;
}
for(int x:ar)
{
System.out.println(x);
}
}
}