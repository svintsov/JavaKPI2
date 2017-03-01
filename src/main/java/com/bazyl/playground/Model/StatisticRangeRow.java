package com.bazyl.playground.Model;

import com.google.common.collect.Range;

public class StatisticRangeRow {

    private final int lowerBound;
    private final int upperBound;
    private int status;

    public StatisticRangeRow(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    public void updateStatus(final int value) {
        if (Range.closedOpen(lowerBound, upperBound).contains(value)) {
            status++;
        }
    }

    @Override
    public String toString() {
        return "StatisticRangeRow{" +
                "lowerBound=" + lowerBound +
                ", upperBound=" + upperBound +
                ", status=" + status +
                '}';
    }

    public int getStatus() {
        return status;
    }
}
