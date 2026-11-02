public class Students{
    int rollNo;
    String name;
    void student(int r, String username){
        rollNo=r;
        name=username;
    }
    void display(){
        System.out.println("Roll No: " +rollNo+"\nName: " +name);
    }
    public static void main(String[] args){
        Students s1=new Students();
        Students s2=new Students();
        Students s3=new Students();
        Students s4=new Students();
        s1.student(100,"Thor");
        s2.student(101,"Spider Man");
        s3.student(103,"Tony Stark");
        s4.student(104,"Hulk");
        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
}