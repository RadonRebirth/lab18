package com.company;

import java.util.Scanner;

class Calc{
    private static Calc ex = new Calc();
    private double x;
    private double y;
    private Calc(){

    }
    public static Calc getInstance(){
        return ex;
    }
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double Calculate(){
        return (2 * x) + (3 / y);
    }
}

public class Main {
    public static void main(String[] args) {
        Calc ex = Calc.getInstance();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение x: ");
        ex.setX(in.nextDouble());
        System.out.println("Введите значение y: ");
        ex.setY(in.nextDouble());
        System.out.println("Результат " + ex.Calculate());
    }
}