import java.lang.reflect.Array;
import java.util.ArrayList;


class Customer{
    private String id;
    private String name;
    private String address;
    private double salary; // ALT + CTRL + SHIFT + T

    public Customer(String id, String name, String address, double salary) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public Customer() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}


public class Db {
    public static ArrayList<Customer> customerTable = new ArrayList<Customer>();
    static {
        customerTable.add(
                new Customer("C001","Nimal","Colombo",25000)
        );
        customerTable.add(
                new Customer("C002","Jagath","Panadura",75000)
        );
        customerTable.add(
                new Customer("C003","Saman","Colomb",50000)
        );

    }
}
