public class array2d
{
public static void main(String[] args)
{
int[][] f={{1,2,3},{23,3},{32,43,35,34,53,213}};
System.out.print(f[1][1]);
for(int row=0;row<f.length;row++)
{
for(int col=0;col<f[row].length;col++)
{
System.out.print(f[row][col]+"\t");
}
System.out.println();
}
String[][] fruit={{"apple","papaya","guava"},{"sweet","hot","bitter"},{"sexy","godgeous","bearing"}};
System.out.print(fruit[0][1]);
System.out.println();	
for(int row=0;row<fruit.length;row++)
{
for(int col=0;col<fruit[row].length;col++)
{
System.out.print(fruit[row][col]+"\t");
}
System.out.println();
}
}
}