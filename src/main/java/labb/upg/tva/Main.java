package labb.upg.tva;

public class Main {

    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        var car1 = carFactory.typ("small");
        var car2 = carFactory.typ("big");
        var car3 = carFactory.typ("medium");
        System.out.println(car1.getCar());
        System.out.println(car2.getCar());
        System.out.println(car3.getCar());

    }
}
