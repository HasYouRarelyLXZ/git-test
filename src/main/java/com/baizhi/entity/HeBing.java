package com.baizhi.entity;

public class HeBing {
    private int i;
    private double d;
    private boolean flag;

    public HeBing(int i, double d, boolean flag) {
        this.i = i;
        this.d = d;
        this.flag = flag;
    }

    public HeBing() {
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "HeBing{" +
                "i=" + i +
                ", d=" + d +
                ", flag=" + flag +
                '}';
    }
}
