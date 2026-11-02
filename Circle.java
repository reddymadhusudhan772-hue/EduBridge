import java.util.Scanner;
public class Circle{
    double area(double radius){
        double areaOfCircle= 3.14 * radius*radius;
        return  areaOfCircle;
    }
    double circumference(double radius){
        double circumferenceOfCircle= 2 * 3.14 * radius;
        return circumferenceOfCircle;
    }
    public  static void main(String[] args){
        Circle obj=new Circle();
        Scanner sc= new Scanner(System.in);
        System.out.println("\t1. Calculate Area of the circle");
        System.out.println("\t2. Calculate Circumference");
        System.out.print("Enter your choice: ");
        int choice= sc.nextInt();
        if(choice==1){
            System.out.print("Enter the radius of the circle: ");
            double radius=sc.nextDouble();
            double circleArea= obj.area(radius);
            System.out.println(circleArea);
        }
        else if(choice==2){
            System.out.print("Enter the radius of the circle: ");
            double radius=sc.nextDouble();
            double circleCircumference= obj.circumference(radius);
            System.out.println(circleCircumference);
        }
        else{
            System.out.println("Invalid Choice");
        }
        sc.close();

    }
}