package com.bazyl.playground.Controller;

import com.bazyl.playground.View.View;

public class Controller {

    View view;


    public Controller(View view) {
        this.view = view;
    }

    public void doSomeAction() {
        view.printMessage("Test work");
    }
}
