import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class ComboBoxFormController {
    public TextField txtInputLanguage;
    public ComboBox<String> cmbLanguageList; // Object => String

    public void btnAddItemOnAction(ActionEvent actionEvent) {
        cmbLanguageList.getItems().add(txtInputLanguage.getText());
        txtInputLanguage.clear();
        txtInputLanguage.requestFocus();
    }
}
