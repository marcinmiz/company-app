package bit.javaoop;

import bit.javaoop.employees.Employee;
import bit.javaoop.headquarters.Company;
import bit.javaoop.managers.BudgetManager;
import bit.javaoop.managers.EmployeeManager;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("CodeMasters", "Zbyszek");

        BudgetManager budgetManager = new BudgetManager("Maciek", 50_000, 400_000);
        company.getCeo().hireManagers(budgetManager);
        EmployeeManager employeeManager = new EmployeeManager("Krzysiek", 40_000, 20);
        company.getCeo().hireManagers(employeeManager);

        Employee employee1 = new Employee("Wacek", 20_000);

        if (budgetManager.canHireEmployee()) {
            budgetManager.hireEmployee(employee1);
        }
        Employee employee2 = new Employee("Leszek", 18_000);
        if (employeeManager.canHireEmployee()) {
            employeeManager.hireEmployee(employee2);
        }
        Employee employee3 = new Employee("Grzesiek", 16_000);
        if (budgetManager.canHireEmployee()) {
            budgetManager.hireEmployee(employee3);
        }
        Employee employee4 = new Employee("Frodo", 14_000);
        if (employeeManager.canHireEmployee()) {
            employeeManager.hireEmployee(employee4);
        }


        System.out.println(company.toString());
    }
}