package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class Controller {

    @FXML
    private Text animalName;

    @FXML
    private Button buttonDog;

    @FXML
    private Button buttonCat;

    @FXML
    private Button buttonFish;

    public void clickDog(ActionEvent actionEvent) {
        animalName.setText("Give me a bone!");
    }

    public void clickFish(ActionEvent actionEvent) {
        animalName.setText("No hooks please!");
    }

    public void clickCat(ActionEvent actionEvent) {
        animalName.setText("Send more mice!");
    }

}