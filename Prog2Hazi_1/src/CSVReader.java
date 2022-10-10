import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CSVReader {
    public void printCars() throws FileNotFoundException{
        List<Car> carList = readCarsFromCSV();
        Collections.sort(carList);
        for(Car car: carList){
            System.out.println(car);
        }
    }


    private List<Car> readCarsFromCSV() throws FileNotFoundException{
        List<Car> result = new ArrayList<>();
        File file = new File("C:\\Users\\tasna\\Documents\\Prog2\\Car\\src\\ford_escort.csv");
        Scanner scanner = new Scanner(file);

        scanner.useDelimiter("\n");
        if(scanner.hasNext()){
            scanner.nextLine();
        }

        while (scanner.hasNext()){
            result.add(convertToCar(scanner.nextLine()));
        }
        return result;
    }
    //Feladat2
    public void fromYear(int year) throws FileNotFoundException{
        List<Car> carList = readCarsFromCSV();
        for(Car car: carList){
            if(car.getAge() == year) {
                System.out.println(car);
            }
        }
    }
    //Feladat3
    public void MileRange(int from,int to) throws FileNotFoundException{
        List<Car> carList = readCarsFromCSV();
        for(Car car: carList){
            if(car.getMile()<=to && car.getMile()>=from){
                System.out.println(car);
            }
        }
    }
    //Feladat4
    public void lessPrice(int price) throws FileNotFoundException{
        List<Car> carList = readCarsFromCSV();
        for(Car car: carList){
            if(car.getPrice() < price) {
                System.out.println(car);
            }
        }
    }
    private Car convertToCar(String line)
    {
        String newLine = line.trim();
        String[] fields = newLine.split(",\\s+");
        Car car = new Car();
        car.setAge(Integer.parseInt(fields[0]));
        car.setMile(Integer.parseInt(fields[1]));
        car.setPrice(Integer.parseInt((fields[2])));
        return car;
    }


}