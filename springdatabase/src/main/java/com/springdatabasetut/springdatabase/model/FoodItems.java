package com.springdatabasetut.springdatabase.model;

public class FoodItems {

   private int fid;
   private String fname;
   private float fprice;

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public float getFprice() {
        return fprice;
    }

    public void setFprice(float fprice) {
        this.fprice = fprice;
    }

    @Override
    public String toString() {
        return "FoodItems{" +
                "fid=" + fid +
                ", fname='" + fname + '\'' +
                ", fprice=" + fprice +
                '}';
    }
}
