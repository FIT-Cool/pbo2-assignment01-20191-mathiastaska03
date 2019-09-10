package com.modul1.controler;

/**
 * @author Mathias karunia putra taska(1472054)
 */

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Random;

public class controler {

    public ImageView imageUser;
    public ImageView ImageComputer;
    public TextField txtwin;
    public TextField txtdraw;
    public TextField txtlose;

    int kalah = 0;
    int menang = 0;
    int seri = 0;
    int hasil = 0;
    int pilihan = 0;

    Image kertas = new Image("com/modul1/images/kertas.png");
    Image gunting = new Image("com/modul1/images/gunting.png");
    Image batu = new Image("com/modul1/images/batu.png");


    public void botPaperonaction(ActionEvent actionEvent) {
        pilihan = 1;
        Random random = new Random();
        int angkaAcak = random.nextInt(3);
        imageUser.setImage(kertas);
        if (angkaAcak == 0) {
            ImageComputer.setImage(kertas);
            seri = seri + 1;
            txtdraw.setText(Integer.toString(seri));
        } else if (angkaAcak == 1) {
            ImageComputer.setImage(batu);
            menang = menang + 1;
            txtwin.setText(Integer.toString(menang));
        } else if (angkaAcak == 2) {
            ImageComputer.setImage(gunting);
            kalah = kalah + 1;
            txtlose.setText(Integer.toString(kalah));
        }

    }

    public void botrockOnAction(ActionEvent actionEvent) {
        pilihan = 2;
        Random random = new Random();
        int angkaAcak = random.nextInt(3);
        imageUser.setImage(batu);
        if (angkaAcak == 0) {
            ImageComputer.setImage(kertas);
            kalah = kalah + 1;
            txtlose.setText(Integer.toString(kalah));
        } else if (angkaAcak == 1) {
            ImageComputer.setImage(batu);
            seri = seri + 1;
            txtdraw.setText(Integer.toString(seri));
        } else if (angkaAcak == 2) {
            ImageComputer.setImage(gunting);
            menang = menang + 1;
            txtwin.setText(Integer.toString(menang));
        }
    }

    public void botScissOnAction(ActionEvent actionEvent) {
        pilihan = 3;
        Random random = new Random();
        int angkaAcak = random.nextInt(3);
        imageUser.setImage(gunting);
        if (angkaAcak == 0) {
            ImageComputer.setImage(kertas);
            menang = menang + 1;
            txtwin.setText(Integer.toString(menang));
        } else if (angkaAcak == 1) {
            ImageComputer.setImage(batu);
            kalah = kalah + 1;
            txtlose.setText(Integer.toString(kalah));
        } else if (angkaAcak == 2) {
            ImageComputer.setImage(gunting);
            seri = seri + 1;
            txtdraw.setText(Integer.toString(seri));
        }
    }

    public void botExitOnAction(ActionEvent actionEvent) {
        Platform.exit();
    }
}
