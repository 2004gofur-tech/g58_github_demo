package uz.pdp.topshiriq;

import uz.pdp.topshiriq._1.Auto;
import uz.pdp.topshiriq._1.Number;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {


       // m1();

    }

    private static void m1() throws CloneNotSupportedException {
        Auto auto = new Auto("BMW", "M5", new Number("10| A 123 AA uz", 1000));
        System.out.println(auto);

        auto.getNumber().setQuwat(6000);
        System.out.println(auto);
    }
}
