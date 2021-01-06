package makeOfCars;
import factory.Car;
public class BMW implements Car {
    @Override
    public void print() {
        System.out.println("BMW: \"hello\"");
    }
}

