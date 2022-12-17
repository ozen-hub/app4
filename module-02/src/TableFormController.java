import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.Optional;


public class TableFormController {

    public void initialize() {

        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colSalary.setCellValueFactory(new PropertyValueFactory<>("salary"));
        colOption.setCellValueFactory(new PropertyValueFactory<>("button"));

        loadCustomers();
    }

    private void loadCustomers() {
        ObservableList<CustomerTm> tmList = FXCollections.observableArrayList();
        for (Customer c : Db.customerTable
        ) {
            Button btn = new Button("Delete");
            CustomerTm tm = new CustomerTm(c.getId(), c.getName(), c.getAddress(), c.getSalary(), btn);

            btn.setOnAction((e) -> {
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION,
                        "Are you sure?", ButtonType.YES, ButtonType.NO);
                //alert.show();
                Optional<ButtonType> type =alert.showAndWait();
                if (type.get()==ButtonType.YES){
                    Db.customerTable.remove(c);
                    new Alert(Alert.AlertType.INFORMATION, "Deleted!").show();
                    loadCustomers();
                }

            });

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
