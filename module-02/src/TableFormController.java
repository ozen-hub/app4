import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;



public class TableFormController {

    public void initialize(){

        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colSalary.setCellValueFactory(new PropertyValueFactory<>("salary"));
        colOption.setCellValueFactory(new PropertyValueFactory<>("button"));

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
