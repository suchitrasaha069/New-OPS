import java.util.Scanner;

class Employee{
  int emp_id;
  String emp_name;

  void setData (int id, String name){
    this.emp_id = id;
    this.emp_name = name;
  }

  void getData (){
    System.out.println("Employee Data \nId: "+this.emp_id+"\nName: "+this.emp_name);  
  }

  Employee (int id, String name){
    this.emp_id = id;
    this.emp_name = name;
  }
}

public class employeeData{
  public static void main (String args[]){
    // System.out.println("This is body!");
    // Employee emp1 = new Employee(1, "Ram");   // Parameterised constructor
    // emp1.getData();    //  Using getter method
    
    // emp1.setData(2, "Shyam");  // Using setter method
    // emp1.getData();    //  Using getter method

    System.out.print("Enter Employee id : ");
    emp_id = input.nextInt();
    input.nextLine();
    System.out.print("Enter Employee name : ");
    emp_name = input.nextLine();
    Employee emp = new Emp(emp_id, emp_name);

    emp.getData();
  }
}
