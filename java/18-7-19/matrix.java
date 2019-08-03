public class matrix
{
public static void main(String[] args)
{
int a[][]={{1,2,3},{3,4,5},{3,5,6}};
int c[][];
int d[][];
int b[][]={{3,4,6},{4,8,8},{4,1,0}};
for(int row=0;row<a.length;row++)
{
for(int col=0;col<a[row].length;col++)
{
System.out.print(a[row][col]+"\t");
}
System.out.println();
}
System.out.println();
System.out.println();
System.out.println();
for(int row=0;row<b.length;row++)
{
for(int col=0;col<b[row].length;col++)
{
System.out.print(b[row][col]+"\t");
}
System.out.println();
}
}
}