package javaoo.ootwo.inheritance;

public class RaceCar extends Car{
    private final boolean isTurbo;
    public RaceCar(String model, String brand, String color, int seats, boolean isTurbo) {
        super(model, brand, color, seats);
        this.isTurbo = isTurbo;
    }

    @Override
    public String carDetails() {
        return super.carDetails() + "\nTurbo: " + isTurbo;
    }
}
