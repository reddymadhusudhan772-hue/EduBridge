import  java.util.Scanner;
class BankAccount {
    double balance= 1000;
    void deposite(double amount){
        if(amount<=0){
            System.out.println("Please Enter Valid Amount");
        }
        else{
            balance+=amount;
        }
    }
    void withdraw(double amount){
        if(balance>=amount){
            balance-=amount;
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        BankAccount user1= new BankAccount();
        System.out.println("Enter your name: ");
        String name=sc.nextLine();
        System.out.println("1. Deposite Amount");
        System.out.println("2. Withdraw Amount");
        System.out.println("3. Check Balance");
        int choice= sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Enter amount: ");
                double depositeAmount= sc.nextDouble();
                user1.deposite(depositeAmount);
                System.out.println("Your Balance: "+user1.balance);
                break;
            case 2:
                System.out.println("Enter amount: ");
                double withdrawAmount= sc.nextDouble();
                user1.withdraw(withdrawAmount);
                System.out.println("Your Balance: "+user1.balance);
                break;
            case 3:
                System.out.println("Your Balance: "+user1.balance);
                break;
            default:
                System.out.println("Invalid Option");
        }
        sc.close();
    }
}