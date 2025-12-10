/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sirianindividualcoding;


import java.util.Scanner;

public class SirIanIndividualCoding {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Emloyee Creation;");

        System.out.print("Enter Employee ID: ");
        Integer empId = s.nextInt();
        s.nextLine();

        System.out.print("Enter Employee Name: ");
        String empName = s.nextLine();

        System.out.print("Enter Employee Salary: ");
        Double empSalary = s.nextDouble();

        Employee employee = new Employee(empId, empName, empSalary);

        System.out.println("Employee Created:");
        System.out.println("ID: " + employee.getEmployeeId());
        System.out.println("Name: " + employee.getEmployeeName());
        System.out.println("Salary: " + employee.getEmployeeSalary());
        
        System.out.println(" ");
        System.out.println("CAR CREATION;");
        s.nextLine();

        System.out.print("Enter Company Name: ");
        String company = s.nextLine();

        System.out.print("Enter Model Name: ");
        String model = s.nextLine();

        System.out.print("Enter Year: ");
        Integer year = s.nextInt();

        System.out.print("Enter Mileage: ");
        Double mileage = s.nextDouble();

        Car car = new Car(company, model, year, mileage);
         System.out.println(" ");
        System.out.println("Car Created:");
        System.out.println("Company: " + car.getCompanyName());
        System.out.println("Model: " + car.getModelName());
        System.out.println("Year: " + car.getYear());
        System.out.println("Total distance traveled: " + car.getMileage());

        s.close();
    }
}

