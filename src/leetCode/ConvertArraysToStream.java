package leetCode;

import java.util.*;
import java.util.stream.Collectors;

class Employee{
    String empId;
    String empName;

    Employee(String empId, String empName){
        this.empId=empId;
        this.empName=empName;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

}
public class ConvertArraysToStream {

    public static void main(String[] args) {

        List<Employee> details = Arrays.asList(
                new Employee("1","Vishal"),
                new Employee("2","Ramesh"),
                new Employee("3","Dinesh"),
                new Employee("3","Naresh"));
        for (Employee emp : details) {
            System.out.println("ID: " + emp.empId + ", Name: " + emp.empName);
        }

        Map<String, String> mapEmpDetails =
                details.stream().collect(Collectors.toMap(Employee::getEmpId, Employee::getEmpName,
                        (existing,duplicate)->existing));

        System.out.println(mapEmpDetails);
    }
}