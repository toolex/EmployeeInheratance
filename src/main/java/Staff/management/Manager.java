package Staff.management;

import Staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String name, String NINumber, Double salary, String deptName){
        super(name, NINumber, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return this.deptName;
    }
}
