package ExtractSubclass;

class LaborItem extends JobItem {
    final int unitPrice;

    LaborItem(int quantity, int unitPrice) {
        super(quantity);

        this.unitPrice = unitPrice;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public int getTotalPrice() {
        return quantity * getUnitPrice();
    }

}

abstract class JobItem {
    protected final int quantity;

    protected JobItem(int quantity) {

        this.quantity = quantity;
    }

    public int getTotalPrice() {
        return quantity * getUnitPrice();
    }

    public abstract int getUnitPrice();
}

class PartsItem extends JobItem {
    private final int employeeRate;


    public PartsItem(int quantity, int employeeRate) {
        super(quantity);

        this.employeeRate = employeeRate;
    }

    public int getTotalPrice() {
        return quantity * getUnitPrice();
    }


    public int getUnitPrice() {
        return employeeRate;
    }

}

class Employee {
    private final int rate;

    public Employee(int rate) {
        this.rate = rate;
    }

    public int getRate() {
        return rate;
    }
}


class Main {

    public static void main(String[] args) {
// Somewhere in client code
        Employee kent = new Employee(50);
        JobItem j1 = new PartsItem(5, kent.getRate());
        JobItem j2 = new LaborItem(15, 10);
        int total = j1.getTotalPrice() + j2.getTotalPrice();

        System.out.print("total: ");
        System.out.println(total);
    }
}
