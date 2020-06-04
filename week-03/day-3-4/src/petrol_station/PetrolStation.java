package petrol_station;

public class PetrolStation {
//    Create Station and Car classes
//            Station
//    gasAmount
//    refill(car) -> decreases the gasAmount by the capacity of the car and increases the cars gasAmount
//    Car
//            gasAmount
//    capacity
//    create constructor for Car where:
//    initialize gasAmount -> 0
//    initialize capacity -> 100

    public static void main(String[] args) {
        Station petrolStation = new Station();
        petrolStation.gasAmount = 1000;
        Car trabant = new Car();

        petrolStation.refill(trabant);

        System.out.println(petrolStation.gasAmount);
        System.out.println(trabant.gasAmount);
    }

}
