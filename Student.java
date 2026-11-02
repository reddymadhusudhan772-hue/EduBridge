public class Student {
    private String USN;
    private String name;
    private int sub1Marks;
    private int sub2Marks;
    private int sub3Marks;
    public Student(String usn, String name, int m1, int m2, int m3) {
        this.USN = usn;
        this.name = name;
        this.sub1Marks = m1;
        this.sub2Marks = m2;
        this.sub3Marks = m3;
    }
    String getUSN() {return USN;}
    String getName() {return name;}
    int getSub1Marks() {return sub1Marks;}
    int getSub2Marks() {return sub2Marks;}
    int getSub3Marks() {return sub3Marks;}
    int calculateTotal() {return sub1Marks + sub2Marks + sub3Marks;}
    double calculateAverage() {return calculateTotal() / 3.0;}
    public void display() {
        System.out.println("USN: " + USN);
        System.out.println("Name: " + name);
    }
    public void display(boolean showResult) {
        display();
        if (showResult) {
            System.out.println("Subject 1 marks: " + sub1Marks);
            System.out.println("Subject 2 marks: " + sub2Marks);
            System.out.println("Subject 3 marks: " + sub3Marks);
            System.out.println("Total: " + calculateTotal());
            System.out.println("Average: " + calculateAverage());
        }
    }
    public ResultSummary getResultSummary() {
        return new ResultSummary(USN, name, calculateTotal(), calculateAverage());
    }
    public static class ResultSummary {
        private String USN;
        private String name;
        private int total;
        private double average;
        private ResultSummary(String usn, String name, int total, double average) {
            this.USN = usn;
            this.name = name;
            this.total = total;
            this.average = average;
        }
        String getUSN() {return USN;}
        String getName() {return name;}
        int getTotal() {return total;}
        double getAverage() {return average;}
    }
    public static void main(String[] args) {
        Student student = new Student("1AJ25CD030", "Mohammed Saad", 90, 87, 95);
        System.out.println("Student details:");
        student.display();
        System.out.println("\nStudent result:");
        student.display(true);
        ResultSummary summary = student.getResultSummary();
        System.out.println("\nResult summary:");
        System.out.println("USN: " + summary.getUSN());
        System.out.println("Name: " + summary.getName());
        System.out.println("Total: " + summary.getTotal());
        System.out.println("Average: " + summary.getAverage());
    }
}
