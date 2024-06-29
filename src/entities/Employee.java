package entities;

/**
 * @author joaovictorcmd
 * @date 2024 Jun 28
 */
public class Employee {
    private Integer id;
    private String name;
    private Double salary;

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double percentage) {
        double increase = getSalary() * percentage / 100;
        setSalary(increase + getSalary());
    }

    @Override
    public String toString() {
        return String.format("#%d, %s, R$%.2f", this.id, this.name.toUpperCase(), this.salary);
    }
}
