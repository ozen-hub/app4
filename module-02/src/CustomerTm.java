import javafx.scene.control.Button;

public class CustomerTm{
    private String id;
    private String name;
    private String address;
    private double salary; // ALT + CTRL + SHIFT + T
    private Button button;

    public CustomerTm(String id, String name, String address, double salary, Button button) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.button = button;
    }

    public CustomerTm() {
    }

    public Button getButton() {
        return button;
    }

    public void setButton(Button button) {
        this.button = button;
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