package github.JulianNSH.Employees;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddEmployee {

    public static void addEmployeeScene() throws Exception{
        Stage stage = new Stage();
        stage.setMinWidth(600);
        stage.setMinHeight(282);
        stage.setMaxWidth(600);
        stage.setMinHeight(282);
        Parent root = FXMLLoader.load(AddEmployee.class.getResource("addEmployee.fxml"));
        stage.setScene(new Scene(root, 600,282));
        stage.show();
    }

    @FXML
    Button addButton;
    @FXML
    TextField idField, nameField, surnameField, positionField, ageField, salaryField;
    @FXML
    Label errorLabel;
    public void handleAddEmployeeButton(ActionEvent actionButton) {
        if(actionButton.getSource() == addButton){
            if(idField.getText().isEmpty() || nameField.getText().isEmpty() ||
                    surnameField.getText().isEmpty() ||  positionField.getText().isEmpty() ||
                    ageField.getText().isEmpty() || salaryField.getText().isEmpty()){

                errorLabel.setText("Empty data. Complete all fields");
            } else {
                //insert data to Database

                //close scene
                Stage stage = (Stage) addButton.getScene().getWindow();
                stage.close();
            }
        }
    }
}
