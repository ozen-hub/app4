import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

class CustomerTm{
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

public class TableFormController {

    public void initialize(){
        loadCustomers();
    }

    private void loadCustomers() {
        ObservableList<CustomerTm> tmList= FXCollections.observableArrayList();
        for (Customer c:Db.customerTable
             ) {
            Button btn= new Button("Delete");
            CustomerTm tm= new CustomerTm(c.getId(),c.getName(),c.getAddress(),c.getSalary(),btn);
            tmList.add(tm);
        }
        tblCustomer.setItems(tmList);
    }

    public TableView<CustomerTm> tblCustomer;
    public TableColumn colId;
    public TableColumn colName;
    public TableColumn colAddress;
    public TableColumn colOption;
    public TableColumn colSalary;
}
