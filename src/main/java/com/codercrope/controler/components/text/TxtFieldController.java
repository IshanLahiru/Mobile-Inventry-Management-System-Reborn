package com.codercrope.controler.components.text;

import com.codercrope.controler.WindowController;
import com.codercrope.controler.components.ComponentCotnroller;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

import java.io.IOException;

public class TxtFieldController implements ComponentCotnroller {
    public TextField txt;
    private WindowController controller;
    private String task;
    @Override
    public void setController(String add, WindowController controller, String task) {
        this.controller = controller;
        this.task = task;
    }


    public void txtOnAction(ActionEvent actionEvent) throws IOException {
        controller.performeActions(this.task,actionEvent,txt.getText());
    }

    public void txtKeyRelesedEvent(KeyEvent keyEvent) throws IOException {
        controller.performeActions(this.task,keyEvent,txt.getText());
    }
}
