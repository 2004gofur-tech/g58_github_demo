package uz.pdp.topshiriq._1;

public final class Auto {
    private final String brand;
    private final String name;
    private final Number number;

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public Number getNumber() throws CloneNotSupportedException {
        return (Number) number.clone();
    }

    public Auto(String brand, String name, Number number) throws CloneNotSupportedException {
        this.brand = brand;
        this.name = name;
        this.number = (Number) number.clone();
    }

    @Override
    public String toString() {
        return "Auto{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
