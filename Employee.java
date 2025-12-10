/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sirianindividualcoding;

/**
 *
 * @author uzuki
 */
public class Employee {

    private Integer employee_id;
    private String employee_name;
    private Double employee_salary;

    public Employee(Integer employee_id, String employee_name, Double employee_salary) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.employee_salary = employee_salary;
    }

    public Integer getEmployeeId() {
        return employee_id;
    }

    public void setEmployeeId(Integer employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployeeName() {
        return employee_name;
    }

    public void setEmployeeName(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getEmployeeSalary() {
        return String.format("₱%,.2f", employee_salary);
    }
}


    public String getSalaryLevel() {
        if (employee_salary < 20000) return "Low";
        else if (employee_salary <= 50000) return "Medium";
        else return "High";
}
