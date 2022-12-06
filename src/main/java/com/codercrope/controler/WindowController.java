package com.codercrope.controler;

import javafx.event.Event;

import java.io.IOException;

public interface WindowController {
    public void performeActions(String text, Event actionEvent, String txt) throws IOException;
}
