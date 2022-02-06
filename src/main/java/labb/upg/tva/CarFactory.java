package labb.upg.tva;

public class CarFactory {

    public Car typ(String type) {
        return switch (type) {
            case "big" -> new Big();
            case "small" -> new Small();
            case "medium" -> new Medium();
            default -> null;
        };
    }
}
