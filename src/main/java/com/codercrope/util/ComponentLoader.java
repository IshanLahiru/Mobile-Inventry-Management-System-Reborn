package com.codercrope.util;

import com.codercrope.controler.components.ComponentCotnroller;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

import java.io.IOException;

public class ComponentLoader {
    public static ComponentCotnroller getAndLoadButton(GridPane grid, int column, int row) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ComponentLoader.class.getResource("/view/components/btn/BtnLogin.fxml"));
        Button root1 = (Button) fxmlLoader.load();
        ComponentCotnroller controller = (ComponentCotnroller) fxmlLoader.getController();
        grid.add(root1, column, row);
        return controller;
    }
    public static ComponentCotnroller getAndLoadTextBox(GridPane grid, int column, int row) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ComponentLoader.class.getResource("/view/components/text/TxtField.fxml"));
        TextField root1 = (TextField) fxmlLoader.load();
        ComponentCotnroller controller = (ComponentCotnroller) fxmlLoader.getController();
        grid.add(root1, column, row);
        return controller;
    }

    public static ComponentCotnroller getAndLoadWCU(BorderPane mainPane, String location, String component) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ComponentLoader.class.getResource("/view/components/"+component));
        GridPane root1 = (GridPane) fxmlLoader.load();
        ComponentCotnroller controller = (ComponentCotnroller) fxmlLoader.getController();
        //mainPane.setTop(root1);
        Node pane = (Node)root1;
        switch (location){
            case "TOP":
                mainPane.setTop(pane);
                System.out.println("ui set to the top");
                break;
            case "LEFT":
                mainPane.setLeft(pane);
                System.out.println("ui set to the left");
                break;
            case "RIGHT":
                mainPane.setRight(pane);
                System.out.println("ui set to the right");
                break;
            case "BOTTOM":
                mainPane.setBottom(pane);
                System.out.println("ui set to the bottom");
                break;
        }
               return controller;
    }
}
