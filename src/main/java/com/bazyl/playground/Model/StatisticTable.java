package com.bazyl.playground.Model;

public class StatisticTable {

    final private StatisticRangeRow[] rows;
    final private int[] values;
    final private int[] rangeBounds;
    private int containedValues;
    private int uncontainedValues;

    public StatisticTable(int[] values, int[] rangeBounds) {
        this.values = values;
        this.rangeBounds = rangeBounds;
        rows = new StatisticRangeRow[rangeBounds.length - 1];
        containedValues = 0;
        uncontainedValues = 0;
    }

    public void calculate() {
        initRows();
        checkIn();
        evaluateAllContained();
        evaluateUncontained();
    }

    private void initRows() {
        for (int i = 0; i < rows.length; i++) {
            rows[i] = new StatisticRangeRow(rangeBounds[i], rangeBounds[i + 1]);
        }
    }

    private void checkIn() {
        for (StatisticRangeRow row : rows) {
            for (int value : values) {
                row.updateStatus(value);
            }
        }
    }

    private void evaluateAllContained() {
        for (StatisticRangeRow row : rows) {
            containedValues += row.getStatus();
        }
    }

    private void evaluateUncontained() {
        uncontainedValues = values.length - containedValues;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        for (StatisticRangeRow row : rows) {
            sb.append(row.toString()).append("\n");
        }
        sb.append("Out of range:").append(uncontainedValues);
        return sb.toString();
    }
}
