
public class Builder implements BuilderInterface {
    Car car;
    public Builder(){
        car=new Car();
    }

    @Override
    public void settingWheels(int n) {
        car.setWheels(n);
    }

    @Override
    public void settingColors(String s) {
        car.setColor(s);
    }
    public Car returnCar(){
        return car;
    }
}
