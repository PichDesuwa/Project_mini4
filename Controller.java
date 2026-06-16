import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private RadioButton D1;

    @FXML
    private RadioButton D2;

    @FXML
    private RadioButton D3;

    @FXML
    private DatePicker birth2;

    @FXML
    private Button button;

    @FXML
    private CheckBox c1;

    @FXML
    private CheckBox c2;

    @FXML
    private CheckBox c3;

    @FXML
    private TextField name1;

    @FXML
    private Label result;

    @FXML
    void onbutton(ActionEvent event) {
        String name = name1.getText();
        String birth = birth2.getValue().toString();
        String department="";
        if(D1.isSelected()) {
            department = "GTR";
        } else if(D2.isSelected()) {
            department = "Gic";
        } else if(D3.isSelected()) {
            department = "GEE";
        }
        ArrayList<String> courses = new ArrayList<>();
        if(c1.isSelected()) {
            courses.add("OS");
        }
        if(c2.isSelected()) {
            courses.add("OOP");
        if(c3.isSelected()) {
            courses.add("Network");
        }
    }
    result.setText("Name: " + name + "\nBirth: " + birth + "\nDepartment: " + department + "\nCourses: " + String.join(", ", courses));
}

}


