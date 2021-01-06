package makeOfCars;
import factory.Car;
public class Mercedes implements Car {
    @Override
    public void print() {
        System.out.println("Mercedes: \"hello\"");
    }
}
