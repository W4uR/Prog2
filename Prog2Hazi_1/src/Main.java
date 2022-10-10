import java.io.FileNotFoundException;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        CSVReader csvReader = new CSVReader();
        //csvReader.printCars();
        System.out.println("Feladat 1: ");
        csvReader.fromYear(1995);

        System.out.println("Feladat 2: ");
        csvReader.MileRange(5,30);

        System.out.println("Feladat 3: ");
        csvReader.lessPrice(9500);
    }
}