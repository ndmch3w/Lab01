package hust.soict.sec.aims.screen.controller;

import java.net.URL;
import java.util.ResourceBundle;

import hust.soict.sec.aims.media.CompactDisc;
import hust.soict.sec.aims.screen.AddTrack;
import hust.soict.sec.aims.store.Store;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class AddCDScreenController {

    private Store store;

    private CompactDisc CD;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnAddTrack;

    @FXML
    private Button btnSave;

    @FXML
    private Button btnAddCD;

    @FXML
    private TextField tfCategory;

    @FXML
    private TextField tfCost;
    @FXML
    private TextField tfLength;

    @FXML
    private TextField tfDirector;

    @FXML
    private TextField tfTitle;

    private boolean allFieldsFilled = false;


    public AddCDScreenController(Store store) {
        super();
        this.store = store;
    }


    @FXML
    void btnAddCDPressed(ActionEvent event) {
        store.addMedia(CD);
        tfTitle.clear();
        tfCategory.clear();
        tfDirector.clear();
        tfLength.clear();
        tfCost.clear();
        btnSave.setDisable(true);
        btnAddCD.setDisable(true);
        btnAddTrack.setDisable(true);
        Alert alert = new Alert(Alert.AlertType.INFORMATION, "CD has been added to the store!");
        alert.setTitle("Success");
        alert.setHeaderText(null);
        alert.showAndWait();
    }
    @FXML
    void btnAddTrackPressed(ActionEvent event) {
        new AddTrack(CD);
    }

    @FXML
    void btnSavePressed(ActionEvent event) {
        String title = tfTitle.getText();
        String category = tfCategory.getText();
        String director = tfDirector.getText();
        Integer length = 0;
        try {
            length = Integer.parseInt(tfLength.getText());
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR, "Failed to parse length!");
            alert.setTitle("Wrong type");
            alert.setHeaderText(null);
            alert.showAndWait();
            return;
        }
        Double cost = 0.0;
        try {
            cost = Double.parseDouble(tfCost.getText());
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR, "Failed to parse cost!");
            alert.setTitle("Wrong type");
            alert.setHeaderText(null);
            alert.showAndWait();
            return;
        }
        CD = new CompactDisc(title, category, director, length, cost);
        btnAddCD.setDisable(false);
        btnAddTrack.setDisable(false);
        btnSave.setDisable(true);
    }

    @FXML
    void initialize() {
        btnAddCD.setDisable(true);
        btnAddTrack.setDisable(true);

        tfTitle.textProperty().addListener((observable, oldValue, newValue) -> checkFieldsFilled());
        tfCategory.textProperty().addListener((observable, oldValue, newValue) -> checkFieldsFilled());
        tfDirector.textProperty().addListener((observable, oldValue, newValue) -> checkFieldsFilled());
        tfLength.textProperty().addListener((observable, oldValue, newValue) -> checkFieldsFilled());
        tfCost.textProperty().addListener((observable, oldValue, newValue) -> checkFieldsFilled());
    }

    private void checkFieldsFilled() {
        if (!tfTitle.getText().isEmpty() && !tfCategory.getText().isEmpty() && !tfDirector.getText().isEmpty() &&
                !tfCost.getText().isEmpty() && tfLength.getText().isEmpty()) {
            allFieldsFilled = true;
        } else {
            allFieldsFilled = false;
        }
    }


}