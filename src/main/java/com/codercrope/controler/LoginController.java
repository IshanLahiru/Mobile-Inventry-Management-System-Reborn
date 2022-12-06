package com.codercrope.controler;

import com.codercrope.controler.components.ComponentCotnroller;
import com.codercrope.util.Navigation;
import com.codercrope.util.Navigations;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

import java.io.IOException;

import static com.codercrope.util.Windows.LOGIN;
import static com.codercrope.util.Windows.RESET_PWD;

public class LoginController implements WindowController{

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

        ComponentCotnroller controller = getAndLoadButton(1, 6);
        controller.setController("Login", (WindowController) this, "TASK_PRINT");

        ComponentCotnroller controller1 = getAndLoadTextBox(1, 2);
        controller1.setController("Add", (WindowController) this, "TASK_PRINT");

        ComponentCotnroller controller2 = getAndLoadTextBox(1, 4);
        controller2.setController("Add", (WindowController) this, "TASK_PRINT");
    }

    public ComponentCotnroller getAndLoadButton(int column, int row) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/btn/BtnLogin.fxml"));
        Button root1 = (Button) fxmlLoader.load();
        ComponentCotnroller controller = (ComponentCotnroller) fxmlLoader.getController();
        gridUtilities.add(root1, column, row);
        return controller;
    }
    public ComponentCotnroller getAndLoadTextBox(int column, int row) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/text/TxtField.fxml"));
        TextField root1 = (TextField) fxmlLoader.load();
        ComponentCotnroller controller = (ComponentCotnroller) fxmlLoader.getController();
        gridUtilities.add(root1, column, row);
        return controller;
    }

    @FXML
    void lblReserPwdOnMouseClick(MouseEvent event) throws IOException {
        Navigations.nav.navigate(RESET_PWD);


    }

    @Override
    public void performeActions(String text, Event actionEvent, String txt) throws IOException {

    }
}
