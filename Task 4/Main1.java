
class TeamMember {
    protected String name;

    public TeamMember(String name) {
        this.name = name;
    }
}


interface BonusEligible {
    void calculateBonus();
}


class Employee extends TeamMember implements BonusEligible {

    public Employee(String name) {
        super(name);
    }

    @Override
    public void calculateBonus() {
        System.out.println(name + " receives employee bonus.");
    }
}


class Contractor extends TeamMember {

    public Contractor(String name) {
        super(name);
    }

    public void work() {
        System.out.println(name + " works as a contractor.");
    }
}


public class Main1 {
    public static void main(String[] args) {

        Employee employee = new Employee("Alice");
        Contractor contractor = new Contractor("Bob");

        employee.calculateBonus();
        contractor.work();
    }
}
