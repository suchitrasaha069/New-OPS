class Employee{
  int emp_id;
  String emp_name;

  Employee (int id, String name){
    this.emp_id = id;
    this.emp_name = name;
  }
}

public class employeeData{
  public static void main (String args[]){
    // System.out.println("This is body!");
    Employee emp1 = new Employee(1, "Ram");
  }
}
