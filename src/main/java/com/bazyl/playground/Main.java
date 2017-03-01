package com.bazyl.playground;

import com.bazyl.playground.Controller.Controller;
import com.bazyl.playground.View.View;

public class Main {

    public static void main(String[] args) {
        View view = new View();
        Controller controller = new Controller(view);
        controller.doSomeAction();
    }
}
