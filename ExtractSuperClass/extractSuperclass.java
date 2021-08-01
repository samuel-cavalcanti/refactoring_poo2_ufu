package ExtractSuperClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;


abstract class Party {
    protected final String name;

    protected Party(String name) {
        this.name = name;
    }

    abstract public int getAnnualCost();

    abstract public int getHeadCount();

}


class Employee extends Party {

    private int annualCost;
    private String id;

    public Employee(String name, String id, int annualCost) {
        super(name);
        this.id = id;
        this.annualCost = annualCost;
    }

    public int getAnnualCost() {
        return annualCost;
    }

    @Override
    public int getHeadCount() {
        return 1;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

class Department extends Party {

    private List<Employee> staff = new ArrayList<Employee>();

    public Department(String name) {
        super(name);

    }

    @Override
    public int getAnnualCost() {
        int result = 0;
        for (Employee each : staff) {
            result += each.getAnnualCost();
        }
        return result;
    }

    @Override
    public int getHeadCount() {
        return staff.size();
    }

    public Enumeration<Employee> getStaff() {
        // return staff.elements();
        return Collections.enumeration(staff);
    }

    public void addEmployee(Employee arg) {
        staff.add(arg);
    }

    public String getName() {
        return name;
    }
}