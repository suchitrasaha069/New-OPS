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
    this.setData(id, name);
  }
}

public class employeeData{
  public static void main (String args[]){
    // System.out.println("This is body!");
    // Employee emp1 = new Employee(1, "Ram");   // Parameterised constructor
    // emp1.getData();    //  Using getter method
    
    // emp1.setData(2, "Shyam");  // Using setter method
    // emp1.getData();    //  Using getter method

    Scanner input = new Scanner(System.in);
    int n, i, emp_id;
    String emp_name;

    System.out.print("Enter the Number of Employees : ");
    n = input.nextInt();

    Employee[] emp = new Employee[n];
    
    for (i=0; i<n; i++)
    {
      System.out.print("Employee " + (i+1) + "-->\nEnter Employee id : ");
      emp_id = input.nextInt();
      input.nextLine();
      System.out.print("Enter Employee name : ");
      emp_name = input.nextLine();
      emp[i] = new Employee(emp_id, emp_name);
    }

    System.out.print("\nShowing data ---\n\n");

    for (i=0; i<n; i++)
    {
      emp[i].getData(i+1);
    }

    // emp.getData();
  }
}
