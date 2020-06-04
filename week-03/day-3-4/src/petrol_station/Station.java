package petrol_station;

public class Station {
//    Station
//            gasAmount
//    refill(car) -> decreases the gasAmount by the capacity of the car and increases the cars gasAmount

    int gasAmount;

    public void refill(Car car){
        gasAmount-= car.capacity;
        car.gasAmount+= car.capacity;
    }

}
