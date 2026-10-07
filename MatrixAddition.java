import java.util.Scanner;

public class MatrixAddition {
public float sum (int a, float b ){
return (float) a+b;
}
public int sum(int a){
    return a*a;
}
public static void main(String[] args){
    MatrixAddition obj = new MatrixAddition();
    int a=4;
    float b = 10.5f;
    System.out.println("Sum is: "+obj.sum(a,b));
    System.out.println("Sum is: "+obj.sum(a));
}
}