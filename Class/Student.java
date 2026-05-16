public class Student {

    String name;
    int rollno;
    int marks;
    void displayDetails(){
        System.out.println("name ="+name);
        System.out.println("Roll No="+rollno);
        System.out.println("Marks="+marks);
    }
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Prashant";
        s1.rollno=22;
        s1.marks=98;
        s1.displayDetails();
    }
}
