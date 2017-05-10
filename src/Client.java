
public class Client {
    public static void main(String[]args){
        BuilderInterface builder=new Builder();
        Director director=new Director(builder);
        director.build("Red",4);
        Car car=builder.returnCar();
        System.out.println("Car built ! Color= "+car.getColor()+" with wheels ="+car.getWheels());
    }
}
