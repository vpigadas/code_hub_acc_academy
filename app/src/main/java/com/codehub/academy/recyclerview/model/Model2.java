package com.codehub.academy.recyclerview.model;

import java.util.Objects;

public class Model2 extends Model{

    private int var1;
    private int var2;

    public Model2(int var1, int var2) {
        this.var1 = var1;
        this.var2 = var2;
    }

    public int getVar1() {
        return var1;
    }

    public void setVar1(int var1) {
        this.var1 = var1;
    }

    public int getVar2() {
        return var2;
    }

    public void setVar2(int var2) {
        this.var2 = var2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Model2 model2 = (Model2) o;
        return var1 == model2.var1 &&
                var2 == model2.var2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(var1, var2);
    }

    @Override
    public String toString() {
        return "Model2{" +
                "var1=" + var1 +
                ", var2=" + var2 +
                '}';
    }
}
