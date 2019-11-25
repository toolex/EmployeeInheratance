package Staff.management;

public class Director extends Manager {
    private Double budget;

    public Director(String name, String NINumber, Double salary, String deptName, Double budget){
        super(name, NINumber, salary, deptName);
        this.budget = budget;
    }

    public Double getBudget() {
        return this.budget;
    }

    public Double payBonus(){
        return (getSalary() + (getSalary()/100 * 2));
    }
}
