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

public class UpdateEmployee {

    public static void updateEmployeeScene() throws Exception{
        Stage stage = new Stage();
        stage.setMinWidth(600);
        stage.setMinHeight(282);
        stage.setMaxWidth(600);
        stage.setMinHeight(282);
        Parent root = FXMLLoader.load(UpdateEmployee.class.getResource("updateEmployee.fxml"));
        stage.setScene(new Scene(root, 600,282));
        stage.show();
    }
    @FXML
    Button updateButton;
    @FXML
    TextField idField, nameField, surnameField, positionField, ageField, salaryField;
    @FXML
    Label errorLabel;
    public void handleUpdateEmployeeButton(ActionEvent actionButton) {
        if(actionButton.getSource() == updateButton){
            if(idField.getText().isEmpty() || nameField.getText().isEmpty() || surnameField.getText().isEmpty() ||  positionField.getText().isEmpty() ||
                    ageField.getText().isEmpty() || salaryField.getText().isEmpty()){

                errorLabel.setText("Empty data. Complete all fields!");
            } else {
                //update data to Database

                //close scene
                Stage stage = (Stage) updateButton.getScene().getWindow();
                stage.close();
            }
        }
    }
}
