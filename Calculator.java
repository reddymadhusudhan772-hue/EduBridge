public class Calculator {
    void calculator (int a , int b){
        System.out.println("Sum: "+(a+b));
    }
    void calculator (double a, double b){
        System.out.println("Product: "+(a*b));
    }
    void calculator(int a , int b, int c){
        if(a>b){
            if(a>c){
                System.out.println("A is the largest number");
            }
            else{
                System.out.println("C is the largest number.");
            }
        }
        else{
            if(b>c){
                System.out.println("B is the largerst number.");
            }
            else{
                System.out.println("C is the largest number.");
            }
        }
    }
    void calculator(int a , double b){
        System.out.println(+(a-b));
    }
    public static void main(String[] args){
        Calculator obj=new Calculator();
        obj.calculator(5,65);
        obj.calculator(5.6, 2.5);
        obj.calculator(5,8,6);
        obj.calculator(5,8.6);
    }
}

