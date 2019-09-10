package com.modul2.controler;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class controler {
    public TextField txtlenght;
    public TextField txtwidth;
    public TextField txtradius;
    public TextField txtheight;
    public Button botsquare;
    public Button botball;
    public Button botube;
    boolean c, v, b;

    int luas, keliling, luaspermukaan, volume;


    public void SquareOnACtion(ActionEvent actionEvent) {
        txtradius.setDisable(true);
        txtlenght.setDisable(true);
        txtheight.setDisable(false);
        txtwidth.setDisable(false);
        c = true;
    }

    public void BallOnAction(ActionEvent actionEvent) {
        txtlenght.setDisable(true);
        txtheight.setDisable(true);
        txtwidth.setDisable(true);
        txtradius.setDisable(false);
        v = true;
    }

    public void TubeOnAction(ActionEvent actionEvent) {
        txtlenght.setDisable(true);
        txtwidth.setDisable(true);
        txtheight.setDisable(false);
        txtradius.setDisable(false);
        b = true;
    }

    public void submitOnAction(ActionEvent actionEvent) {
        if (c == true) {
            luas = Integer.valueOf(txtwidth.getText()) * Integer.valueOf(txtheight.getText());
            keliling = 2 * (Integer.valueOf(txtwidth.getText()) + Integer.valueOf(txtheight.getText()));
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("message");
            alert.setHeaderText("Message");
            alert.setContentText("luas = " + luas + " " + "keliling= " + keliling);
            alert.showAndWait();
            c = false;
            txtwidth.setText("");
            txtheight.setText("");
            txtradius.setDisable(false);
            txtlenght.setDisable(false);
        } else if (v == true) {
            luaspermukaan = (int) (4 * 3.14 * (Integer.valueOf(txtradius.getText()) ^ 2));
            volume =(int)((4/3)*3.14*(Integer.valueOf(txtradius.getText()) ^ 3)) ;
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("message");
            alert.setHeaderText("Message");
            alert.setContentText("luas permukaan = " + luaspermukaan + " " + "volume= " + volume);
            alert.showAndWait();
            v = false;
            txtradius.setText("");
            txtlenght.setDisable(false);
            txtheight.setDisable(false);
            txtwidth.setDisable(false);
        } else if (b == true) {
            luaspermukaan = (int) (2*3.14*Integer.valueOf(txtradius.getText())*(Integer.valueOf(txtradius.getText()+Integer.valueOf(txtheight.getText()))));
            volume = (int) (3.14*(Integer.valueOf(txtradius.getText())^2)*Integer.valueOf(txtheight.getText()));
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("message");
            alert.setHeaderText("Message");
            alert.setContentText("luas permukaan= " + luaspermukaan + " " + "volume= " + volume);
            alert.showAndWait();
            b = false;
            txtheight.setText("");
            txtradius.setText("");
            txtlenght.setDisable(false);
            txtwidth.setDisable(false);

        }
    }

}
