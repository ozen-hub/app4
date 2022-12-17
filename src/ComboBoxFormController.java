import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class ComboBoxFormController {
    public TextField txtInputLanguage;
    public ComboBox<String> cmbLanguageList;

    public void initialize(){
        ObservableList<String> obList = FXCollections.observableArrayList();
        obList.addAll("Java","Php","C++","Rust","Ruby","Dart");
        cmbLanguageList.setItems(obList);
    }

    public void btnAddItemOnAction(ActionEvent actionEvent) {
        cmbLanguageList.getItems().add(txtInputLanguage.getText());
        txtInputLanguage.clear();
        txtInputLanguage.requestFocus();
    }
}
