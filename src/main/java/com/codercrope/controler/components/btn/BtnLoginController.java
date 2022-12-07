package com.codercrope.controler.components.btn;

import com.codercrope.controler.WindowController;
import com.codercrope.controler.components.ComponentCotnroller;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;

import java.io.IOException;

public class BtnLoginController implements ComponentCotnroller {
    public Button btnLogin;
    private WindowController controller;
    private String task;

    public void btnLoginOnAction(ActionEvent actionEvent) throws IOException {
        controller.performeActions(this.task, actionEvent, "NOT_A_TEXT_COMPONENT");
    }

    @Override
    public void setController(String add, WindowController controller, String task) {
        btnLogin.setText(add);
        this.controller = controller;
        this.task = task;

    }
}
