package uz.pdp.topshiriq._1;

public class Number implements Cloneable{
    private String number;
    private int quwat;  // ot kuchida

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getQuwat() {
        return quwat;
    }

    public void setQuwat(int quwat) {
        this.quwat = quwat;
    }

    public Number(String number, int quwat) {
        this.number = number;
        this.quwat = quwat;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Number{" +
                "number='" + number + '\'' +
                ", quwat=" + quwat +
                '}';
    }
}
