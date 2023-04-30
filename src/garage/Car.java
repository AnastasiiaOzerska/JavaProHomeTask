package garage;

public class Car {
    private void StartElectricity(){
        System.out.println("Start electricity");
    }
    private void StartCommand(){
        System.out.println("Start command");

    }
    private void StartFuelSystem(){
        System.out.println("Start fuel system");
    }
    public void Start(){
        StartElectricity();
        StartCommand();
        StartFuelSystem();
    }
}
