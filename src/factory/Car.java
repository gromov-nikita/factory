package factory;
public interface Car {
    static void printMakeOfCar() {
        for(Cars car : Cars.values()){
            System.out.println(car);
        }
    }
    static void printMakeOfCar(int n) {
        for(Cars car : Cars.values()){
            System.out.println(car + " " + n);
        }
    }
    void print();
}
