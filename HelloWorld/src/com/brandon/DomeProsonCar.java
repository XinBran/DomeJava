package com.brandon;

public class DomeProsonCar {
    public static void main(String[] args) {
        Proson proson = new Proson("xin",24);
        Car car = new Car("VW",500000.00);
        proson.setCar(car);//设置car
        car.setProson(proson);//设置proson
        System.out.println(car.getProson().getInfo());
        System.out.println(proson.getCar().getInfo());

    }
}
class Proson{
    private String name;
    private int age;
    private Car car;
    public Proson(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNname() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
    public void setCar(Car car){
        this.car = car;
    }
    public Car getCar(){
        return this.car;
    }
    public String getInfo(){
        return "name:" + this.name + "\tage:" + this.age;
    }
}
class Car{
    private String name;
    private double price;
    private Proson proson;
    public Car(String name,double price){
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setProson(Proson proson) {
        this.proson = proson;
    }

    public Proson getProson() {
        return this.proson;
    }
    public String getInfo(){
        return "name:" + this.name + "\tprice:" + this.price;
    }
}