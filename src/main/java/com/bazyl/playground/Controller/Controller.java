package com.bazyl.playground.Controller;

import com.bazyl.playground.Model.InvalidInputFormatException;
import com.bazyl.playground.Model.StatisticTable;
import com.bazyl.playground.View.View;

public class Controller {

    final private View view;
    private StatisticTable statisticTable;

    public Controller(View view) {
        this.view = view;
    }

    public void doSomeAction() {
        initData();
        statisticTable.calculate();
        view.printMessage(statisticTable.toString());
    }

    private void checkInput(final int[] ranges)
            throws InvalidInputFormatException {
        if (ranges.length < 2) {
            throw new InvalidInputFormatException(View.RANGE_EXCEPTION);
        }
    }

    private void initData() {
        try {
            final int[] values = {1, 3, 5, 7, 10};
            final int[] ranges = {0, 2, 5, 9};
            checkInput(ranges);
            statisticTable = new StatisticTable(values, ranges);
        } catch (InvalidInputFormatException error) {
            view.printMessage("Exception caught:" + error);
        }

    }
}
