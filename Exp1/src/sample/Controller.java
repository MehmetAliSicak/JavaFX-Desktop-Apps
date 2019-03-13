package sample;


import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


import java.net.URL;
import java.util.ResourceBundle;

public class Controller {

    private Integer x, y;
    private Operations operations = new Operations();
    @FXML
    private TextField tf_n1;

    @FXML
    private TextField tf_n2;

    @FXML
    private Label result;

    @FXML
    private ComboBox cb;

    @FXML
    private URL location;

    @FXML
    private ResourceBundle resources;


    @FXML
    private void calculator() {
        x = Integer.parseInt(tf_n1.getText());
        y = Integer.parseInt(tf_n2.getText());
        String islem = cb.getSelectionModel().getSelectedItem().toString();
        switch (islem) {
            case "Topla":
                result.setText("Sonuç:" + operations.add(x, y));
                break;
            case "Çıkar":
                result.setText("Sonuç:" + operations.sub(x, y));
                break;
            case "Çarp":
                result.setText("Sonuç:" + operations.mult(x, y));
                break;
            case "Böl":
                result.setText("Sonuç:" + operations.div(x, y));
                break;
        }

    }

    void setData() {
        cb.getItems().clear();
        cb.getItems().addAll("Topla", "Çıkar", "Çarp", "Böl");

    }
}



