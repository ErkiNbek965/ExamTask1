import com.sun.jdi.LocalVariable;

import java.time.LocalDate;
import java.util.Scanner;

public class Car {
    private String model;
    private long yearOfIssue;
    private int price;
    private Body body;


    public Car(String model, long yearOfIssue, int price, Body body) {
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.price = price;
        this.body = body;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public long getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(long yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public void determinationoYearOfManufacture() {

        a = 0;
        for (int i = 0; i < a; i++) {
            if (a - yearOfIssue) ;

        }

    }
    int a = LocalDate.now().getYear();


        public void bodyTypeIdentification () {


            switch (getBody()) {
                case HETCH:
                    System.out.println("Легковая машина ");
                    break;

                case SEDAN:
                    System.out.println("Легковая машина");
                    break;

                case KROSSOVER:
                    System.out.println("Внедорожник");
                    break;
                case VNEDOROJNIK:
                    System.out.println("Внедорожник");
                    break;
                case UNIVERSAL:
                    System.out.println("Универсал");
                default:


            }


        }


        @Override
        public String toString () {
            return "Car: " +
                    " model = " + model + '\n' +
                    " yearOfIssue = " + yearOfIssue + '\n' +
                    " price=" + price + '\n' +
                    " body=" + body;
        }
    }


