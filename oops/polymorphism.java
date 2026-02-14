package oops;
//overide functionalities but we still use all else

//base Class
class Vehicle{
    String numberOfVehicle;

    public Vehicle(String numberOfVehicle){
        this.numberOfVehicle=numberOfVehicle;
    }
     public void printHonk(){
        System.out.println("Honk ! ! ! ! ! ");
    }
    public void printVehicleNumber(){
        System.out.println(numberOfVehicle);
    }
}
//Derived Class
class Car extends Vehicle{
    // private String numberOfCar;

    public Car(String numberOfCar){
        super(numberOfCar);
        System.out.println("welcome to SageTravels");
    }
    @Override
    public void printHonk(){
        System.out.println("give me pass mfssss");
    }
}

class Bus extends Vehicle{
    // private String numberOfBus;

    public Bus(String numberOfBus){
        super(numberOfBus); 
        System.out.println("welcome to SageTravels");  
    }
}

public class polymorphism {
    public static void main(String[] args) {
     Car car1 = new Car("1234");
     car1.printVehicleNumber();
     car1.printHonk();   

     Bus bus1 = new Bus("1231");
     bus1.printVehicleNumber();
    }
}
