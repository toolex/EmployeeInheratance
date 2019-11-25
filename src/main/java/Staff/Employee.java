package Staff;

public abstract class Employee {

    private String name;
    private String NINumber;
    private Double salary;

    public Employee(String name, String NINumber, Double salary){
        this.name = name;
        this.NINumber = NINumber;
        this.salary = salary;
    }

    public Double getSalary() {
        return this.salary;
    }

    public void setName(String name) {
        if (name != null){
        this.name = name;}
    }

    public String getName() {
        return this.name;
    }

    public String getNINumber() {
        return this.NINumber;
    }

    public Double raiseSalary(Double raiseAmount){
       if (raiseAmount > 0) {
           return (this.salary + raiseAmount);
       }
       return this.salary;
    }

    public Double payBonus(){
        return (this.salary + (this.salary/100));
    }

}
