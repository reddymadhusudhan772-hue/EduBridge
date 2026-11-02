
class Student {

    private String usn, name;
    private int m1, m2, m3;

    static int count = 0;

    final int MAX_MARKS = 100;

    Student(String usn, String name, int m1, int m2, int m3) {

        this.usn = usn;
        this.name = name;

        if (m1 >= 0 && m1 <= MAX_MARKS &&
            m2 >= 0 && m2 <= MAX_MARKS &&
            m3 >= 0 && m3 <= MAX_MARKS) {

            this.m1 = m1;
            this.m2 = m2;
            this.m3 = m3;
        }

        else {
            System.out.println("Invalid marks");
        }

        count++;
    }

    String getUsn() {
        return usn;
    }

    String getName() {
        return name;
    }

    int getM1() {
        return m1;
    }

    int getM2() {
        return m2;
    }

    int getM3() {
        return m3;
    }

    int calculateTotal() {
        return m1 + m2 + m3;
    }

    double calculateAverage() {
        return calculateTotal() / 3.0;
    }

    void display() {

        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
    }

    void display(boolean result) {

        display();

        System.out.println("Total: " + calculateTotal());
        System.out.println("Average: " + calculateAverage());
    }

    Student getResult() {

        return new Student(usn, name, m1, m2, m3);
    }
}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student("101", "Rahul", 85, 90, 80);

        s1.display();

        System.out.println();

        s1.display(true);

        Student result = s1.getResult();

        System.out.println();

        System.out.println("Total Students: " + Student.count);
    }
}
