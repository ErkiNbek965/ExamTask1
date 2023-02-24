import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Tesla",2020,45000,Body.SEDAN);
        System.out.println(car);
   /*     Car car1 = new Car("Passat B5",1998,20000,Body.SEDAN);
        System.out.println(car1);
        Car car2 = new Car("Honda Fit",2003,4000,Body.HETCH);
        System.out.println(car2);*/
    /*    Car car3 = new Car("Ford F 150",2017,95000,Body.VNEDOROJNIK);
        System.out.println(car3);
        Car car4 = new Car("Audi RS 6",2017,35000,Body.UNIVERSAL);
        System.out.println(car4);
        Car car5 = new Car("Honda SR-V",2004,7000,Body.KROSSOVER);
        System.out.println(car5);*/
        // car2.bodyTypeIdentification();
        car.getYearOfIssue();
        car.determinationoYearOfManufacture();
    }
}
