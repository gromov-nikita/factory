public class Runner {
    public static void main(String[] args) {
        CarFactory creater = new CarFactory();
        creater.create("BMW").print();
        creater.create("Mercedes").print();
    }
}
