package com.codercrope.controler;

import com.codercrope.controler.components.ComponentCotnroller;
import com.codercrope.util.*;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import org.kordamp.ikonli.javafx.FontIcon;

import java.io.IOException;

import static com.codercrope.util.Windows.LOGIN;
import static com.codercrope.util.Windows.RESET_PWD;

public class LoginController implements WindowController{

    public Button btnMin;
    public Button btnMax;
    public Button btnClose;
    public FontIcon iconMin;
    public FontIcon iconMax;
    public FontIcon iconClose;
    public ImageView imgTitleIcon;
    public Label lblTitle;
    @FXML
    private GridPane gridUtilities;

    @FXML
    private Label lblResetPwd;

    @FXML
    private Label lblWrongEmail;

    @FXML
    private Label lblWrongPwd;

    public void initialize() throws IOException {

        lblWrongPwd.setVisible(false);

        lblWrongEmail.setVisible(false);

        ComponentCotnroller controller = ComponentLoader.getAndLoadButton(gridUtilities,1, 6);
        controller.setController("Login", (WindowController) this, "LOGIN_OPERATION");

        ComponentCotnroller controller1 = ComponentLoader.getAndLoadTextBox(gridUtilities, 1, 2);
        controller1.setController("Add", (WindowController) this, "TXT_EMAIL");

        ComponentCotnroller controller2 = ComponentLoader.getAndLoadTextBox(gridUtilities, 1, 4);
        controller2.setController("Add", (WindowController) this, "TXT_USER_PWD");
    }


    @FXML
    void lblReserPwdOnMouseClick(MouseEvent event) throws IOException {
        Navigations.nav.navigate(RESET_PWD);


    }

    @Override
    public void performeActions(String task, Event actionEvent, String txtText) throws IOException {
        if (task != null) {
            switch (task) {
                case "TXT_USER_PWD":
                    boolean val = RegxValidator.checkRegex(task, txtText);
                    if (!val){
                        System.out.println("invalid password");
                    }else{
                        System.out.println("valid password");
                    }
                    break;
                case "TXT_EMAIL":
                    boolean val1 = RegxValidator.checkRegex(task, txtText);
                    if (!val1){
                        System.out.println("Invalid email");
                    }else{
                        System.out.println("Valid email");
                    }
                    break;
                case "LOGIN_OPERATION":
                    Navigations.nav.navigate(Windows.MAIN_WINDOW);
                    System.out.println("this is the main window");
                    break;
            }
        }
    }

    public void btnMinOnAction(ActionEvent actionEvent) {
    }

    public void btnMaxOnAction(ActionEvent actionEvent) {
    }

    public void btnCloseOnAction(ActionEvent actionEvent) {
    }
}
