class Person {

    private String name;
    private int age;

    static int count = 0;

    static final String COLLEGE_NAME = "Cambridge Institute of Technology";

    Person(String name, int age) {

        this.name = name;
        this.age = age;

        count++;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    void displayDetails() {

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    void displayDetails(String message) {

        System.out.println(message);
        displayDetails();
    }
}

class Student extends Person {

    private String usn;
    private String course;

    Student(String name, int age, String usn, String course) {

        super(name, age);

        this.usn = usn;
        this.course = course;
    }

    @Override
    void displayDetails() {

        System.out.println("Student Details");

        super.displayDetails();

        System.out.println("USN: " + usn);
        System.out.println("Course: " + course);
    }
}

class Faculty extends Person {

    private String subject;

    Faculty(String name, int age, String subject) {

        super(name, age);

        this.subject = subject;
    }

    @Override
    void displayDetails() {

        System.out.println("Faculty Details");

        super.displayDetails();

        System.out.println("Subject: " + subject);
    }
}

class Administrator extends Person {

    private String role;

    Administrator(String name, int age, String role) {

        super(name, age);

        this.role = role;
    }

    @Override
    void displayDetails() {

        System.out.println("Administrator Details");

        super.displayDetails();

        System.out.println("Role: " + role);
    }
}

public class CollegeTest {

    static class Department {

        String departmentName;

        Department(String name) {

            departmentName = name;
        }

        void displayDepartment() {

            System.out.println("Department: " + departmentName);
        }
    }

    public static void main(String[] args) {

        Person[] people = {

            new Student("Rahul", 20, "CSE101", "Data Science"),

            new Faculty("Anita", 35, "Java"),

            new Administrator("Ramesh", 45, "Principal")
        };

        for (Person p : people) {

            p.displayDetails();

            System.out.println();
        }

        Department d1 = new Department("Computer Science");

        d1.displayDepartment();

        System.out.println("College: " + Person.COLLEGE_NAME);

        System.out.println("Total People: " + Person.count);

        people[0].displayDetails("Overloaded Method Example");
    }
}