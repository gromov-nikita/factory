public class CarFactory {
    public Car create(String car) {
        if(car.equals("BMW")){
            return new BMW();
        }
        else{
            if(car.equals("Mercedes")) {
                return new Mercedes();
            }
            else{
                return null;
            }
        }
    }
}
