package sirianindividualcoding;

import java.util.Scanner;

public class SirIanIndividualCoding {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


        System.out.println(" EMPLOYEE CREATION !!");

        System.out.print("Enter Employee ID: ");
        Integer empId = s.nextInt();
        s.nextLine();

        System.out.print("Enter Employee Name: ");
        String empName = s.nextLine();

        System.out.print("Enter Employee Salary: ");
        Double empSalary = s.nextDouble();

        Employee employee = new Employee(empId, empName, empSalary);
        System.out.println("----------------------------------------------");
        System.out.println("\nEmployee Created:");
        System.out.println("ID: " + employee.getEmployeeId());
        System.out.println("Name: " + employee.getEmployeeName());
        System.out.println("Salary: " + employee.getEmployeeSalary());

   
        System.out.println("Salary Level: " + employee.getSalaryLevel());

       
        System.out.print("Enter salary increase percentage: ");
        Double increasePercent = s.nextDouble();
        employee.increaseSalary(increasePercent);
        System.out.println("New Salary after increase: " + employee.getEmployeeSalary());

      
        System.out.println("Is employee taxable? " + employee.isTaxable());

      
        System.out.println("Employee Short Info: " + employee.getShortInfo());
        System.out.println("----------------------------------------------");
        System.out.println("CAR CREATION !!");
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

        System.out.println("\nCar Created:");
        System.out.println("Company: " + car.getCompanyName());
        System.out.println("Model: " + car.getModelName());
        System.out.println("Year: " + car.getYear());
        System.out.println("Mileage: " + car.getMileage());


        System.out.println("Car Age: " + car.getCarAge() + " years");

        System.out.println("Mileage Category: " + car.getMileageCategory());

       
        System.out.println("Is Classic Car? " + car.isClassic());

        
        System.out.println("Full Car Description: " + car.getFullDescription());

        s.close();
    }
}

