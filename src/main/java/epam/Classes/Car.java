package epam.Classes;

public class Car {

    private String brand;
    private String model;
    private int date;
    private String color;
    private int price;
    private String regNum;

    public Car (){
        System.out.println("Создан пустой объект");
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        System.out.println("Брэнд авто: " + this.brand + " " + "Модель: " + this.model);
    }

    public Car(String brand, String model, int date, String color, int price, String regNum) {
        this.brand = brand;
        this.model = model;
        this.date = date;
        this.color = color;
        this.price = price;
        this.regNum = regNum;

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getRegNum() {
        return regNum;
    }

    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    @Override
    public String toString() {
        return "Car{" +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", date=" + date +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", regNum='" + regNum + '\'' +
                '}';
    }
}
