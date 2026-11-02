
class University {

    String universityName = "Cambridge Institute of Technology";

    void displayUniversity() {

        System.out.println("University: " + universityName);
    }

    static class Department {

        String departmentName;

        Department(String name) {
            departmentName = name;
        }

        void displayDepartment() {

            System.out.println("Department: " + departmentName);
        }
    }

    class Faculty {

        String facultyName;
        String designation;

        Faculty(String name, String designation) {

            facultyName = name;
            this.designation = designation;
        }

        void displayFaculty() {

            System.out.println("Faculty Name: " + facultyName);
            System.out.println("Designation: " + designation);
        }
    }
}

public class College {

    public static void main(String[] args) {

        University.Department d1 =
            new University.Department("Computer Science");

        University u1 = new University();

        University.Faculty f1 =
            u1.new Faculty("Rahul", "Professor");

        u1.displayUniversity();

        d1.displayDepartment();

        f1.displayFaculty();
    }
}
