import java.util.Scanner;
public class Rectangle{
    double area(double length, double breadth){
        return  length * breadth;
    }
    public static  void  main(String[] args){
        Scanner sc= new Scanner(System.in);
        Rectangle obj= new Rectangle();
        System.out.print("Enter length: ");
        double length=sc.nextDouble();
        System.out.print("Enter breadth: ");
        double breadth=sc.nextDouble();
        double rectangleArea= obj.area(length, breadth);
        System.out.println("Area: "+rectangleArea);
        sc.close();
    }
}