package epam.Classes;

/*
Создать классы, спецификации которых приведены ниже.
Определить конструкторы и методы setТип(), getТип(), toString().
Определить дополнительно методы в классе, создающем массив объектов.
Задать критерий выбора данных и вывести эти данные на консоль.
В каждом классе, обладающем информацией, должно быть объявлено несколько конструкторов.

8. Car: id, Марка, Модель, Год выпуска, Цвет, Цена, Регистрационный номер.
Создать массив объектов. Вывести:
a) список автомобилей заданной марки;
b) список автомобилей заданной модели, которые эксплуатируются больше n лет;
c) список автомобилей заданного года выпуска, цена которых больше указанной.
 */

public class MainTask {
    public static void main(String[] args) {
        Car[] cars = new Car[15];
        cars[0] = new Car("BMW", "3", 2000, "black", 5000, "WBAA60501020" );
        cars[1] = new Car("BMW", "5", 2001, "dark-black", 6000, "WBFF3249823)" );
        cars[2] = new Car("AUDI", "A4", 2001, "Dark-blue", 4000, "TESDFSDG3030" );
        cars[3] = new Car("AUDI", "A6", 2003, "Red", 5500, "DSGLSKD134235" );
        cars[4] = new Car("Volkswagen", "Passat", 2010, "White", 10000, "XQAFGS12030" );
        cars[5] = new Car("Volkswagen", "Golf-GTS", 2015, "White", 15000, "XQADSF124398" );
        cars[6] = new Car("Lada", "Vesta", 2020, "Green", 11000, "AFSSRA902300" );
        cars[7] = new Car("Lada", "1", 1985, "Orange", 500, "ASDSDF12434" );
        cars[8] = new Car("Toyota", "Land cruiser", 2020, "Black", 30000, "ASDfFS325454300" );
        cars[9] = new Car("Toyota", "Camry", 2000, "Silver", 6500, "BDMNDSDDF12434" );
        cars[10] = new Car("Toyota", "Camry", 2020, "Black", 26000, "BDMA4323423434" );
        cars[11] = new Car("Toyota", "Camry", 2010, "Green", 16000, "BMWER234F12434" );

        //а)ищем ладу.
        Car findBrandResult = null;
        String brand = "Lada";
        for (Car car : cars) {
            if (car != null && car.getBrand() != null && car.getBrand().toLowerCase().equals(brand.toLowerCase())) {
                findBrandResult = car;
                System.out.println("Search " + brand + ":" + findBrandResult);
            }
        }

        //b)ищем модель Camry, которая эксплуатируется больше n=10 лет.
        Car searchModel = null;
        int n = 10;
        String model = "Camry";
        for (Car car : cars) {
            if (car != null && car.getModel() != null && car.getModel().toLowerCase().equals(model.toLowerCase()) && 2021-car.getDate() > n ) {
                searchModel = car;
                System.out.println("Search " + model + " Older 10 years" + ":" + searchModel);
            }
        }

        //c) список автомобилей заданного года выпуска, цена которых больше указанной.
        Car searchCarByYearAndPrice = null;
        int year = 2000;
        int price = 4000;
        for (Car car : cars) {
            if (car != null && car.getDate() > 0 && car.getDate() == year && car.getPrice() > price ) {
                searchCarByYearAndPrice = car;
                System.out.println("Search car year: " + year + " price more than:" + price + ":" + searchCarByYearAndPrice);
            }
        }
    }
}

