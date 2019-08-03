import java.util.*;
public class sort {
public static void main(String[] args)
{
Integer[] ar={45,56,455,456,5667,887,666,};
Arrays.sort(ar);
System.out.printf("after sorting array is %s",Arrays.toString(ar));
Arrays.sort(ar,Collections.reverseOrder());
System.out.printf("after sorting in descending order is %S",Arrays.toString(ar));
}
}
