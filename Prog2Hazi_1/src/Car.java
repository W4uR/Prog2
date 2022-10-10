import java.io.FileNotFoundException;
import java.util.Collections;

public class Car implements Comparable<Car> {
    private int age;
    private int mile;
    private int price;

    public Car() {}

    public Car(int age, int mile, int price) {
        this.age = age;
        this.mile = mile;
        this.price = price;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMile() {
        return mile;
    }

    public void setMile(int mile) {
        this.mile = mile;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "age=" + age +
                ", mile=" + mile +
                ", price=" + price +
                '}';
    }

    //Feladat 1
    @Override
    public int compareTo(Car o) {
        if (this.age == o.age) {
            if (this.mile == o.mile) {
                return 0;
            } else if (this.mile < o.mile) {
                return -1;
            } else {
                return 1;
            }

        } else if (this.age < o.age) {
            return -1;
        }else{
            return 1;
        }
    }


}