class Object 
{ 
    int a, b; 
  
    Object(int i, int j) 
    { 
        a = i; 
        b = j; 
    } 
}
public class objectparameter
{ 
    public static void main(String args[]) 
    { 
        Object ob1 = new Object(10, 2); 
        Object ob2 = new Object(1, 22); 

  
        System.out.println("at first parameter" + ob1); 
        System.out.println("at second parameter"+ ob2); 
    } 
} 