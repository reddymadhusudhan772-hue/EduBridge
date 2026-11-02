class Employee {

    int empId;
    String name;
    double basicSalary;

    Employee(int id, String name, double salary) {

        empId = id;
        this.name = name;
        basicSalary = salary;
    }

    double calculateSalary() {

        return basicSalary;
    }

    void display() {

        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
}

class PermanentEmployee extends Employee {

    double allowance, bonus;

    PermanentEmployee(int id, String name, double salary,
                      double allowance, double bonus) {

        super(id, name, salary);

        this.allowance = allowance;
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {

        return basicSalary + allowance + bonus;
    }
}

class ContractEmployee extends Employee {

    int hoursWorked;
    double hourlyRate;

    ContractEmployee(int id, String name, double salary,
                     int hours, double rate) {

        super(id, name, salary);

        hoursWorked = hours;
        hourlyRate = rate;
    }

    @Override
    double calculateSalary() {

        return hoursWorked * hourlyRate;
    }
}

public class EmployeeTest {

    public static void main(String[] args) {

        PermanentEmployee p1 =
            new PermanentEmployee(101, "Rahul", 30000, 5000, 2000);

        ContractEmployee c1 =
            new ContractEmployee(102, "Aman", 0, 100, 200);

        Employee[] employees = {p1, c1};

        for (Employee e : employees) {

            e.display();

            System.out.println();
        }
    }
}