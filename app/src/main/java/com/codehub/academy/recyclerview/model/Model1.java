package com.codehub.academy.recyclerview.model;

import java.util.Objects;

public class Model1 extends Model {
    private String var1;
    private String var2;

    public Model1(String var1, String var2) {
        this.var1 = var1;
        this.var2 = var2;
    }

    public String getVar1() {
        return var1;
    }

    public void setVar1(String var1) {
        this.var1 = var1;
    }

    public String getVar2() {
        return var2;
    }

    public void setVar2(String var2) {
        this.var2 = var2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Model1 model1 = (Model1) o;
        return Objects.equals(var1, model1.var1) &&
                Objects.equals(var2, model1.var2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(var1, var2);
    }

    @Override
    public String toString() {
        return "Model1{" +
                "var1='" + var1 + '\'' +
                ", var2='" + var2 + '\'' +
                '}';
    }
}
