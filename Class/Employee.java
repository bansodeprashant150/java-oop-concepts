public class Employee {

    int id;
    String name;
    int salary;

    Employee(int id, String name, int salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
}

    void displayDetails(){

        System.out.println("name is: "+name);
        System.out.println("salary is: "+salary);

    }
    void yearlySalary(){
        System.out.println("Yearly Salary is :"+ salary*12);
    }
    void increaseSalary(int amount){
        salary+=amount;
        System.out.println("increase: "+ amount);
        System.out.println("updated salary: "+salary);
    }

    public static void main(String[] args) {
        Employee emp1=new Employee(1,"Prashant",19000);
        Employee emp2=new Employee(2,"Gaju",19000);
        Employee emp3=new Employee(3,"Rohit",29000);
       emp1.displayDetails();
       emp1.yearlySalary();
       emp1.increaseSalary(4000);
       emp2.displayDetails();
       emp2.yearlySalary();
       emp2.increaseSalary(3600);
       emp3.displayDetails();
       emp3.yearlySalary();
       emp3.increaseSalary(7000);

        
    }
}
