package chapter5.task2;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private List<Employee> employees = new ArrayList<>();

    public Department() {
        employees.add(new Employee("Sales Manager", "John Smith", "10.11.2013 - 12.02.2015"));
        employees.add(new Employee("Sales Manager", "Mark Miller", "04.05.2010 - 18.06.2015"));
        employees.add(new Employee("Sales Manager", "Mary Garcia", "09.12.2021 - until now"));
        employees.add(new Employee("Salesman", "Lucy Anderson", "15.03.2020 - until now"));
        employees.add(new Employee("Salesman", "David Moore", "02.04.2018 - 04.05.2020"));
        employees.add(new Employee("Salesman", "Sarah Jackson", "23.10.2017 - 06.12.2019"));
        employees.add(new Employee("Sales Inspectors", "Adam White", "09.02.2012 - 17.06.2016"));
        employees.add(new Employee("Sales Inspectors", "Donald Lee", "21.03.2020 - until now"));
        employees.add(new Employee("Sales Inspectors", "Elliot Harris", "212.09.2021 - 12.08.2022"));
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        return "Department of sales: " + employees;
    }

    public class Employee {
        private String employeePosition; // должность
        private String nameOfEmployee; // имя работника
        private String workPeriod; // период работы

        public Employee(String employeePosition, String nameOfEmployee, String workPeriod) {
            this.employeePosition = employeePosition;
            this.nameOfEmployee = nameOfEmployee;
            this.workPeriod = workPeriod;
        }

        @Override
        public String toString() {
            return "\n|Employee position: " + employeePosition + " |name of employee: " + nameOfEmployee +
                    " |word period: " + workPeriod;
        }
    }
}
