package com.codercrope.util;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static com.codercrope.util.Windows.*;

public class Navigation {
    public HashMap<Windows, Stage> windows;

    public Navigation() {
        this.windows =new HashMap<Windows,Stage>();
    }

    public void InitNavigation() throws IOException {
        /*FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/Login.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        //((ItemMoreDetailViewController) fxmlLoader.getController()).getObject(item.getOb());
        Stage stage = new Stage();
        stage.setTitle("Main window");
        stage.setScene(new Scene(root1));
        windows.put(WINDOW01,stage);
        stage.show();*/
        navigate(LOGIN);
    }

    public void navigate(Windows window) throws IOException {
        switch (window){
            case LOGIN:
                if (windows.containsKey(LOGIN)) {
                    System.out.println("returning the previous made window 1");
                    windows.get(LOGIN).show();
                    closeWindowsExcept(LOGIN);
                }else{
                    initWindow("Login.fxml",LOGIN);
                   // windows.get(LOGIN).initStyle(StageStyle.UNIFIED);
                    /*FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/Login.fxml"));
                    Parent root1 = (Parent) fxmlLoader.load();
                    //((ItemMoreDetailViewController) fxmlLoader.getController()).getObject(item.getOb());
                    System.out.println("Initializing the window 1 ");
                    Stage stage = new Stage();
                    stage.setTitle("Window main");
                    stage.initStyle(StageStyle.UNDECORATED);
                    stage.setScene(new Scene(root1));
                    windows.put(LOGIN,stage);
                    stage.show();
                    closeWindowsExcept(LOGIN);*/
                }
                break;
            case RESET_PWD:
                if (windows.containsKey(RESET_PWD)) {
                    System.out.println("returning the previous made window 2");
                    windows.get(RESET_PWD).show();
                }else{
                    initWindow("ResetPwd.fxml",RESET_PWD);
                    /*FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/ResetPwd.fxml"));
                    Parent root1 = (Parent) fxmlLoader.load();
                    //((ItemMoreDetailViewController) fxmlLoader.getController()).getObject(item.getOb());
                    System.out.println("Initializing reset pwd 2 ");
                    Stage stage = new Stage();
                    stage.setTitle("Window2");
                    stage.setScene(new Scene(root1));
                    windows.put(RESET_PWD,stage);
                    stage.show();
                    closeWindowsExcept(RESET_PWD);*/
                }
                break;
            case MAIN_WINDOW:
                if (windows.containsKey(MAIN_WINDOW)) {
                    System.out.println("returning the previous made main window");
                    windows.get(MAIN_WINDOW).show();
                }else{
                    initWindow("MainWindow.fxml",MAIN_WINDOW);
                    /*FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/ResetPwd.fxml"));
                    Parent root1 = (Parent) fxmlLoader.load();
                    //((ItemMoreDetailViewController) fxmlLoader.getController()).getObject(item.getOb());
                    System.out.println("Initializing reset pwd 2 ");
                    Stage stage = new Stage();
                    stage.setTitle("Window2");
                    stage.setScene(new Scene(root1));
                    windows.put(RESET_PWD,stage);
                    stage.show();
                    closeWindowsExcept(RESET_PWD);*/
                }
                break;
        }
    }

    private void initWindow(String location, Windows window) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/"+location));
        Parent root1 = (Parent) fxmlLoader.load();
        //((ItemMoreDetailViewController) fxmlLoader.getController()).getObject(item.getOb());
        //System.out.println("Initializing the window 1 ");
        Stage stage = new Stage();
        stage.setTitle("Window");
       // stage.initStyle(StageStyle.UNDECORATED);
        stage.setScene(new Scene(root1));
        windows.put(window,stage);
        stage.show();
        closeWindowsExcept(window);
    }

    private void closeWindowsExcept(Windows window) {
        for (Map.Entry<Windows, Stage> entry : windows.entrySet()) {
            if (entry.getKey() != window){
                entry.getValue().hide();
            }
        }
    }
}
