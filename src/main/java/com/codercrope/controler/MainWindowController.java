package com.codercrope.controler;

import com.codercrope.controler.components.ComponentCotnroller;
import com.codercrope.util.ComponentLoader;
import javafx.event.Event;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

import java.io.IOException;

public class MainWindowController implements WindowController {
    public BorderPane mainPane;
    public GridPane topBar;

    public void initialize() throws IOException {
        ComponentCotnroller topBar = ComponentLoader.getAndLoadWCU(mainPane, "TOP", "MainWindowTopBar.fxml");
        ComponentCotnroller leftNavBar = ComponentLoader.getAndLoadWCU(mainPane, "LEFT", "MainWindowSideBar.fxml");

    }

    @Override
    public void performeActions(String text, Event actionEvent, String txt) throws IOException {

    }
}
